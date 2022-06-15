=begin
#Nomad

#No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

The version of the OpenAPI document: 1.1.4
Contact: support@hashicorp.com
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.0.0

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for NomadClient::NodeCpuResources
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe NomadClient::NodeCpuResources do
  let(:instance) { NomadClient::NodeCpuResources.new }

  describe 'test an instance of NodeCpuResources' do
    it 'should create an instance of NodeCpuResources' do
      expect(instance).to be_instance_of(NomadClient::NodeCpuResources)
    end
  end
  describe 'test attribute "cpu_shares"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "reservable_cpu_cores"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "total_cpu_cores"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
