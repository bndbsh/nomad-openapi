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


// EvaluationsApiService EvaluationsApi service
type EvaluationsApiService service

type ApiGetEvaluationRequest struct {
	ctx context.Context
	ApiService *EvaluationsApiService
	evalID string
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
func (r ApiGetEvaluationRequest) Region(region string) ApiGetEvaluationRequest {
	r.region = &region
	return r
}

// Filters results based on the specified namespace.
func (r ApiGetEvaluationRequest) Namespace(namespace string) ApiGetEvaluationRequest {
	r.namespace = &namespace
	return r
}

// If set, wait until query exceeds given index. Must be provided with WaitParam.
func (r ApiGetEvaluationRequest) Index(index int32) ApiGetEvaluationRequest {
	r.index = &index
	return r
}

// Provided with IndexParam to wait for change.
func (r ApiGetEvaluationRequest) Wait(wait string) ApiGetEvaluationRequest {
	r.wait = &wait
	return r
}

// If present, results will include stale reads.
func (r ApiGetEvaluationRequest) Stale(stale string) ApiGetEvaluationRequest {
	r.stale = &stale
	return r
}

// Constrains results to jobs that start with the defined prefix
func (r ApiGetEvaluationRequest) Prefix(prefix string) ApiGetEvaluationRequest {
	r.prefix = &prefix
	return r
}

// A Nomad ACL token.
func (r ApiGetEvaluationRequest) XNomadToken(xNomadToken string) ApiGetEvaluationRequest {
	r.xNomadToken = &xNomadToken
	return r
}

// Maximum number of results to return.
func (r ApiGetEvaluationRequest) PerPage(perPage int32) ApiGetEvaluationRequest {
	r.perPage = &perPage
	return r
}

// Indicates where to start paging for queries that support pagination.
func (r ApiGetEvaluationRequest) NextToken(nextToken string) ApiGetEvaluationRequest {
	r.nextToken = &nextToken
	return r
}

func (r ApiGetEvaluationRequest) Execute() (*Evaluation, *http.Response, error) {
	return r.ApiService.GetEvaluationExecute(r)
}

/*
GetEvaluation Method for GetEvaluation

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @param evalID Evaluation ID.
 @return ApiGetEvaluationRequest
*/
func (a *EvaluationsApiService) GetEvaluation(ctx context.Context, evalID string) ApiGetEvaluationRequest {
	return ApiGetEvaluationRequest{
		ApiService: a,
		ctx: ctx,
		evalID: evalID,
	}
}

// Execute executes the request
//  @return Evaluation
func (a *EvaluationsApiService) GetEvaluationExecute(r ApiGetEvaluationRequest) (*Evaluation, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *Evaluation
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "EvaluationsApiService.GetEvaluation")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/evaluation/{evalID}"
	localVarPath = strings.Replace(localVarPath, "{"+"evalID"+"}", url.PathEscape(parameterToString(r.evalID, "")), -1)

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

type ApiGetEvaluationAllocationsRequest struct {
	ctx context.Context
	ApiService *EvaluationsApiService
	evalID string
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
func (r ApiGetEvaluationAllocationsRequest) Region(region string) ApiGetEvaluationAllocationsRequest {
	r.region = &region
	return r
}

// Filters results based on the specified namespace.
func (r ApiGetEvaluationAllocationsRequest) Namespace(namespace string) ApiGetEvaluationAllocationsRequest {
	r.namespace = &namespace
	return r
}

// If set, wait until query exceeds given index. Must be provided with WaitParam.
func (r ApiGetEvaluationAllocationsRequest) Index(index int32) ApiGetEvaluationAllocationsRequest {
	r.index = &index
	return r
}

// Provided with IndexParam to wait for change.
func (r ApiGetEvaluationAllocationsRequest) Wait(wait string) ApiGetEvaluationAllocationsRequest {
	r.wait = &wait
	return r
}

// If present, results will include stale reads.
func (r ApiGetEvaluationAllocationsRequest) Stale(stale string) ApiGetEvaluationAllocationsRequest {
	r.stale = &stale
	return r
}

// Constrains results to jobs that start with the defined prefix
func (r ApiGetEvaluationAllocationsRequest) Prefix(prefix string) ApiGetEvaluationAllocationsRequest {
	r.prefix = &prefix
	return r
}

// A Nomad ACL token.
func (r ApiGetEvaluationAllocationsRequest) XNomadToken(xNomadToken string) ApiGetEvaluationAllocationsRequest {
	r.xNomadToken = &xNomadToken
	return r
}

// Maximum number of results to return.
func (r ApiGetEvaluationAllocationsRequest) PerPage(perPage int32) ApiGetEvaluationAllocationsRequest {
	r.perPage = &perPage
	return r
}

// Indicates where to start paging for queries that support pagination.
func (r ApiGetEvaluationAllocationsRequest) NextToken(nextToken string) ApiGetEvaluationAllocationsRequest {
	r.nextToken = &nextToken
	return r
}

func (r ApiGetEvaluationAllocationsRequest) Execute() ([]AllocationListStub, *http.Response, error) {
	return r.ApiService.GetEvaluationAllocationsExecute(r)
}

/*
GetEvaluationAllocations Method for GetEvaluationAllocations

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @param evalID Evaluation ID.
 @return ApiGetEvaluationAllocationsRequest
*/
func (a *EvaluationsApiService) GetEvaluationAllocations(ctx context.Context, evalID string) ApiGetEvaluationAllocationsRequest {
	return ApiGetEvaluationAllocationsRequest{
		ApiService: a,
		ctx: ctx,
		evalID: evalID,
	}
}

// Execute executes the request
//  @return []AllocationListStub
func (a *EvaluationsApiService) GetEvaluationAllocationsExecute(r ApiGetEvaluationAllocationsRequest) ([]AllocationListStub, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  []AllocationListStub
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "EvaluationsApiService.GetEvaluationAllocations")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/evaluation/{evalID}/allocations"
	localVarPath = strings.Replace(localVarPath, "{"+"evalID"+"}", url.PathEscape(parameterToString(r.evalID, "")), -1)

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

type ApiGetEvaluationsRequest struct {
	ctx context.Context
	ApiService *EvaluationsApiService
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
func (r ApiGetEvaluationsRequest) Region(region string) ApiGetEvaluationsRequest {
	r.region = &region
	return r
}

// Filters results based on the specified namespace.
func (r ApiGetEvaluationsRequest) Namespace(namespace string) ApiGetEvaluationsRequest {
	r.namespace = &namespace
	return r
}

// If set, wait until query exceeds given index. Must be provided with WaitParam.
func (r ApiGetEvaluationsRequest) Index(index int32) ApiGetEvaluationsRequest {
	r.index = &index
	return r
}

// Provided with IndexParam to wait for change.
func (r ApiGetEvaluationsRequest) Wait(wait string) ApiGetEvaluationsRequest {
	r.wait = &wait
	return r
}

// If present, results will include stale reads.
func (r ApiGetEvaluationsRequest) Stale(stale string) ApiGetEvaluationsRequest {
	r.stale = &stale
	return r
}

// Constrains results to jobs that start with the defined prefix
func (r ApiGetEvaluationsRequest) Prefix(prefix string) ApiGetEvaluationsRequest {
	r.prefix = &prefix
	return r
}

// A Nomad ACL token.
func (r ApiGetEvaluationsRequest) XNomadToken(xNomadToken string) ApiGetEvaluationsRequest {
	r.xNomadToken = &xNomadToken
	return r
}

// Maximum number of results to return.
func (r ApiGetEvaluationsRequest) PerPage(perPage int32) ApiGetEvaluationsRequest {
	r.perPage = &perPage
	return r
}

// Indicates where to start paging for queries that support pagination.
func (r ApiGetEvaluationsRequest) NextToken(nextToken string) ApiGetEvaluationsRequest {
	r.nextToken = &nextToken
	return r
}

func (r ApiGetEvaluationsRequest) Execute() ([]Evaluation, *http.Response, error) {
	return r.ApiService.GetEvaluationsExecute(r)
}

/*
GetEvaluations Method for GetEvaluations

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiGetEvaluationsRequest
*/
func (a *EvaluationsApiService) GetEvaluations(ctx context.Context) ApiGetEvaluationsRequest {
	return ApiGetEvaluationsRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return []Evaluation
func (a *EvaluationsApiService) GetEvaluationsExecute(r ApiGetEvaluationsRequest) ([]Evaluation, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  []Evaluation
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "EvaluationsApiService.GetEvaluations")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/evaluations"

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
