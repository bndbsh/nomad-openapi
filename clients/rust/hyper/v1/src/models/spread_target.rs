/*
 * Nomad
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.1.4
 * Contact: support@hashicorp.com
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Default, Serialize, Deserialize)]
pub struct SpreadTarget {
    #[serde(rename = "Percent", skip_serializing_if = "Option::is_none")]
    pub percent: Option<i32>,
    #[serde(rename = "Value", skip_serializing_if = "Option::is_none")]
    pub value: Option<String>,
}

impl SpreadTarget {
    pub fn new() -> SpreadTarget {
        SpreadTarget {
            percent: None,
            value: None,
        }
    }
}


