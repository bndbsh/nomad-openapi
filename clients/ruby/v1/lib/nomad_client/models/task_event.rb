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
  class TaskEvent
    attr_accessor :details

    attr_accessor :disk_limit

    attr_accessor :disk_size

    attr_accessor :display_message

    attr_accessor :download_error

    attr_accessor :driver_error

    attr_accessor :driver_message

    attr_accessor :exit_code

    attr_accessor :failed_sibling

    attr_accessor :fails_task

    attr_accessor :generic_source

    attr_accessor :kill_error

    attr_accessor :kill_reason

    attr_accessor :kill_timeout

    attr_accessor :message

    attr_accessor :restart_reason

    attr_accessor :setup_error

    attr_accessor :signal

    attr_accessor :start_delay

    attr_accessor :task_signal

    attr_accessor :task_signal_reason

    attr_accessor :time

    attr_accessor :type

    attr_accessor :validation_error

    attr_accessor :vault_error

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'details' => :'Details',
        :'disk_limit' => :'DiskLimit',
        :'disk_size' => :'DiskSize',
        :'display_message' => :'DisplayMessage',
        :'download_error' => :'DownloadError',
        :'driver_error' => :'DriverError',
        :'driver_message' => :'DriverMessage',
        :'exit_code' => :'ExitCode',
        :'failed_sibling' => :'FailedSibling',
        :'fails_task' => :'FailsTask',
        :'generic_source' => :'GenericSource',
        :'kill_error' => :'KillError',
        :'kill_reason' => :'KillReason',
        :'kill_timeout' => :'KillTimeout',
        :'message' => :'Message',
        :'restart_reason' => :'RestartReason',
        :'setup_error' => :'SetupError',
        :'signal' => :'Signal',
        :'start_delay' => :'StartDelay',
        :'task_signal' => :'TaskSignal',
        :'task_signal_reason' => :'TaskSignalReason',
        :'time' => :'Time',
        :'type' => :'Type',
        :'validation_error' => :'ValidationError',
        :'vault_error' => :'VaultError'
      }
    end

    # Returns all the JSON keys this model knows about
    def self.acceptable_attributes
      attribute_map.values
    end

    # Attribute type mapping.
    def self.openapi_types
      {
        :'details' => :'Hash<String, String>',
        :'disk_limit' => :'Integer',
        :'disk_size' => :'Integer',
        :'display_message' => :'String',
        :'download_error' => :'String',
        :'driver_error' => :'String',
        :'driver_message' => :'String',
        :'exit_code' => :'Integer',
        :'failed_sibling' => :'String',
        :'fails_task' => :'Boolean',
        :'generic_source' => :'String',
        :'kill_error' => :'String',
        :'kill_reason' => :'String',
        :'kill_timeout' => :'Integer',
        :'message' => :'String',
        :'restart_reason' => :'String',
        :'setup_error' => :'String',
        :'signal' => :'Integer',
        :'start_delay' => :'Integer',
        :'task_signal' => :'String',
        :'task_signal_reason' => :'String',
        :'time' => :'Integer',
        :'type' => :'String',
        :'validation_error' => :'String',
        :'vault_error' => :'String'
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
        fail ArgumentError, "The input argument (attributes) must be a hash in `NomadClient::TaskEvent` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `NomadClient::TaskEvent`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'details')
        if (value = attributes[:'details']).is_a?(Hash)
          self.details = value
        end
      end

      if attributes.key?(:'disk_limit')
        self.disk_limit = attributes[:'disk_limit']
      end

      if attributes.key?(:'disk_size')
        self.disk_size = attributes[:'disk_size']
      end

      if attributes.key?(:'display_message')
        self.display_message = attributes[:'display_message']
      end

      if attributes.key?(:'download_error')
        self.download_error = attributes[:'download_error']
      end

      if attributes.key?(:'driver_error')
        self.driver_error = attributes[:'driver_error']
      end

      if attributes.key?(:'driver_message')
        self.driver_message = attributes[:'driver_message']
      end

      if attributes.key?(:'exit_code')
        self.exit_code = attributes[:'exit_code']
      end

      if attributes.key?(:'failed_sibling')
        self.failed_sibling = attributes[:'failed_sibling']
      end

      if attributes.key?(:'fails_task')
        self.fails_task = attributes[:'fails_task']
      end

      if attributes.key?(:'generic_source')
        self.generic_source = attributes[:'generic_source']
      end

      if attributes.key?(:'kill_error')
        self.kill_error = attributes[:'kill_error']
      end

      if attributes.key?(:'kill_reason')
        self.kill_reason = attributes[:'kill_reason']
      end

      if attributes.key?(:'kill_timeout')
        self.kill_timeout = attributes[:'kill_timeout']
      end

      if attributes.key?(:'message')
        self.message = attributes[:'message']
      end

      if attributes.key?(:'restart_reason')
        self.restart_reason = attributes[:'restart_reason']
      end

      if attributes.key?(:'setup_error')
        self.setup_error = attributes[:'setup_error']
      end

      if attributes.key?(:'signal')
        self.signal = attributes[:'signal']
      end

      if attributes.key?(:'start_delay')
        self.start_delay = attributes[:'start_delay']
      end

      if attributes.key?(:'task_signal')
        self.task_signal = attributes[:'task_signal']
      end

      if attributes.key?(:'task_signal_reason')
        self.task_signal_reason = attributes[:'task_signal_reason']
      end

      if attributes.key?(:'time')
        self.time = attributes[:'time']
      end

      if attributes.key?(:'type')
        self.type = attributes[:'type']
      end

      if attributes.key?(:'validation_error')
        self.validation_error = attributes[:'validation_error']
      end

      if attributes.key?(:'vault_error')
        self.vault_error = attributes[:'vault_error']
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
          details == o.details &&
          disk_limit == o.disk_limit &&
          disk_size == o.disk_size &&
          display_message == o.display_message &&
          download_error == o.download_error &&
          driver_error == o.driver_error &&
          driver_message == o.driver_message &&
          exit_code == o.exit_code &&
          failed_sibling == o.failed_sibling &&
          fails_task == o.fails_task &&
          generic_source == o.generic_source &&
          kill_error == o.kill_error &&
          kill_reason == o.kill_reason &&
          kill_timeout == o.kill_timeout &&
          message == o.message &&
          restart_reason == o.restart_reason &&
          setup_error == o.setup_error &&
          signal == o.signal &&
          start_delay == o.start_delay &&
          task_signal == o.task_signal &&
          task_signal_reason == o.task_signal_reason &&
          time == o.time &&
          type == o.type &&
          validation_error == o.validation_error &&
          vault_error == o.vault_error
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [details, disk_limit, disk_size, display_message, download_error, driver_error, driver_message, exit_code, failed_sibling, fails_task, generic_source, kill_error, kill_reason, kill_timeout, message, restart_reason, setup_error, signal, start_delay, task_signal, task_signal_reason, time, type, validation_error, vault_error].hash
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
