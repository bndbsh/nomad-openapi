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
pub struct AllocatedMemoryResources {
    #[serde(rename = "MemoryMB", skip_serializing_if = "Option::is_none")]
    pub memory_mb: Option<i64>,
    #[serde(rename = "MemoryMaxMB", skip_serializing_if = "Option::is_none")]
    pub memory_max_mb: Option<i64>,
}

impl AllocatedMemoryResources {
    pub fn new() -> AllocatedMemoryResources {
        AllocatedMemoryResources {
            memory_mb: None,
            memory_max_mb: None,
        }
    }
}


