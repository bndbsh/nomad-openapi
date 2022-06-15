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

export class ConsulExposePath {
    'listenerPort'?: string;
    'localPathPort'?: number;
    'path'?: string;
    'protocol'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "listenerPort",
            "baseName": "ListenerPort",
            "type": "string",
            "format": ""
        },
        {
            "name": "localPathPort",
            "baseName": "LocalPathPort",
            "type": "number",
            "format": ""
        },
        {
            "name": "path",
            "baseName": "Path",
            "type": "string",
            "format": ""
        },
        {
            "name": "protocol",
            "baseName": "Protocol",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ConsulExposePath.attributeTypeMap;
    }

    public constructor() {
    }
}

