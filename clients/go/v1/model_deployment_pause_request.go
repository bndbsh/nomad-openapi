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

// DeploymentPauseRequest struct for DeploymentPauseRequest
type DeploymentPauseRequest struct {
	DeploymentID *string `json:"DeploymentID,omitempty"`
	Namespace *string `json:"Namespace,omitempty"`
	Pause *bool `json:"Pause,omitempty"`
	Region *string `json:"Region,omitempty"`
	SecretID *string `json:"SecretID,omitempty"`
}

// NewDeploymentPauseRequest instantiates a new DeploymentPauseRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewDeploymentPauseRequest() *DeploymentPauseRequest {
	this := DeploymentPauseRequest{}
	return &this
}

// NewDeploymentPauseRequestWithDefaults instantiates a new DeploymentPauseRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewDeploymentPauseRequestWithDefaults() *DeploymentPauseRequest {
	this := DeploymentPauseRequest{}
	return &this
}

// GetDeploymentID returns the DeploymentID field value if set, zero value otherwise.
func (o *DeploymentPauseRequest) GetDeploymentID() string {
	if o == nil || o.DeploymentID == nil {
		var ret string
		return ret
	}
	return *o.DeploymentID
}

// GetDeploymentIDOk returns a tuple with the DeploymentID field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DeploymentPauseRequest) GetDeploymentIDOk() (*string, bool) {
	if o == nil || o.DeploymentID == nil {
		return nil, false
	}
	return o.DeploymentID, true
}

// HasDeploymentID returns a boolean if a field has been set.
func (o *DeploymentPauseRequest) HasDeploymentID() bool {
	if o != nil && o.DeploymentID != nil {
		return true
	}

	return false
}

// SetDeploymentID gets a reference to the given string and assigns it to the DeploymentID field.
func (o *DeploymentPauseRequest) SetDeploymentID(v string) {
	o.DeploymentID = &v
}

// GetNamespace returns the Namespace field value if set, zero value otherwise.
func (o *DeploymentPauseRequest) GetNamespace() string {
	if o == nil || o.Namespace == nil {
		var ret string
		return ret
	}
	return *o.Namespace
}

// GetNamespaceOk returns a tuple with the Namespace field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DeploymentPauseRequest) GetNamespaceOk() (*string, bool) {
	if o == nil || o.Namespace == nil {
		return nil, false
	}
	return o.Namespace, true
}

// HasNamespace returns a boolean if a field has been set.
func (o *DeploymentPauseRequest) HasNamespace() bool {
	if o != nil && o.Namespace != nil {
		return true
	}

	return false
}

// SetNamespace gets a reference to the given string and assigns it to the Namespace field.
func (o *DeploymentPauseRequest) SetNamespace(v string) {
	o.Namespace = &v
}

// GetPause returns the Pause field value if set, zero value otherwise.
func (o *DeploymentPauseRequest) GetPause() bool {
	if o == nil || o.Pause == nil {
		var ret bool
		return ret
	}
	return *o.Pause
}

// GetPauseOk returns a tuple with the Pause field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DeploymentPauseRequest) GetPauseOk() (*bool, bool) {
	if o == nil || o.Pause == nil {
		return nil, false
	}
	return o.Pause, true
}

// HasPause returns a boolean if a field has been set.
func (o *DeploymentPauseRequest) HasPause() bool {
	if o != nil && o.Pause != nil {
		return true
	}

	return false
}

// SetPause gets a reference to the given bool and assigns it to the Pause field.
func (o *DeploymentPauseRequest) SetPause(v bool) {
	o.Pause = &v
}

// GetRegion returns the Region field value if set, zero value otherwise.
func (o *DeploymentPauseRequest) GetRegion() string {
	if o == nil || o.Region == nil {
		var ret string
		return ret
	}
	return *o.Region
}

// GetRegionOk returns a tuple with the Region field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DeploymentPauseRequest) GetRegionOk() (*string, bool) {
	if o == nil || o.Region == nil {
		return nil, false
	}
	return o.Region, true
}

// HasRegion returns a boolean if a field has been set.
func (o *DeploymentPauseRequest) HasRegion() bool {
	if o != nil && o.Region != nil {
		return true
	}

	return false
}

// SetRegion gets a reference to the given string and assigns it to the Region field.
func (o *DeploymentPauseRequest) SetRegion(v string) {
	o.Region = &v
}

// GetSecretID returns the SecretID field value if set, zero value otherwise.
func (o *DeploymentPauseRequest) GetSecretID() string {
	if o == nil || o.SecretID == nil {
		var ret string
		return ret
	}
	return *o.SecretID
}

// GetSecretIDOk returns a tuple with the SecretID field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DeploymentPauseRequest) GetSecretIDOk() (*string, bool) {
	if o == nil || o.SecretID == nil {
		return nil, false
	}
	return o.SecretID, true
}

// HasSecretID returns a boolean if a field has been set.
func (o *DeploymentPauseRequest) HasSecretID() bool {
	if o != nil && o.SecretID != nil {
		return true
	}

	return false
}

// SetSecretID gets a reference to the given string and assigns it to the SecretID field.
func (o *DeploymentPauseRequest) SetSecretID(v string) {
	o.SecretID = &v
}

func (o DeploymentPauseRequest) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.DeploymentID != nil {
		toSerialize["DeploymentID"] = o.DeploymentID
	}
	if o.Namespace != nil {
		toSerialize["Namespace"] = o.Namespace
	}
	if o.Pause != nil {
		toSerialize["Pause"] = o.Pause
	}
	if o.Region != nil {
		toSerialize["Region"] = o.Region
	}
	if o.SecretID != nil {
		toSerialize["SecretID"] = o.SecretID
	}
	return json.Marshal(toSerialize)
}

type NullableDeploymentPauseRequest struct {
	value *DeploymentPauseRequest
	isSet bool
}

func (v NullableDeploymentPauseRequest) Get() *DeploymentPauseRequest {
	return v.value
}

func (v *NullableDeploymentPauseRequest) Set(val *DeploymentPauseRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableDeploymentPauseRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableDeploymentPauseRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableDeploymentPauseRequest(val *DeploymentPauseRequest) *NullableDeploymentPauseRequest {
	return &NullableDeploymentPauseRequest{value: val, isSet: true}
}

func (v NullableDeploymentPauseRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableDeploymentPauseRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


