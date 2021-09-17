package main

import (
	"context"
	"os"
	"path"
	"reflect"
	"strings"
	"testing"

	"github.com/getkin/kin-openapi/openapi3"
	"github.com/getkin/kin-openapi/openapi3gen"
	"github.com/hashicorp/go-hclog"
	"github.com/hashicorp/nomad/api"
	"github.com/hashicorp/nomad/command/agent"

	"github.com/stretchr/testify/require"
)

func TestBuildFromModel(t *testing.T) {
	builder := specBuilder{
		logger: hclog.Default(),
	}

	s, err := builder.buildSpec()
	require.NoError(t, err)
	require.NotNil(t, s)
	require.NotNil(t, s.Model)
	require.NotNil(t, s.Model.Components)

	yamlBytes, err := s.ToBytes()
	require.NoError(t, err)
	yaml := string(yamlBytes)

	outputPath := path.Join(t.TempDir(), "test-build-from-model.yaml")
	outputPath = path.Join("./", "test-build-from-model.yaml")
	err = os.WriteFile(outputPath, yamlBytes, 0644)
	require.NoError(t, err)
	require.NotEmpty(t, yaml)
	require.Contains(t, yaml, jobResponseSchema)

	loader := openapi3.NewLoader()
	model, err := loader.LoadFromFile(outputPath)
	require.NoError(t, err)
	require.NotNil(t, model)

	err = model.Validate(context.Background())
	require.NoError(t, err)
}

func TestSchemaRefs(t *testing.T) {
	builder := specBuilder{
		logger: hclog.Default(),
		kingen: openapi3gen.NewGenerator(openapi3gen.UseAllExportedFields()),
		spec: &spec{
			Model: openapi3.T{
				Components: openapi3.Components{
					Schemas: openapi3.Schemas{},
				},
			},
		},
	}

	ref, err := builder.getOrCreateSchemaRef(reflect.TypeOf(api.CSISnapshot{}))
	require.NoError(t, err)
	require.NotNil(t, ref)

	builder.resolveRefPaths()

	require.Equal(t, "#/components/schemas/CSISecrets", ref.Value.Properties["Secrets"].Ref)
}

func TestSchemaMaps(t *testing.T) {
	builder := specBuilder{
		logger: hclog.Default(),
		kingen: openapi3gen.NewGenerator(openapi3gen.UseAllExportedFields()),
		spec: &spec{
			Model: openapi3.T{
				Components: openapi3.Components{
					Schemas: openapi3.Schemas{},
				},
			},
		},
	}

	ref, err := builder.getOrCreateSchemaRef(reflect.TypeOf(agent.ClientConfig{}))
	require.NoError(t, err)
	require.NotNil(t, ref)

	var foundSchemaRef *openapi3.SchemaRef
	builder.resolveRefPaths()

	for refKey, schemaRef := range builder.spec.Model.Components.Schemas {
		if strings.Contains(refKey, "ChrootEnv") {
			foundSchemaRef = schemaRef
		}
	}

	require.NotNil(t, foundSchemaRef)
}

var jobResponseSchema = `
    JobRegisterResponse:
      properties:
        EvalCreateIndex:
          maximum: 1.8446744073709552e+19
          minimum: 0
          type: integer
        EvalID:
          type: string
        JobModifyIndex:
          maximum: 1.8446744073709552e+19
          minimum: 0
          type: integer
        KnownLeader:
          type: boolean
        LastContact:
          format: int64
          type: integer
        LastIndex:
          maximum: 1.8446744073709552e+19
          minimum: 0
          type: integer
        RequestTime:
          format: int64
          type: integer
        Warnings:
          type: string
      type: object
`
