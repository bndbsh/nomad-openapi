/*
Nomad

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

API version: 1.1.4
Contact: support@hashicorp.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"bytes"
	"context"
	"io/ioutil"
	"net/http"
	"net/url"
	"strings"
)


// ScalingApiService ScalingApi service
type ScalingApiService service

type ApiGetScalingPoliciesRequest struct {
	ctx context.Context
	ApiService *ScalingApiService
	region *string
	namespace *string
	index *int32
	wait *string
	stale *string
	prefix *string
	xNomadToken *string
	perPage *int32
	nextToken *string
}

// Filters results based on the specified region.
func (r ApiGetScalingPoliciesRequest) Region(region string) ApiGetScalingPoliciesRequest {
	r.region = &region
	return r
}

// Filters results based on the specified namespace.
func (r ApiGetScalingPoliciesRequest) Namespace(namespace string) ApiGetScalingPoliciesRequest {
	r.namespace = &namespace
	return r
}

// If set, wait until query exceeds given index. Must be provided with WaitParam.
func (r ApiGetScalingPoliciesRequest) Index(index int32) ApiGetScalingPoliciesRequest {
	r.index = &index
	return r
}

// Provided with IndexParam to wait for change.
func (r ApiGetScalingPoliciesRequest) Wait(wait string) ApiGetScalingPoliciesRequest {
	r.wait = &wait
	return r
}

// If present, results will include stale reads.
func (r ApiGetScalingPoliciesRequest) Stale(stale string) ApiGetScalingPoliciesRequest {
	r.stale = &stale
	return r
}

// Constrains results to jobs that start with the defined prefix
func (r ApiGetScalingPoliciesRequest) Prefix(prefix string) ApiGetScalingPoliciesRequest {
	r.prefix = &prefix
	return r
}

// A Nomad ACL token.
func (r ApiGetScalingPoliciesRequest) XNomadToken(xNomadToken string) ApiGetScalingPoliciesRequest {
	r.xNomadToken = &xNomadToken
	return r
}

// Maximum number of results to return.
func (r ApiGetScalingPoliciesRequest) PerPage(perPage int32) ApiGetScalingPoliciesRequest {
	r.perPage = &perPage
	return r
}

// Indicates where to start paging for queries that support pagination.
func (r ApiGetScalingPoliciesRequest) NextToken(nextToken string) ApiGetScalingPoliciesRequest {
	r.nextToken = &nextToken
	return r
}

func (r ApiGetScalingPoliciesRequest) Execute() ([]ScalingPolicyListStub, *http.Response, error) {
	return r.ApiService.GetScalingPoliciesExecute(r)
}

/*
GetScalingPolicies Method for GetScalingPolicies

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiGetScalingPoliciesRequest
*/
func (a *ScalingApiService) GetScalingPolicies(ctx context.Context) ApiGetScalingPoliciesRequest {
	return ApiGetScalingPoliciesRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return []ScalingPolicyListStub
func (a *ScalingApiService) GetScalingPoliciesExecute(r ApiGetScalingPoliciesRequest) ([]ScalingPolicyListStub, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  []ScalingPolicyListStub
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "ScalingApiService.GetScalingPolicies")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/scaling/policies"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if r.region != nil {
		localVarQueryParams.Add("region", parameterToString(*r.region, ""))
	}
	if r.namespace != nil {
		localVarQueryParams.Add("namespace", parameterToString(*r.namespace, ""))
	}
	if r.wait != nil {
		localVarQueryParams.Add("wait", parameterToString(*r.wait, ""))
	}
	if r.stale != nil {
		localVarQueryParams.Add("stale", parameterToString(*r.stale, ""))
	}
	if r.prefix != nil {
		localVarQueryParams.Add("prefix", parameterToString(*r.prefix, ""))
	}
	if r.perPage != nil {
		localVarQueryParams.Add("per_page", parameterToString(*r.perPage, ""))
	}
	if r.nextToken != nil {
		localVarQueryParams.Add("next_token", parameterToString(*r.nextToken, ""))
	}
	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	if r.index != nil {
		localVarHeaderParams["index"] = parameterToString(*r.index, "")
	}
	if r.xNomadToken != nil {
		localVarHeaderParams["X-Nomad-Token"] = parameterToString(*r.xNomadToken, "")
	}
	if r.ctx != nil {
		// API Key Authentication
		if auth, ok := r.ctx.Value(ContextAPIKeys).(map[string]APIKey); ok {
			if apiKey, ok := auth["X-Nomad-Token"]; ok {
				var key string
				if apiKey.Prefix != "" {
					key = apiKey.Prefix + " " + apiKey.Key
				} else {
					key = apiKey.Key
				}
				localVarHeaderParams["X-Nomad-Token"] = key
			}
		}
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

type ApiGetScalingPolicyRequest struct {
	ctx context.Context
	ApiService *ScalingApiService
	policyID string
	region *string
	namespace *string
	index *int32
	wait *string
	stale *string
	prefix *string
	xNomadToken *string
	perPage *int32
	nextToken *string
}

// Filters results based on the specified region.
func (r ApiGetScalingPolicyRequest) Region(region string) ApiGetScalingPolicyRequest {
	r.region = &region
	return r
}

// Filters results based on the specified namespace.
func (r ApiGetScalingPolicyRequest) Namespace(namespace string) ApiGetScalingPolicyRequest {
	r.namespace = &namespace
	return r
}

// If set, wait until query exceeds given index. Must be provided with WaitParam.
func (r ApiGetScalingPolicyRequest) Index(index int32) ApiGetScalingPolicyRequest {
	r.index = &index
	return r
}

// Provided with IndexParam to wait for change.
func (r ApiGetScalingPolicyRequest) Wait(wait string) ApiGetScalingPolicyRequest {
	r.wait = &wait
	return r
}

// If present, results will include stale reads.
func (r ApiGetScalingPolicyRequest) Stale(stale string) ApiGetScalingPolicyRequest {
	r.stale = &stale
	return r
}

// Constrains results to jobs that start with the defined prefix
func (r ApiGetScalingPolicyRequest) Prefix(prefix string) ApiGetScalingPolicyRequest {
	r.prefix = &prefix
	return r
}

// A Nomad ACL token.
func (r ApiGetScalingPolicyRequest) XNomadToken(xNomadToken string) ApiGetScalingPolicyRequest {
	r.xNomadToken = &xNomadToken
	return r
}

// Maximum number of results to return.
func (r ApiGetScalingPolicyRequest) PerPage(perPage int32) ApiGetScalingPolicyRequest {
	r.perPage = &perPage
	return r
}

// Indicates where to start paging for queries that support pagination.
func (r ApiGetScalingPolicyRequest) NextToken(nextToken string) ApiGetScalingPolicyRequest {
	r.nextToken = &nextToken
	return r
}

func (r ApiGetScalingPolicyRequest) Execute() (*ScalingPolicy, *http.Response, error) {
	return r.ApiService.GetScalingPolicyExecute(r)
}

/*
GetScalingPolicy Method for GetScalingPolicy

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @param policyID The scaling policy identifier.
 @return ApiGetScalingPolicyRequest
*/
func (a *ScalingApiService) GetScalingPolicy(ctx context.Context, policyID string) ApiGetScalingPolicyRequest {
	return ApiGetScalingPolicyRequest{
		ApiService: a,
		ctx: ctx,
		policyID: policyID,
	}
}

// Execute executes the request
//  @return ScalingPolicy
func (a *ScalingApiService) GetScalingPolicyExecute(r ApiGetScalingPolicyRequest) (*ScalingPolicy, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *ScalingPolicy
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "ScalingApiService.GetScalingPolicy")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/scaling/policy/{policyID}"
	localVarPath = strings.Replace(localVarPath, "{"+"policyID"+"}", url.PathEscape(parameterToString(r.policyID, "")), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if r.region != nil {
		localVarQueryParams.Add("region", parameterToString(*r.region, ""))
	}
	if r.namespace != nil {
		localVarQueryParams.Add("namespace", parameterToString(*r.namespace, ""))
	}
	if r.wait != nil {
		localVarQueryParams.Add("wait", parameterToString(*r.wait, ""))
	}
	if r.stale != nil {
		localVarQueryParams.Add("stale", parameterToString(*r.stale, ""))
	}
	if r.prefix != nil {
		localVarQueryParams.Add("prefix", parameterToString(*r.prefix, ""))
	}
	if r.perPage != nil {
		localVarQueryParams.Add("per_page", parameterToString(*r.perPage, ""))
	}
	if r.nextToken != nil {
		localVarQueryParams.Add("next_token", parameterToString(*r.nextToken, ""))
	}
	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	if r.index != nil {
		localVarHeaderParams["index"] = parameterToString(*r.index, "")
	}
	if r.xNomadToken != nil {
		localVarHeaderParams["X-Nomad-Token"] = parameterToString(*r.xNomadToken, "")
	}
	if r.ctx != nil {
		// API Key Authentication
		if auth, ok := r.ctx.Value(ContextAPIKeys).(map[string]APIKey); ok {
			if apiKey, ok := auth["X-Nomad-Token"]; ok {
				var key string
				if apiKey.Prefix != "" {
					key = apiKey.Prefix + " " + apiKey.Key
				} else {
					key = apiKey.Key
				}
				localVarHeaderParams["X-Nomad-Token"] = key
			}
		}
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}
