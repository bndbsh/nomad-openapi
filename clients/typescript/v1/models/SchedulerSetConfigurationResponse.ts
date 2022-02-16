/**
 * Nomad
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 1.1.4
 * Contact: support@hashicorp.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { HttpFile } from '../http/http';

export class SchedulerSetConfigurationResponse {
    'lastIndex'?: number;
    'requestTime'?: number;
    'updated'?: boolean;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "lastIndex",
            "baseName": "LastIndex",
            "type": "number",
            "format": ""
        },
        {
            "name": "requestTime",
            "baseName": "RequestTime",
            "type": "number",
            "format": "int64"
        },
        {
            "name": "updated",
            "baseName": "Updated",
            "type": "boolean",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return SchedulerSetConfigurationResponse.attributeTypeMap;
    }
    
    public constructor() {
    }
}
