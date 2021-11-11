/*
 * Nomad
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.1.4
 * Contact: support@hashicorp.com
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// NodeMemoryResources struct for NodeMemoryResources
type NodeMemoryResources struct {
	MemoryMB *int64 `json:"MemoryMB,omitempty"`
}

// NewNodeMemoryResources instantiates a new NodeMemoryResources object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewNodeMemoryResources() *NodeMemoryResources {
	this := NodeMemoryResources{}
	return &this
}

// NewNodeMemoryResourcesWithDefaults instantiates a new NodeMemoryResources object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewNodeMemoryResourcesWithDefaults() *NodeMemoryResources {
	this := NodeMemoryResources{}
	return &this
}

// GetMemoryMB returns the MemoryMB field value if set, zero value otherwise.
func (o *NodeMemoryResources) GetMemoryMB() int64 {
	if o == nil || o.MemoryMB == nil {
		var ret int64
		return ret
	}
	return *o.MemoryMB
}

// GetMemoryMBOk returns a tuple with the MemoryMB field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *NodeMemoryResources) GetMemoryMBOk() (*int64, bool) {
	if o == nil || o.MemoryMB == nil {
		return nil, false
	}
	return o.MemoryMB, true
}

// HasMemoryMB returns a boolean if a field has been set.
func (o *NodeMemoryResources) HasMemoryMB() bool {
	if o != nil && o.MemoryMB != nil {
		return true
	}

	return false
}

// SetMemoryMB gets a reference to the given int64 and assigns it to the MemoryMB field.
func (o *NodeMemoryResources) SetMemoryMB(v int64) {
	o.MemoryMB = &v
}

func (o NodeMemoryResources) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.MemoryMB != nil {
		toSerialize["MemoryMB"] = o.MemoryMB
	}
	return json.Marshal(toSerialize)
}

type NullableNodeMemoryResources struct {
	value *NodeMemoryResources
	isSet bool
}

func (v NullableNodeMemoryResources) Get() *NodeMemoryResources {
	return v.value
}

func (v *NullableNodeMemoryResources) Set(val *NodeMemoryResources) {
	v.value = val
	v.isSet = true
}

func (v NullableNodeMemoryResources) IsSet() bool {
	return v.isSet
}

func (v *NullableNodeMemoryResources) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableNodeMemoryResources(val *NodeMemoryResources) *NullableNodeMemoryResources {
	return &NullableNodeMemoryResources{value: val, isSet: true}
}

func (v NullableNodeMemoryResources) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableNodeMemoryResources) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

