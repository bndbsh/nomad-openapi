/**
 * Nomad
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.1.4
 * Contact: support@hashicorp.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The GaugeValue model module.
 * @module model/GaugeValue
 * @version 1.1.4
 */
class GaugeValue {
    /**
     * Constructs a new <code>GaugeValue</code>.
     * @alias module:model/GaugeValue
     */
    constructor() { 
        
        GaugeValue.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>GaugeValue</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GaugeValue} obj Optional instance to populate.
     * @return {module:model/GaugeValue} The populated <code>GaugeValue</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GaugeValue();

            if (data.hasOwnProperty('Labels')) {
                obj['Labels'] = ApiClient.convertToType(data['Labels'], {'String': 'String'});
            }
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Value')) {
                obj['Value'] = ApiClient.convertToType(data['Value'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * @member {Object.<String, String>} Labels
 */
GaugeValue.prototype['Labels'] = undefined;

/**
 * @member {String} Name
 */
GaugeValue.prototype['Name'] = undefined;

/**
 * @member {Number} Value
 */
GaugeValue.prototype['Value'] = undefined;






export default GaugeValue;
