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
	"time"
)

// CSIVolume struct for CSIVolume
type CSIVolume struct {
	AccessMode *string `json:"AccessMode,omitempty"`
	Allocations []AllocationListStub `json:"Allocations,omitempty"`
	AttachmentMode *string `json:"AttachmentMode,omitempty"`
	Capacity *int64 `json:"Capacity,omitempty"`
	CloneID *string `json:"CloneID,omitempty"`
	Context *map[string]string `json:"Context,omitempty"`
	ControllerRequired *bool `json:"ControllerRequired,omitempty"`
	ControllersExpected *int32 `json:"ControllersExpected,omitempty"`
	ControllersHealthy *int32 `json:"ControllersHealthy,omitempty"`
	CreateIndex *int32 `json:"CreateIndex,omitempty"`
	ExternalID *string `json:"ExternalID,omitempty"`
	ID *string `json:"ID,omitempty"`
	ModifyIndex *int32 `json:"ModifyIndex,omitempty"`
	MountOptions NullableCSIMountOptions `json:"MountOptions,omitempty"`
	Name *string `json:"Name,omitempty"`
	Namespace *string `json:"Namespace,omitempty"`
	NodesExpected *int32 `json:"NodesExpected,omitempty"`
	NodesHealthy *int32 `json:"NodesHealthy,omitempty"`
	Parameters *map[string]string `json:"Parameters,omitempty"`
	PluginID *string `json:"PluginID,omitempty"`
	Provider *string `json:"Provider,omitempty"`
	ProviderVersion *string `json:"ProviderVersion,omitempty"`
	ReadAllocs *map[string]Allocation `json:"ReadAllocs,omitempty"`
	RequestedCapabilities []CSIVolumeCapability `json:"RequestedCapabilities,omitempty"`
	RequestedCapacityMax *int64 `json:"RequestedCapacityMax,omitempty"`
	RequestedCapacityMin *int64 `json:"RequestedCapacityMin,omitempty"`
	RequestedTopologies NullableCSITopologyRequest `json:"RequestedTopologies,omitempty"`
	ResourceExhausted NullableTime `json:"ResourceExhausted,omitempty"`
	Schedulable *bool `json:"Schedulable,omitempty"`
	Secrets *map[string]string `json:"Secrets,omitempty"`
	SnapshotID *string `json:"SnapshotID,omitempty"`
	Topologies []CSITopology `json:"Topologies,omitempty"`
	WriteAllocs *map[string]Allocation `json:"WriteAllocs,omitempty"`
}

// NewCSIVolume instantiates a new CSIVolume object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCSIVolume() *CSIVolume {
	this := CSIVolume{}
	return &this
}

// NewCSIVolumeWithDefaults instantiates a new CSIVolume object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCSIVolumeWithDefaults() *CSIVolume {
	this := CSIVolume{}
	return &this
}

// GetAccessMode returns the AccessMode field value if set, zero value otherwise.
func (o *CSIVolume) GetAccessMode() string {
	if o == nil || o.AccessMode == nil {
		var ret string
		return ret
	}
	return *o.AccessMode
}

// GetAccessModeOk returns a tuple with the AccessMode field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CSIVolume) GetAccessModeOk() (*string, bool) {
	if o == nil || o.AccessMode == nil {
		return nil, false
	}
	return o.AccessMode, true
}

// HasAccessMode returns a boolean if a field has been set.
func (o *CSIVolume) HasAccessMode() bool {
	if o != nil && o.AccessMode != nil {
		return true
	}

	return false
}

// SetAccessMode gets a reference to the given string and assigns it to the AccessMode field.
func (o *CSIVolume) SetAccessMode(v string) {
	o.AccessMode = &v
}

// GetAllocations returns the Allocations field value if set, zero value otherwise.
func (o *CSIVolume) GetAllocations() []AllocationListStub {
	if o == nil || o.Allocations == nil {
		var ret []AllocationListStub
		return ret
	}
	return o.Allocations
}

// GetAllocationsOk returns a tuple with the Allocations field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CSIVolume) GetAllocationsOk() ([]AllocationListStub, bool) {
	if o == nil || o.Allocations == nil {
		return nil, false
	}
	return o.Allocations, true
}

// HasAllocations returns a boolean if a field has been set.
func (o *CSIVolume) HasAllocations() bool {
	if o != nil && o.Allocations != nil {
		return true
	}

	return false
}

// SetAllocations gets a reference to the given []AllocationListStub and assigns it to the Allocations field.
func (o *CSIVolume) SetAllocations(v []AllocationListStub) {
	o.Allocations = v
}

// GetAttachmentMode returns the AttachmentMode field value if set, zero value otherwise.
func (o *CSIVolume) GetAttachmentMode() string {
	if o == nil || o.AttachmentMode == nil {
		var ret string
		return ret
	}
	return *o.AttachmentMode
}

// GetAttachmentModeOk returns a tuple with the AttachmentMode field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CSIVolume) GetAttachmentModeOk() (*string, bool) {
	if o == nil || o.AttachmentMode == nil {
		return nil, false
	}
	return o.AttachmentMode, true
}

// HasAttachmentMode returns a boolean if a field has been set.
func (o *CSIVolume) HasAttachmentMode() bool {
	if o != nil && o.AttachmentMode != nil {
		return true
	}

	return false
}

// SetAttachmentMode gets a reference to the given string and assigns it to the AttachmentMode field.
func (o *CSIVolume) SetAttachmentMode(v string) {
	o.AttachmentMode = &v
}

// GetCapacity returns the Capacity field value if set, zero value otherwise.
func (o *CSIVolume) GetCapacity() int64 {
	if o == nil || o.Capacity == nil {
		var ret int64
		return ret
	}
	return *o.Capacity
}

// GetCapacityOk returns a tuple with the Capacity field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CSIVolume) GetCapacityOk() (*int64, bool) {
	if o == nil || o.Capacity == nil {
		return nil, false
	}
	return o.Capacity, true
}

// HasCapacity returns a boolean if a field has been set.
func (o *CSIVolume) HasCapacity() bool {
	if o != nil && o.Capacity != nil {
		return true
	}

	return false
}

// SetCapacity gets a reference to the given int64 and assigns it to the Capacity field.
func (o *CSIVolume) SetCapacity(v int64) {
	o.Capacity = &v
}

// GetCloneID returns the CloneID field value if set, zero value otherwise.
func (o *CSIVolume) GetCloneID() string {
	if o == nil || o.CloneID == nil {
		var ret string
		return ret
	}
	return *o.CloneID
}

// GetCloneIDOk returns a tuple with the CloneID field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CSIVolume) GetCloneIDOk() (*string, bool) {
	if o == nil || o.CloneID == nil {
		return nil, false
	}
	return o.CloneID, true
}

// HasCloneID returns a boolean if a field has been set.
func (o *CSIVolume) HasCloneID() bool {
	if o != nil && o.CloneID != nil {
		return true
	}

	return false
}

// SetCloneID gets a reference to the given string and assigns it to the CloneID field.
func (o *CSIVolume) SetCloneID(v string) {
	o.CloneID = &v
}

// GetContext returns the Context field value if set, zero value otherwise.
func (o *CSIVolume) GetContext() map[string]string {
	if o == nil || o.Context == nil {
		var ret map[string]string
		return ret
	}
	return *o.Context
}

// GetContextOk returns a tuple with the Context field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CSIVolume) GetContextOk() (*map[string]string, bool) {
	if o == nil || o.Context == nil {
		return nil, false
	}
	return o.Context, true
}

// HasContext returns a boolean if a field has been set.
func (o *CSIVolume) HasContext() bool {
	if o != nil && o.Context != nil {
		return true
	}

	return false
}

// SetContext gets a reference to the given map[string]string and assigns it to the Context field.
func (o *CSIVolume) SetContext(v map[string]string) {
	o.Context = &v
}

// GetControllerRequired returns the ControllerRequired field value if set, zero value otherwise.
func (o *CSIVolume) GetControllerRequired() bool {
	if o == nil || o.ControllerRequired == nil {
		var ret bool
		return ret
	}
	return *o.ControllerRequired
}

// GetControllerRequiredOk returns a tuple with the ControllerRequired field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CSIVolume) GetControllerRequiredOk() (*bool, bool) {
	if o == nil || o.ControllerRequired == nil {
		return nil, false
	}
	return o.ControllerRequired, true
}

// HasControllerRequired returns a boolean if a field has been set.
func (o *CSIVolume) HasControllerRequired() bool {
	if o != nil && o.ControllerRequired != nil {
		return true
	}

	return false
}

// SetControllerRequired gets a reference to the given bool and assigns it to the ControllerRequired field.
func (o *CSIVolume) SetControllerRequired(v bool) {
	o.ControllerRequired = &v
}

// GetControllersExpected returns the ControllersExpected field value if set, zero value otherwise.
func (o *CSIVolume) GetControllersExpected() int32 {
	if o == nil || o.ControllersExpected == nil {
		var ret int32
		return ret
	}
	return *o.ControllersExpected
}

// GetControllersExpectedOk returns a tuple with the ControllersExpected field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CSIVolume) GetControllersExpectedOk() (*int32, bool) {
	if o == nil || o.ControllersExpected == nil {
		return nil, false
	}
	return o.ControllersExpected, true
}

// HasControllersExpected returns a boolean if a field has been set.
func (o *CSIVolume) HasControllersExpected() bool {
	if o != nil && o.ControllersExpected != nil {
		return true
	}

	return false
}

// SetControllersExpected gets a reference to the given int32 and assigns it to the ControllersExpected field.
func (o *CSIVolume) SetControllersExpected(v int32) {
	o.ControllersExpected = &v
}

// GetControllersHealthy returns the ControllersHealthy field value if set, zero value otherwise.
func (o *CSIVolume) GetControllersHealthy() int32 {
	if o == nil || o.ControllersHealthy == nil {
		var ret int32
		return ret
	}
	return *o.ControllersHealthy
}

// GetControllersHealthyOk returns a tuple with the ControllersHealthy field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CSIVolume) GetControllersHealthyOk() (*int32, bool) {
	if o == nil || o.ControllersHealthy == nil {
		return nil, false
	}
	return o.ControllersHealthy, true
}

// HasControllersHealthy returns a boolean if a field has been set.
func (o *CSIVolume) HasControllersHealthy() bool {
	if o != nil && o.ControllersHealthy != nil {
		return true
	}

	return false
}

// SetControllersHealthy gets a reference to the given int32 and assigns it to the ControllersHealthy field.
func (o *CSIVolume) SetControllersHealthy(v int32) {
	o.ControllersHealthy = &v
}

// GetCreateIndex returns the CreateIndex field value if set, zero value otherwise.
func (o *CSIVolume) GetCreateIndex() int32 {
	if o == nil || o.CreateIndex == nil {
		var ret int32
		return ret
	}
	return *o.CreateIndex
}

// GetCreateIndexOk returns a tuple with the CreateIndex field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CSIVolume) GetCreateIndexOk() (*int32, bool) {
	if o == nil || o.CreateIndex == nil {
		return nil, false
	}
	return o.CreateIndex, true
}

// HasCreateIndex returns a boolean if a field has been set.
func (o *CSIVolume) HasCreateIndex() bool {
	if o != nil && o.CreateIndex != nil {
		return true
	}

	return false
}

// SetCreateIndex gets a reference to the given int32 and assigns it to the CreateIndex field.
func (o *CSIVolume) SetCreateIndex(v int32) {
	o.CreateIndex = &v
}

// GetExternalID returns the ExternalID field value if set, zero value otherwise.
func (o *CSIVolume) GetExternalID() string {
	if o == nil || o.ExternalID == nil {
		var ret string
		return ret
	}
	return *o.ExternalID
}

// GetExternalIDOk returns a tuple with the ExternalID field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CSIVolume) GetExternalIDOk() (*string, bool) {
	if o == nil || o.ExternalID == nil {
		return nil, false
	}
	return o.ExternalID, true
}

// HasExternalID returns a boolean if a field has been set.
func (o *CSIVolume) HasExternalID() bool {
	if o != nil && o.ExternalID != nil {
		return true
	}

	return false
}

// SetExternalID gets a reference to the given string and assigns it to the ExternalID field.
func (o *CSIVolume) SetExternalID(v string) {
	o.ExternalID = &v
}

// GetID returns the ID field value if set, zero value otherwise.
func (o *CSIVolume) GetID() string {
	if o == nil || o.ID == nil {
		var ret string
		return ret
	}
	return *o.ID
}

// GetIDOk returns a tuple with the ID field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CSIVolume) GetIDOk() (*string, bool) {
	if o == nil || o.ID == nil {
		return nil, false
	}
	return o.ID, true
}

// HasID returns a boolean if a field has been set.
func (o *CSIVolume) HasID() bool {
	if o != nil && o.ID != nil {
		return true
	}

	return false
}

// SetID gets a reference to the given string and assigns it to the ID field.
func (o *CSIVolume) SetID(v string) {
	o.ID = &v
}

// GetModifyIndex returns the ModifyIndex field value if set, zero value otherwise.
func (o *CSIVolume) GetModifyIndex() int32 {
	if o == nil || o.ModifyIndex == nil {
		var ret int32
		return ret
	}
	return *o.ModifyIndex
}

// GetModifyIndexOk returns a tuple with the ModifyIndex field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CSIVolume) GetModifyIndexOk() (*int32, bool) {
	if o == nil || o.ModifyIndex == nil {
		return nil, false
	}
	return o.ModifyIndex, true
}

// HasModifyIndex returns a boolean if a field has been set.
func (o *CSIVolume) HasModifyIndex() bool {
	if o != nil && o.ModifyIndex != nil {
		return true
	}

	return false
}

// SetModifyIndex gets a reference to the given int32 and assigns it to the ModifyIndex field.
func (o *CSIVolume) SetModifyIndex(v int32) {
	o.ModifyIndex = &v
}

// GetMountOptions returns the MountOptions field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CSIVolume) GetMountOptions() CSIMountOptions {
	if o == nil || o.MountOptions.Get() == nil {
		var ret CSIMountOptions
		return ret
	}
	return *o.MountOptions.Get()
}

// GetMountOptionsOk returns a tuple with the MountOptions field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CSIVolume) GetMountOptionsOk() (*CSIMountOptions, bool) {
	if o == nil {
		return nil, false
	}
	return o.MountOptions.Get(), o.MountOptions.IsSet()
}

// HasMountOptions returns a boolean if a field has been set.
func (o *CSIVolume) HasMountOptions() bool {
	if o != nil && o.MountOptions.IsSet() {
		return true
	}

	return false
}

// SetMountOptions gets a reference to the given NullableCSIMountOptions and assigns it to the MountOptions field.
func (o *CSIVolume) SetMountOptions(v CSIMountOptions) {
	o.MountOptions.Set(&v)
}
// SetMountOptionsNil sets the value for MountOptions to be an explicit nil
func (o *CSIVolume) SetMountOptionsNil() {
	o.MountOptions.Set(nil)
}

// UnsetMountOptions ensures that no value is present for MountOptions, not even an explicit nil
func (o *CSIVolume) UnsetMountOptions() {
	o.MountOptions.Unset()
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *CSIVolume) GetName() string {
	if o == nil || o.Name == nil {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CSIVolume) GetNameOk() (*string, bool) {
	if o == nil || o.Name == nil {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *CSIVolume) HasName() bool {
	if o != nil && o.Name != nil {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *CSIVolume) SetName(v string) {
	o.Name = &v
}

// GetNamespace returns the Namespace field value if set, zero value otherwise.
func (o *CSIVolume) GetNamespace() string {
	if o == nil || o.Namespace == nil {
		var ret string
		return ret
	}
	return *o.Namespace
}

// GetNamespaceOk returns a tuple with the Namespace field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CSIVolume) GetNamespaceOk() (*string, bool) {
	if o == nil || o.Namespace == nil {
		return nil, false
	}
	return o.Namespace, true
}

// HasNamespace returns a boolean if a field has been set.
func (o *CSIVolume) HasNamespace() bool {
	if o != nil && o.Namespace != nil {
		return true
	}

	return false
}

// SetNamespace gets a reference to the given string and assigns it to the Namespace field.
func (o *CSIVolume) SetNamespace(v string) {
	o.Namespace = &v
}

// GetNodesExpected returns the NodesExpected field value if set, zero value otherwise.
func (o *CSIVolume) GetNodesExpected() int32 {
	if o == nil || o.NodesExpected == nil {
		var ret int32
		return ret
	}
	return *o.NodesExpected
}

// GetNodesExpectedOk returns a tuple with the NodesExpected field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CSIVolume) GetNodesExpectedOk() (*int32, bool) {
	if o == nil || o.NodesExpected == nil {
		return nil, false
	}
	return o.NodesExpected, true
}

// HasNodesExpected returns a boolean if a field has been set.
func (o *CSIVolume) HasNodesExpected() bool {
	if o != nil && o.NodesExpected != nil {
		return true
	}

	return false
}

// SetNodesExpected gets a reference to the given int32 and assigns it to the NodesExpected field.
func (o *CSIVolume) SetNodesExpected(v int32) {
	o.NodesExpected = &v
}

// GetNodesHealthy returns the NodesHealthy field value if set, zero value otherwise.
func (o *CSIVolume) GetNodesHealthy() int32 {
	if o == nil || o.NodesHealthy == nil {
		var ret int32
		return ret
	}
	return *o.NodesHealthy
}

// GetNodesHealthyOk returns a tuple with the NodesHealthy field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CSIVolume) GetNodesHealthyOk() (*int32, bool) {
	if o == nil || o.NodesHealthy == nil {
		return nil, false
	}
	return o.NodesHealthy, true
}

// HasNodesHealthy returns a boolean if a field has been set.
func (o *CSIVolume) HasNodesHealthy() bool {
	if o != nil && o.NodesHealthy != nil {
		return true
	}

	return false
}

// SetNodesHealthy gets a reference to the given int32 and assigns it to the NodesHealthy field.
func (o *CSIVolume) SetNodesHealthy(v int32) {
	o.NodesHealthy = &v
}

// GetParameters returns the Parameters field value if set, zero value otherwise.
func (o *CSIVolume) GetParameters() map[string]string {
	if o == nil || o.Parameters == nil {
		var ret map[string]string
		return ret
	}
	return *o.Parameters
}

// GetParametersOk returns a tuple with the Parameters field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CSIVolume) GetParametersOk() (*map[string]string, bool) {
	if o == nil || o.Parameters == nil {
		return nil, false
	}
	return o.Parameters, true
}

// HasParameters returns a boolean if a field has been set.
func (o *CSIVolume) HasParameters() bool {
	if o != nil && o.Parameters != nil {
		return true
	}

	return false
}

// SetParameters gets a reference to the given map[string]string and assigns it to the Parameters field.
func (o *CSIVolume) SetParameters(v map[string]string) {
	o.Parameters = &v
}

// GetPluginID returns the PluginID field value if set, zero value otherwise.
func (o *CSIVolume) GetPluginID() string {
	if o == nil || o.PluginID == nil {
		var ret string
		return ret
	}
	return *o.PluginID
}

// GetPluginIDOk returns a tuple with the PluginID field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CSIVolume) GetPluginIDOk() (*string, bool) {
	if o == nil || o.PluginID == nil {
		return nil, false
	}
	return o.PluginID, true
}

// HasPluginID returns a boolean if a field has been set.
func (o *CSIVolume) HasPluginID() bool {
	if o != nil && o.PluginID != nil {
		return true
	}

	return false
}

// SetPluginID gets a reference to the given string and assigns it to the PluginID field.
func (o *CSIVolume) SetPluginID(v string) {
	o.PluginID = &v
}

// GetProvider returns the Provider field value if set, zero value otherwise.
func (o *CSIVolume) GetProvider() string {
	if o == nil || o.Provider == nil {
		var ret string
		return ret
	}
	return *o.Provider
}

// GetProviderOk returns a tuple with the Provider field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CSIVolume) GetProviderOk() (*string, bool) {
	if o == nil || o.Provider == nil {
		return nil, false
	}
	return o.Provider, true
}

// HasProvider returns a boolean if a field has been set.
func (o *CSIVolume) HasProvider() bool {
	if o != nil && o.Provider != nil {
		return true
	}

	return false
}

// SetProvider gets a reference to the given string and assigns it to the Provider field.
func (o *CSIVolume) SetProvider(v string) {
	o.Provider = &v
}

// GetProviderVersion returns the ProviderVersion field value if set, zero value otherwise.
func (o *CSIVolume) GetProviderVersion() string {
	if o == nil || o.ProviderVersion == nil {
		var ret string
		return ret
	}
	return *o.ProviderVersion
}

// GetProviderVersionOk returns a tuple with the ProviderVersion field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CSIVolume) GetProviderVersionOk() (*string, bool) {
	if o == nil || o.ProviderVersion == nil {
		return nil, false
	}
	return o.ProviderVersion, true
}

// HasProviderVersion returns a boolean if a field has been set.
func (o *CSIVolume) HasProviderVersion() bool {
	if o != nil && o.ProviderVersion != nil {
		return true
	}

	return false
}

// SetProviderVersion gets a reference to the given string and assigns it to the ProviderVersion field.
func (o *CSIVolume) SetProviderVersion(v string) {
	o.ProviderVersion = &v
}

// GetReadAllocs returns the ReadAllocs field value if set, zero value otherwise.
func (o *CSIVolume) GetReadAllocs() map[string]Allocation {
	if o == nil || o.ReadAllocs == nil {
		var ret map[string]Allocation
		return ret
	}
	return *o.ReadAllocs
}

// GetReadAllocsOk returns a tuple with the ReadAllocs field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CSIVolume) GetReadAllocsOk() (*map[string]Allocation, bool) {
	if o == nil || o.ReadAllocs == nil {
		return nil, false
	}
	return o.ReadAllocs, true
}

// HasReadAllocs returns a boolean if a field has been set.
func (o *CSIVolume) HasReadAllocs() bool {
	if o != nil && o.ReadAllocs != nil {
		return true
	}

	return false
}

// SetReadAllocs gets a reference to the given map[string]Allocation and assigns it to the ReadAllocs field.
func (o *CSIVolume) SetReadAllocs(v map[string]Allocation) {
	o.ReadAllocs = &v
}

// GetRequestedCapabilities returns the RequestedCapabilities field value if set, zero value otherwise.
func (o *CSIVolume) GetRequestedCapabilities() []CSIVolumeCapability {
	if o == nil || o.RequestedCapabilities == nil {
		var ret []CSIVolumeCapability
		return ret
	}
	return o.RequestedCapabilities
}

// GetRequestedCapabilitiesOk returns a tuple with the RequestedCapabilities field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CSIVolume) GetRequestedCapabilitiesOk() ([]CSIVolumeCapability, bool) {
	if o == nil || o.RequestedCapabilities == nil {
		return nil, false
	}
	return o.RequestedCapabilities, true
}

// HasRequestedCapabilities returns a boolean if a field has been set.
func (o *CSIVolume) HasRequestedCapabilities() bool {
	if o != nil && o.RequestedCapabilities != nil {
		return true
	}

	return false
}

// SetRequestedCapabilities gets a reference to the given []CSIVolumeCapability and assigns it to the RequestedCapabilities field.
func (o *CSIVolume) SetRequestedCapabilities(v []CSIVolumeCapability) {
	o.RequestedCapabilities = v
}

// GetRequestedCapacityMax returns the RequestedCapacityMax field value if set, zero value otherwise.
func (o *CSIVolume) GetRequestedCapacityMax() int64 {
	if o == nil || o.RequestedCapacityMax == nil {
		var ret int64
		return ret
	}
	return *o.RequestedCapacityMax
}

// GetRequestedCapacityMaxOk returns a tuple with the RequestedCapacityMax field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CSIVolume) GetRequestedCapacityMaxOk() (*int64, bool) {
	if o == nil || o.RequestedCapacityMax == nil {
		return nil, false
	}
	return o.RequestedCapacityMax, true
}

// HasRequestedCapacityMax returns a boolean if a field has been set.
func (o *CSIVolume) HasRequestedCapacityMax() bool {
	if o != nil && o.RequestedCapacityMax != nil {
		return true
	}

	return false
}

// SetRequestedCapacityMax gets a reference to the given int64 and assigns it to the RequestedCapacityMax field.
func (o *CSIVolume) SetRequestedCapacityMax(v int64) {
	o.RequestedCapacityMax = &v
}

// GetRequestedCapacityMin returns the RequestedCapacityMin field value if set, zero value otherwise.
func (o *CSIVolume) GetRequestedCapacityMin() int64 {
	if o == nil || o.RequestedCapacityMin == nil {
		var ret int64
		return ret
	}
	return *o.RequestedCapacityMin
}

// GetRequestedCapacityMinOk returns a tuple with the RequestedCapacityMin field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CSIVolume) GetRequestedCapacityMinOk() (*int64, bool) {
	if o == nil || o.RequestedCapacityMin == nil {
		return nil, false
	}
	return o.RequestedCapacityMin, true
}

// HasRequestedCapacityMin returns a boolean if a field has been set.
func (o *CSIVolume) HasRequestedCapacityMin() bool {
	if o != nil && o.RequestedCapacityMin != nil {
		return true
	}

	return false
}

// SetRequestedCapacityMin gets a reference to the given int64 and assigns it to the RequestedCapacityMin field.
func (o *CSIVolume) SetRequestedCapacityMin(v int64) {
	o.RequestedCapacityMin = &v
}

// GetRequestedTopologies returns the RequestedTopologies field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CSIVolume) GetRequestedTopologies() CSITopologyRequest {
	if o == nil || o.RequestedTopologies.Get() == nil {
		var ret CSITopologyRequest
		return ret
	}
	return *o.RequestedTopologies.Get()
}

// GetRequestedTopologiesOk returns a tuple with the RequestedTopologies field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CSIVolume) GetRequestedTopologiesOk() (*CSITopologyRequest, bool) {
	if o == nil {
		return nil, false
	}
	return o.RequestedTopologies.Get(), o.RequestedTopologies.IsSet()
}

// HasRequestedTopologies returns a boolean if a field has been set.
func (o *CSIVolume) HasRequestedTopologies() bool {
	if o != nil && o.RequestedTopologies.IsSet() {
		return true
	}

	return false
}

// SetRequestedTopologies gets a reference to the given NullableCSITopologyRequest and assigns it to the RequestedTopologies field.
func (o *CSIVolume) SetRequestedTopologies(v CSITopologyRequest) {
	o.RequestedTopologies.Set(&v)
}
// SetRequestedTopologiesNil sets the value for RequestedTopologies to be an explicit nil
func (o *CSIVolume) SetRequestedTopologiesNil() {
	o.RequestedTopologies.Set(nil)
}

// UnsetRequestedTopologies ensures that no value is present for RequestedTopologies, not even an explicit nil
func (o *CSIVolume) UnsetRequestedTopologies() {
	o.RequestedTopologies.Unset()
}

// GetResourceExhausted returns the ResourceExhausted field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CSIVolume) GetResourceExhausted() time.Time {
	if o == nil || o.ResourceExhausted.Get() == nil {
		var ret time.Time
		return ret
	}
	return *o.ResourceExhausted.Get()
}

// GetResourceExhaustedOk returns a tuple with the ResourceExhausted field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CSIVolume) GetResourceExhaustedOk() (*time.Time, bool) {
	if o == nil {
		return nil, false
	}
	return o.ResourceExhausted.Get(), o.ResourceExhausted.IsSet()
}

// HasResourceExhausted returns a boolean if a field has been set.
func (o *CSIVolume) HasResourceExhausted() bool {
	if o != nil && o.ResourceExhausted.IsSet() {
		return true
	}

	return false
}

// SetResourceExhausted gets a reference to the given NullableTime and assigns it to the ResourceExhausted field.
func (o *CSIVolume) SetResourceExhausted(v time.Time) {
	o.ResourceExhausted.Set(&v)
}
// SetResourceExhaustedNil sets the value for ResourceExhausted to be an explicit nil
func (o *CSIVolume) SetResourceExhaustedNil() {
	o.ResourceExhausted.Set(nil)
}

// UnsetResourceExhausted ensures that no value is present for ResourceExhausted, not even an explicit nil
func (o *CSIVolume) UnsetResourceExhausted() {
	o.ResourceExhausted.Unset()
}

// GetSchedulable returns the Schedulable field value if set, zero value otherwise.
func (o *CSIVolume) GetSchedulable() bool {
	if o == nil || o.Schedulable == nil {
		var ret bool
		return ret
	}
	return *o.Schedulable
}

// GetSchedulableOk returns a tuple with the Schedulable field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CSIVolume) GetSchedulableOk() (*bool, bool) {
	if o == nil || o.Schedulable == nil {
		return nil, false
	}
	return o.Schedulable, true
}

// HasSchedulable returns a boolean if a field has been set.
func (o *CSIVolume) HasSchedulable() bool {
	if o != nil && o.Schedulable != nil {
		return true
	}

	return false
}

// SetSchedulable gets a reference to the given bool and assigns it to the Schedulable field.
func (o *CSIVolume) SetSchedulable(v bool) {
	o.Schedulable = &v
}

// GetSecrets returns the Secrets field value if set, zero value otherwise.
func (o *CSIVolume) GetSecrets() map[string]string {
	if o == nil || o.Secrets == nil {
		var ret map[string]string
		return ret
	}
	return *o.Secrets
}

// GetSecretsOk returns a tuple with the Secrets field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CSIVolume) GetSecretsOk() (*map[string]string, bool) {
	if o == nil || o.Secrets == nil {
		return nil, false
	}
	return o.Secrets, true
}

// HasSecrets returns a boolean if a field has been set.
func (o *CSIVolume) HasSecrets() bool {
	if o != nil && o.Secrets != nil {
		return true
	}

	return false
}

// SetSecrets gets a reference to the given map[string]string and assigns it to the Secrets field.
func (o *CSIVolume) SetSecrets(v map[string]string) {
	o.Secrets = &v
}

// GetSnapshotID returns the SnapshotID field value if set, zero value otherwise.
func (o *CSIVolume) GetSnapshotID() string {
	if o == nil || o.SnapshotID == nil {
		var ret string
		return ret
	}
	return *o.SnapshotID
}

// GetSnapshotIDOk returns a tuple with the SnapshotID field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CSIVolume) GetSnapshotIDOk() (*string, bool) {
	if o == nil || o.SnapshotID == nil {
		return nil, false
	}
	return o.SnapshotID, true
}

// HasSnapshotID returns a boolean if a field has been set.
func (o *CSIVolume) HasSnapshotID() bool {
	if o != nil && o.SnapshotID != nil {
		return true
	}

	return false
}

// SetSnapshotID gets a reference to the given string and assigns it to the SnapshotID field.
func (o *CSIVolume) SetSnapshotID(v string) {
	o.SnapshotID = &v
}

// GetTopologies returns the Topologies field value if set, zero value otherwise.
func (o *CSIVolume) GetTopologies() []CSITopology {
	if o == nil || o.Topologies == nil {
		var ret []CSITopology
		return ret
	}
	return o.Topologies
}

// GetTopologiesOk returns a tuple with the Topologies field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CSIVolume) GetTopologiesOk() ([]CSITopology, bool) {
	if o == nil || o.Topologies == nil {
		return nil, false
	}
	return o.Topologies, true
}

// HasTopologies returns a boolean if a field has been set.
func (o *CSIVolume) HasTopologies() bool {
	if o != nil && o.Topologies != nil {
		return true
	}

	return false
}

// SetTopologies gets a reference to the given []CSITopology and assigns it to the Topologies field.
func (o *CSIVolume) SetTopologies(v []CSITopology) {
	o.Topologies = v
}

// GetWriteAllocs returns the WriteAllocs field value if set, zero value otherwise.
func (o *CSIVolume) GetWriteAllocs() map[string]Allocation {
	if o == nil || o.WriteAllocs == nil {
		var ret map[string]Allocation
		return ret
	}
	return *o.WriteAllocs
}

// GetWriteAllocsOk returns a tuple with the WriteAllocs field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CSIVolume) GetWriteAllocsOk() (*map[string]Allocation, bool) {
	if o == nil || o.WriteAllocs == nil {
		return nil, false
	}
	return o.WriteAllocs, true
}

// HasWriteAllocs returns a boolean if a field has been set.
func (o *CSIVolume) HasWriteAllocs() bool {
	if o != nil && o.WriteAllocs != nil {
		return true
	}

	return false
}

// SetWriteAllocs gets a reference to the given map[string]Allocation and assigns it to the WriteAllocs field.
func (o *CSIVolume) SetWriteAllocs(v map[string]Allocation) {
	o.WriteAllocs = &v
}

func (o CSIVolume) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.AccessMode != nil {
		toSerialize["AccessMode"] = o.AccessMode
	}
	if o.Allocations != nil {
		toSerialize["Allocations"] = o.Allocations
	}
	if o.AttachmentMode != nil {
		toSerialize["AttachmentMode"] = o.AttachmentMode
	}
	if o.Capacity != nil {
		toSerialize["Capacity"] = o.Capacity
	}
	if o.CloneID != nil {
		toSerialize["CloneID"] = o.CloneID
	}
	if o.Context != nil {
		toSerialize["Context"] = o.Context
	}
	if o.ControllerRequired != nil {
		toSerialize["ControllerRequired"] = o.ControllerRequired
	}
	if o.ControllersExpected != nil {
		toSerialize["ControllersExpected"] = o.ControllersExpected
	}
	if o.ControllersHealthy != nil {
		toSerialize["ControllersHealthy"] = o.ControllersHealthy
	}
	if o.CreateIndex != nil {
		toSerialize["CreateIndex"] = o.CreateIndex
	}
	if o.ExternalID != nil {
		toSerialize["ExternalID"] = o.ExternalID
	}
	if o.ID != nil {
		toSerialize["ID"] = o.ID
	}
	if o.ModifyIndex != nil {
		toSerialize["ModifyIndex"] = o.ModifyIndex
	}
	if o.MountOptions.IsSet() {
		toSerialize["MountOptions"] = o.MountOptions.Get()
	}
	if o.Name != nil {
		toSerialize["Name"] = o.Name
	}
	if o.Namespace != nil {
		toSerialize["Namespace"] = o.Namespace
	}
	if o.NodesExpected != nil {
		toSerialize["NodesExpected"] = o.NodesExpected
	}
	if o.NodesHealthy != nil {
		toSerialize["NodesHealthy"] = o.NodesHealthy
	}
	if o.Parameters != nil {
		toSerialize["Parameters"] = o.Parameters
	}
	if o.PluginID != nil {
		toSerialize["PluginID"] = o.PluginID
	}
	if o.Provider != nil {
		toSerialize["Provider"] = o.Provider
	}
	if o.ProviderVersion != nil {
		toSerialize["ProviderVersion"] = o.ProviderVersion
	}
	if o.ReadAllocs != nil {
		toSerialize["ReadAllocs"] = o.ReadAllocs
	}
	if o.RequestedCapabilities != nil {
		toSerialize["RequestedCapabilities"] = o.RequestedCapabilities
	}
	if o.RequestedCapacityMax != nil {
		toSerialize["RequestedCapacityMax"] = o.RequestedCapacityMax
	}
	if o.RequestedCapacityMin != nil {
		toSerialize["RequestedCapacityMin"] = o.RequestedCapacityMin
	}
	if o.RequestedTopologies.IsSet() {
		toSerialize["RequestedTopologies"] = o.RequestedTopologies.Get()
	}
	if o.ResourceExhausted.IsSet() {
		toSerialize["ResourceExhausted"] = o.ResourceExhausted.Get()
	}
	if o.Schedulable != nil {
		toSerialize["Schedulable"] = o.Schedulable
	}
	if o.Secrets != nil {
		toSerialize["Secrets"] = o.Secrets
	}
	if o.SnapshotID != nil {
		toSerialize["SnapshotID"] = o.SnapshotID
	}
	if o.Topologies != nil {
		toSerialize["Topologies"] = o.Topologies
	}
	if o.WriteAllocs != nil {
		toSerialize["WriteAllocs"] = o.WriteAllocs
	}
	return json.Marshal(toSerialize)
}

type NullableCSIVolume struct {
	value *CSIVolume
	isSet bool
}

func (v NullableCSIVolume) Get() *CSIVolume {
	return v.value
}

func (v *NullableCSIVolume) Set(val *CSIVolume) {
	v.value = val
	v.isSet = true
}

func (v NullableCSIVolume) IsSet() bool {
	return v.isSet
}

func (v *NullableCSIVolume) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCSIVolume(val *CSIVolume) *NullableCSIVolume {
	return &NullableCSIVolume{value: val, isSet: true}
}

func (v NullableCSIVolume) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCSIVolume) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


