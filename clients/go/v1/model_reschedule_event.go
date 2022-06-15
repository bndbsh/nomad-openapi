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

// RescheduleEvent struct for RescheduleEvent
type RescheduleEvent struct {
	PrevAllocID *string `json:"PrevAllocID,omitempty"`
	PrevNodeID *string `json:"PrevNodeID,omitempty"`
	RescheduleTime *int64 `json:"RescheduleTime,omitempty"`
}

// NewRescheduleEvent instantiates a new RescheduleEvent object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewRescheduleEvent() *RescheduleEvent {
	this := RescheduleEvent{}
	return &this
}

// NewRescheduleEventWithDefaults instantiates a new RescheduleEvent object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewRescheduleEventWithDefaults() *RescheduleEvent {
	this := RescheduleEvent{}
	return &this
}

// GetPrevAllocID returns the PrevAllocID field value if set, zero value otherwise.
func (o *RescheduleEvent) GetPrevAllocID() string {
	if o == nil || o.PrevAllocID == nil {
		var ret string
		return ret
	}
	return *o.PrevAllocID
}

// GetPrevAllocIDOk returns a tuple with the PrevAllocID field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RescheduleEvent) GetPrevAllocIDOk() (*string, bool) {
	if o == nil || o.PrevAllocID == nil {
		return nil, false
	}
	return o.PrevAllocID, true
}

// HasPrevAllocID returns a boolean if a field has been set.
func (o *RescheduleEvent) HasPrevAllocID() bool {
	if o != nil && o.PrevAllocID != nil {
		return true
	}

	return false
}

// SetPrevAllocID gets a reference to the given string and assigns it to the PrevAllocID field.
func (o *RescheduleEvent) SetPrevAllocID(v string) {
	o.PrevAllocID = &v
}

// GetPrevNodeID returns the PrevNodeID field value if set, zero value otherwise.
func (o *RescheduleEvent) GetPrevNodeID() string {
	if o == nil || o.PrevNodeID == nil {
		var ret string
		return ret
	}
	return *o.PrevNodeID
}

// GetPrevNodeIDOk returns a tuple with the PrevNodeID field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RescheduleEvent) GetPrevNodeIDOk() (*string, bool) {
	if o == nil || o.PrevNodeID == nil {
		return nil, false
	}
	return o.PrevNodeID, true
}

// HasPrevNodeID returns a boolean if a field has been set.
func (o *RescheduleEvent) HasPrevNodeID() bool {
	if o != nil && o.PrevNodeID != nil {
		return true
	}

	return false
}

// SetPrevNodeID gets a reference to the given string and assigns it to the PrevNodeID field.
func (o *RescheduleEvent) SetPrevNodeID(v string) {
	o.PrevNodeID = &v
}

// GetRescheduleTime returns the RescheduleTime field value if set, zero value otherwise.
func (o *RescheduleEvent) GetRescheduleTime() int64 {
	if o == nil || o.RescheduleTime == nil {
		var ret int64
		return ret
	}
	return *o.RescheduleTime
}

// GetRescheduleTimeOk returns a tuple with the RescheduleTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RescheduleEvent) GetRescheduleTimeOk() (*int64, bool) {
	if o == nil || o.RescheduleTime == nil {
		return nil, false
	}
	return o.RescheduleTime, true
}

// HasRescheduleTime returns a boolean if a field has been set.
func (o *RescheduleEvent) HasRescheduleTime() bool {
	if o != nil && o.RescheduleTime != nil {
		return true
	}

	return false
}

// SetRescheduleTime gets a reference to the given int64 and assigns it to the RescheduleTime field.
func (o *RescheduleEvent) SetRescheduleTime(v int64) {
	o.RescheduleTime = &v
}

func (o RescheduleEvent) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.PrevAllocID != nil {
		toSerialize["PrevAllocID"] = o.PrevAllocID
	}
	if o.PrevNodeID != nil {
		toSerialize["PrevNodeID"] = o.PrevNodeID
	}
	if o.RescheduleTime != nil {
		toSerialize["RescheduleTime"] = o.RescheduleTime
	}
	return json.Marshal(toSerialize)
}

type NullableRescheduleEvent struct {
	value *RescheduleEvent
	isSet bool
}

func (v NullableRescheduleEvent) Get() *RescheduleEvent {
	return v.value
}

func (v *NullableRescheduleEvent) Set(val *RescheduleEvent) {
	v.value = val
	v.isSet = true
}

func (v NullableRescheduleEvent) IsSet() bool {
	return v.isSet
}

func (v *NullableRescheduleEvent) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRescheduleEvent(val *RescheduleEvent) *NullableRescheduleEvent {
	return &NullableRescheduleEvent{value: val, isSet: true}
}

func (v NullableRescheduleEvent) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRescheduleEvent) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


