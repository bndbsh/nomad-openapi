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
pub struct Consul {
    #[serde(rename = "Namespace", skip_serializing_if = "Option::is_none")]
    pub namespace: Option<String>,
}

impl Consul {
    pub fn new() -> Consul {
        Consul {
            namespace: None,
        }
    }
}


