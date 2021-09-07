/*
 * Nomad
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.1.3
 * Contact: support@hashicorp.com
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// AllocatedResources struct for AllocatedResources
type AllocatedResources struct {
	Shared *AllocatedSharedResources `json:"Shared,omitempty"`
	Tasks *map[string]AllocatedTaskResources `json:"Tasks,omitempty"`
}

// NewAllocatedResources instantiates a new AllocatedResources object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAllocatedResources() *AllocatedResources {
	this := AllocatedResources{}
	return &this
}

// NewAllocatedResourcesWithDefaults instantiates a new AllocatedResources object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAllocatedResourcesWithDefaults() *AllocatedResources {
	this := AllocatedResources{}
	return &this
}

// GetShared returns the Shared field value if set, zero value otherwise.
func (o *AllocatedResources) GetShared() AllocatedSharedResources {
	if o == nil || o.Shared == nil {
		var ret AllocatedSharedResources
		return ret
	}
	return *o.Shared
}

// GetSharedOk returns a tuple with the Shared field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AllocatedResources) GetSharedOk() (*AllocatedSharedResources, bool) {
	if o == nil || o.Shared == nil {
		return nil, false
	}
	return o.Shared, true
}

// HasShared returns a boolean if a field has been set.
func (o *AllocatedResources) HasShared() bool {
	if o != nil && o.Shared != nil {
		return true
	}

	return false
}

// SetShared gets a reference to the given AllocatedSharedResources and assigns it to the Shared field.
func (o *AllocatedResources) SetShared(v AllocatedSharedResources) {
	o.Shared = &v
}

// GetTasks returns the Tasks field value if set, zero value otherwise.
func (o *AllocatedResources) GetTasks() map[string]AllocatedTaskResources {
	if o == nil || o.Tasks == nil {
		var ret map[string]AllocatedTaskResources
		return ret
	}
	return *o.Tasks
}

// GetTasksOk returns a tuple with the Tasks field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AllocatedResources) GetTasksOk() (*map[string]AllocatedTaskResources, bool) {
	if o == nil || o.Tasks == nil {
		return nil, false
	}
	return o.Tasks, true
}

// HasTasks returns a boolean if a field has been set.
func (o *AllocatedResources) HasTasks() bool {
	if o != nil && o.Tasks != nil {
		return true
	}

	return false
}

// SetTasks gets a reference to the given map[string]AllocatedTaskResources and assigns it to the Tasks field.
func (o *AllocatedResources) SetTasks(v map[string]AllocatedTaskResources) {
	o.Tasks = &v
}

func (o AllocatedResources) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Shared != nil {
		toSerialize["Shared"] = o.Shared
	}
	if o.Tasks != nil {
		toSerialize["Tasks"] = o.Tasks
	}
	return json.Marshal(toSerialize)
}

type NullableAllocatedResources struct {
	value *AllocatedResources
	isSet bool
}

func (v NullableAllocatedResources) Get() *AllocatedResources {
	return v.value
}

func (v *NullableAllocatedResources) Set(val *AllocatedResources) {
	v.value = val
	v.isSet = true
}

func (v NullableAllocatedResources) IsSet() bool {
	return v.isSet
}

func (v *NullableAllocatedResources) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAllocatedResources(val *AllocatedResources) *NullableAllocatedResources {
	return &NullableAllocatedResources{value: val, isSet: true}
}

func (v NullableAllocatedResources) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAllocatedResources) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

