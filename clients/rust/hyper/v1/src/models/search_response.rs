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
pub struct SearchResponse {
    #[serde(rename = "KnownLeader", skip_serializing_if = "Option::is_none")]
    pub known_leader: Option<bool>,
    #[serde(rename = "LastContact", skip_serializing_if = "Option::is_none")]
    pub last_contact: Option<i64>,
    #[serde(rename = "LastIndex", skip_serializing_if = "Option::is_none")]
    pub last_index: Option<i32>,
    #[serde(rename = "Matches", skip_serializing_if = "Option::is_none")]
    pub matches: Option<::std::collections::HashMap<String, Vec<String>>>,
    #[serde(rename = "NextToken", skip_serializing_if = "Option::is_none")]
    pub next_token: Option<String>,
    #[serde(rename = "RequestTime", skip_serializing_if = "Option::is_none")]
    pub request_time: Option<i64>,
    #[serde(rename = "Truncations", skip_serializing_if = "Option::is_none")]
    pub truncations: Option<::std::collections::HashMap<String, bool>>,
}

impl SearchResponse {
    pub fn new() -> SearchResponse {
        SearchResponse {
            known_leader: None,
            last_contact: None,
            last_index: None,
            matches: None,
            next_token: None,
            request_time: None,
            truncations: None,
        }
    }
}


