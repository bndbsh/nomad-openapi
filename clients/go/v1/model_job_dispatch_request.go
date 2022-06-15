/*
Nomad

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

API version: 1.1.4
Contact: support@hashicorp.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// JobDispatchRequest struct for JobDispatchRequest
type JobDispatchRequest struct {
	JobID *string `json:"JobID,omitempty"`
	Meta *map[string]string `json:"Meta,omitempty"`
	Payload *string `json:"Payload,omitempty"`
}

// NewJobDispatchRequest instantiates a new JobDispatchRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewJobDispatchRequest() *JobDispatchRequest {
	this := JobDispatchRequest{}
	return &this
}

// NewJobDispatchRequestWithDefaults instantiates a new JobDispatchRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewJobDispatchRequestWithDefaults() *JobDispatchRequest {
	this := JobDispatchRequest{}
	return &this
}

// GetJobID returns the JobID field value if set, zero value otherwise.
func (o *JobDispatchRequest) GetJobID() string {
	if o == nil || o.JobID == nil {
		var ret string
		return ret
	}
	return *o.JobID
}

// GetJobIDOk returns a tuple with the JobID field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *JobDispatchRequest) GetJobIDOk() (*string, bool) {
	if o == nil || o.JobID == nil {
		return nil, false
	}
	return o.JobID, true
}

// HasJobID returns a boolean if a field has been set.
func (o *JobDispatchRequest) HasJobID() bool {
	if o != nil && o.JobID != nil {
		return true
	}

	return false
}

// SetJobID gets a reference to the given string and assigns it to the JobID field.
func (o *JobDispatchRequest) SetJobID(v string) {
	o.JobID = &v
}

// GetMeta returns the Meta field value if set, zero value otherwise.
func (o *JobDispatchRequest) GetMeta() map[string]string {
	if o == nil || o.Meta == nil {
		var ret map[string]string
		return ret
	}
	return *o.Meta
}

// GetMetaOk returns a tuple with the Meta field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *JobDispatchRequest) GetMetaOk() (*map[string]string, bool) {
	if o == nil || o.Meta == nil {
		return nil, false
	}
	return o.Meta, true
}

// HasMeta returns a boolean if a field has been set.
func (o *JobDispatchRequest) HasMeta() bool {
	if o != nil && o.Meta != nil {
		return true
	}

	return false
}

// SetMeta gets a reference to the given map[string]string and assigns it to the Meta field.
func (o *JobDispatchRequest) SetMeta(v map[string]string) {
	o.Meta = &v
}

// GetPayload returns the Payload field value if set, zero value otherwise.
func (o *JobDispatchRequest) GetPayload() string {
	if o == nil || o.Payload == nil {
		var ret string
		return ret
	}
	return *o.Payload
}

// GetPayloadOk returns a tuple with the Payload field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *JobDispatchRequest) GetPayloadOk() (*string, bool) {
	if o == nil || o.Payload == nil {
		return nil, false
	}
	return o.Payload, true
}

// HasPayload returns a boolean if a field has been set.
func (o *JobDispatchRequest) HasPayload() bool {
	if o != nil && o.Payload != nil {
		return true
	}

	return false
}

// SetPayload gets a reference to the given string and assigns it to the Payload field.
func (o *JobDispatchRequest) SetPayload(v string) {
	o.Payload = &v
}

func (o JobDispatchRequest) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.JobID != nil {
		toSerialize["JobID"] = o.JobID
	}
	if o.Meta != nil {
		toSerialize["Meta"] = o.Meta
	}
	if o.Payload != nil {
		toSerialize["Payload"] = o.Payload
	}
	return json.Marshal(toSerialize)
}

type NullableJobDispatchRequest struct {
	value *JobDispatchRequest
	isSet bool
}

func (v NullableJobDispatchRequest) Get() *JobDispatchRequest {
	return v.value
}

func (v *NullableJobDispatchRequest) Set(val *JobDispatchRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableJobDispatchRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableJobDispatchRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableJobDispatchRequest(val *JobDispatchRequest) *NullableJobDispatchRequest {
	return &NullableJobDispatchRequest{value: val, isSet: true}
}

func (v NullableJobDispatchRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableJobDispatchRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


