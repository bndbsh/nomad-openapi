# NomadClient::ConsulUpstream

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **datacenter** | **String** |  | [optional] |
| **destination_name** | **String** |  | [optional] |
| **local_bind_address** | **String** |  | [optional] |
| **local_bind_port** | **Integer** |  | [optional] |
| **mesh_gateway** | [**ConsulMeshGateway**](ConsulMeshGateway.md) |  | [optional] |

## Example

```ruby
require 'nomad_client'

instance = NomadClient::ConsulUpstream.new(
  datacenter: null,
  destination_name: null,
  local_bind_address: null,
  local_bind_port: null,
  mesh_gateway: null
)
```

