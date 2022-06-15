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
pub struct Service {
    #[serde(rename = "Address", skip_serializing_if = "Option::is_none")]
    pub address: Option<String>,
    #[serde(rename = "AddressMode", skip_serializing_if = "Option::is_none")]
    pub address_mode: Option<String>,
    #[serde(rename = "CanaryMeta", skip_serializing_if = "Option::is_none")]
    pub canary_meta: Option<::std::collections::HashMap<String, String>>,
    #[serde(rename = "CanaryTags", skip_serializing_if = "Option::is_none")]
    pub canary_tags: Option<Vec<String>>,
    #[serde(rename = "CheckRestart", skip_serializing_if = "Option::is_none")]
    pub check_restart: Option<Box<crate::models::CheckRestart>>,
    #[serde(rename = "Checks", skip_serializing_if = "Option::is_none")]
    pub checks: Option<Vec<crate::models::ServiceCheck>>,
    #[serde(rename = "Connect", skip_serializing_if = "Option::is_none")]
    pub connect: Option<Box<crate::models::ConsulConnect>>,
    #[serde(rename = "EnableTagOverride", skip_serializing_if = "Option::is_none")]
    pub enable_tag_override: Option<bool>,
    #[serde(rename = "Meta", skip_serializing_if = "Option::is_none")]
    pub meta: Option<::std::collections::HashMap<String, String>>,
    #[serde(rename = "Name", skip_serializing_if = "Option::is_none")]
    pub name: Option<String>,
    #[serde(rename = "OnUpdate", skip_serializing_if = "Option::is_none")]
    pub on_update: Option<String>,
    #[serde(rename = "PortLabel", skip_serializing_if = "Option::is_none")]
    pub port_label: Option<String>,
    #[serde(rename = "Provider", skip_serializing_if = "Option::is_none")]
    pub provider: Option<String>,
    #[serde(rename = "Tags", skip_serializing_if = "Option::is_none")]
    pub tags: Option<Vec<String>>,
    #[serde(rename = "TaskName", skip_serializing_if = "Option::is_none")]
    pub task_name: Option<String>,
}

impl Service {
    pub fn new() -> Service {
        Service {
            address: None,
            address_mode: None,
            canary_meta: None,
            canary_tags: None,
            check_restart: None,
            checks: None,
            connect: None,
            enable_tag_override: None,
            meta: None,
            name: None,
            on_update: None,
            port_label: None,
            provider: None,
            tags: None,
            task_name: None,
        }
    }
}


