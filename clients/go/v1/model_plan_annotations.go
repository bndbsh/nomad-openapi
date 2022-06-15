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

// PlanAnnotations struct for PlanAnnotations
type PlanAnnotations struct {
	DesiredTGUpdates *map[string]DesiredUpdates `json:"DesiredTGUpdates,omitempty"`
	PreemptedAllocs []AllocationListStub `json:"PreemptedAllocs,omitempty"`
}

// NewPlanAnnotations instantiates a new PlanAnnotations object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewPlanAnnotations() *PlanAnnotations {
	this := PlanAnnotations{}
	return &this
}

// NewPlanAnnotationsWithDefaults instantiates a new PlanAnnotations object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewPlanAnnotationsWithDefaults() *PlanAnnotations {
	this := PlanAnnotations{}
	return &this
}

// GetDesiredTGUpdates returns the DesiredTGUpdates field value if set, zero value otherwise.
func (o *PlanAnnotations) GetDesiredTGUpdates() map[string]DesiredUpdates {
	if o == nil || o.DesiredTGUpdates == nil {
		var ret map[string]DesiredUpdates
		return ret
	}
	return *o.DesiredTGUpdates
}

// GetDesiredTGUpdatesOk returns a tuple with the DesiredTGUpdates field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PlanAnnotations) GetDesiredTGUpdatesOk() (*map[string]DesiredUpdates, bool) {
	if o == nil || o.DesiredTGUpdates == nil {
		return nil, false
	}
	return o.DesiredTGUpdates, true
}

// HasDesiredTGUpdates returns a boolean if a field has been set.
func (o *PlanAnnotations) HasDesiredTGUpdates() bool {
	if o != nil && o.DesiredTGUpdates != nil {
		return true
	}

	return false
}

// SetDesiredTGUpdates gets a reference to the given map[string]DesiredUpdates and assigns it to the DesiredTGUpdates field.
func (o *PlanAnnotations) SetDesiredTGUpdates(v map[string]DesiredUpdates) {
	o.DesiredTGUpdates = &v
}

// GetPreemptedAllocs returns the PreemptedAllocs field value if set, zero value otherwise.
func (o *PlanAnnotations) GetPreemptedAllocs() []AllocationListStub {
	if o == nil || o.PreemptedAllocs == nil {
		var ret []AllocationListStub
		return ret
	}
	return o.PreemptedAllocs
}

// GetPreemptedAllocsOk returns a tuple with the PreemptedAllocs field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PlanAnnotations) GetPreemptedAllocsOk() ([]AllocationListStub, bool) {
	if o == nil || o.PreemptedAllocs == nil {
		return nil, false
	}
	return o.PreemptedAllocs, true
}

// HasPreemptedAllocs returns a boolean if a field has been set.
func (o *PlanAnnotations) HasPreemptedAllocs() bool {
	if o != nil && o.PreemptedAllocs != nil {
		return true
	}

	return false
}

// SetPreemptedAllocs gets a reference to the given []AllocationListStub and assigns it to the PreemptedAllocs field.
func (o *PlanAnnotations) SetPreemptedAllocs(v []AllocationListStub) {
	o.PreemptedAllocs = v
}

func (o PlanAnnotations) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.DesiredTGUpdates != nil {
		toSerialize["DesiredTGUpdates"] = o.DesiredTGUpdates
	}
	if o.PreemptedAllocs != nil {
		toSerialize["PreemptedAllocs"] = o.PreemptedAllocs
	}
	return json.Marshal(toSerialize)
}

type NullablePlanAnnotations struct {
	value *PlanAnnotations
	isSet bool
}

func (v NullablePlanAnnotations) Get() *PlanAnnotations {
	return v.value
}

func (v *NullablePlanAnnotations) Set(val *PlanAnnotations) {
	v.value = val
	v.isSet = true
}

func (v NullablePlanAnnotations) IsSet() bool {
	return v.isSet
}

func (v *NullablePlanAnnotations) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullablePlanAnnotations(val *PlanAnnotations) *NullablePlanAnnotations {
	return &NullablePlanAnnotations{value: val, isSet: true}
}

func (v NullablePlanAnnotations) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullablePlanAnnotations) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


