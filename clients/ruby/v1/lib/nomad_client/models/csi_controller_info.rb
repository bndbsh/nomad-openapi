=begin
#Nomad

#No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

The version of the OpenAPI document: 1.1.4
Contact: support@hashicorp.com
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.0.0

=end

require 'date'
require 'time'

module NomadClient
  class CSIControllerInfo
    attr_accessor :supports_attach_detach

    attr_accessor :supports_clone

    attr_accessor :supports_condition

    attr_accessor :supports_create_delete

    attr_accessor :supports_create_delete_snapshot

    attr_accessor :supports_expand

    attr_accessor :supports_get

    attr_accessor :supports_get_capacity

    attr_accessor :supports_list_snapshots

    attr_accessor :supports_list_volumes

    attr_accessor :supports_list_volumes_attached_nodes

    attr_accessor :supports_read_only_attach

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'supports_attach_detach' => :'SupportsAttachDetach',
        :'supports_clone' => :'SupportsClone',
        :'supports_condition' => :'SupportsCondition',
        :'supports_create_delete' => :'SupportsCreateDelete',
        :'supports_create_delete_snapshot' => :'SupportsCreateDeleteSnapshot',
        :'supports_expand' => :'SupportsExpand',
        :'supports_get' => :'SupportsGet',
        :'supports_get_capacity' => :'SupportsGetCapacity',
        :'supports_list_snapshots' => :'SupportsListSnapshots',
        :'supports_list_volumes' => :'SupportsListVolumes',
        :'supports_list_volumes_attached_nodes' => :'SupportsListVolumesAttachedNodes',
        :'supports_read_only_attach' => :'SupportsReadOnlyAttach'
      }
    end

    # Returns all the JSON keys this model knows about
    def self.acceptable_attributes
      attribute_map.values
    end

    # Attribute type mapping.
    def self.openapi_types
      {
        :'supports_attach_detach' => :'Boolean',
        :'supports_clone' => :'Boolean',
        :'supports_condition' => :'Boolean',
        :'supports_create_delete' => :'Boolean',
        :'supports_create_delete_snapshot' => :'Boolean',
        :'supports_expand' => :'Boolean',
        :'supports_get' => :'Boolean',
        :'supports_get_capacity' => :'Boolean',
        :'supports_list_snapshots' => :'Boolean',
        :'supports_list_volumes' => :'Boolean',
        :'supports_list_volumes_attached_nodes' => :'Boolean',
        :'supports_read_only_attach' => :'Boolean'
      }
    end

    # List of attributes with nullable: true
    def self.openapi_nullable
      Set.new([
      ])
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `NomadClient::CSIControllerInfo` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `NomadClient::CSIControllerInfo`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'supports_attach_detach')
        self.supports_attach_detach = attributes[:'supports_attach_detach']
      end

      if attributes.key?(:'supports_clone')
        self.supports_clone = attributes[:'supports_clone']
      end

      if attributes.key?(:'supports_condition')
        self.supports_condition = attributes[:'supports_condition']
      end

      if attributes.key?(:'supports_create_delete')
        self.supports_create_delete = attributes[:'supports_create_delete']
      end

      if attributes.key?(:'supports_create_delete_snapshot')
        self.supports_create_delete_snapshot = attributes[:'supports_create_delete_snapshot']
      end

      if attributes.key?(:'supports_expand')
        self.supports_expand = attributes[:'supports_expand']
      end

      if attributes.key?(:'supports_get')
        self.supports_get = attributes[:'supports_get']
      end

      if attributes.key?(:'supports_get_capacity')
        self.supports_get_capacity = attributes[:'supports_get_capacity']
      end

      if attributes.key?(:'supports_list_snapshots')
        self.supports_list_snapshots = attributes[:'supports_list_snapshots']
      end

      if attributes.key?(:'supports_list_volumes')
        self.supports_list_volumes = attributes[:'supports_list_volumes']
      end

      if attributes.key?(:'supports_list_volumes_attached_nodes')
        self.supports_list_volumes_attached_nodes = attributes[:'supports_list_volumes_attached_nodes']
      end

      if attributes.key?(:'supports_read_only_attach')
        self.supports_read_only_attach = attributes[:'supports_read_only_attach']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          supports_attach_detach == o.supports_attach_detach &&
          supports_clone == o.supports_clone &&
          supports_condition == o.supports_condition &&
          supports_create_delete == o.supports_create_delete &&
          supports_create_delete_snapshot == o.supports_create_delete_snapshot &&
          supports_expand == o.supports_expand &&
          supports_get == o.supports_get &&
          supports_get_capacity == o.supports_get_capacity &&
          supports_list_snapshots == o.supports_list_snapshots &&
          supports_list_volumes == o.supports_list_volumes &&
          supports_list_volumes_attached_nodes == o.supports_list_volumes_attached_nodes &&
          supports_read_only_attach == o.supports_read_only_attach
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [supports_attach_detach, supports_clone, supports_condition, supports_create_delete, supports_create_delete_snapshot, supports_expand, supports_get, supports_get_capacity, supports_list_snapshots, supports_list_volumes, supports_list_volumes_attached_nodes, supports_read_only_attach].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def self.build_from_hash(attributes)
      new.build_from_hash(attributes)
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      attributes = attributes.transform_keys(&:to_sym)
      self.class.openapi_types.each_pair do |key, type|
        if attributes[self.class.attribute_map[key]].nil? && self.class.openapi_nullable.include?(key)
          self.send("#{key}=", nil)
        elsif type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map { |v| _deserialize($1, v) })
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        end
      end

      self
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def _deserialize(type, value)
      case type.to_sym
      when :Time
        Time.parse(value)
      when :Date
        Date.parse(value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :Boolean
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        {}.tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        # models (e.g. Pet) or oneOf
        klass = NomadClient.const_get(type)
        klass.respond_to?(:openapi_one_of) ? klass.build(value) : klass.build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {}
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        if value.nil?
          is_nullable = self.class.openapi_nullable.include?(attr)
          next if !is_nullable || (is_nullable && !instance_variable_defined?(:"@#{attr}"))
        end

        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map { |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        {}.tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end

  end

end
