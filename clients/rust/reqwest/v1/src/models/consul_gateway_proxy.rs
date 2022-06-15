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
pub struct ConsulGatewayProxy {
    #[serde(rename = "Config", skip_serializing_if = "Option::is_none")]
    pub config: Option<::std::collections::HashMap<String, serde_json::Value>>,
    #[serde(rename = "ConnectTimeout", skip_serializing_if = "Option::is_none")]
    pub connect_timeout: Option<i64>,
    #[serde(rename = "EnvoyDNSDiscoveryType", skip_serializing_if = "Option::is_none")]
    pub envoy_dns_discovery_type: Option<String>,
    #[serde(rename = "EnvoyGatewayBindAddresses", skip_serializing_if = "Option::is_none")]
    pub envoy_gateway_bind_addresses: Option<::std::collections::HashMap<String, crate::models::ConsulGatewayBindAddress>>,
    #[serde(rename = "EnvoyGatewayBindTaggedAddresses", skip_serializing_if = "Option::is_none")]
    pub envoy_gateway_bind_tagged_addresses: Option<bool>,
    #[serde(rename = "EnvoyGatewayNoDefaultBind", skip_serializing_if = "Option::is_none")]
    pub envoy_gateway_no_default_bind: Option<bool>,
}

impl ConsulGatewayProxy {
    pub fn new() -> ConsulGatewayProxy {
        ConsulGatewayProxy {
            config: None,
            connect_timeout: None,
            envoy_dns_discovery_type: None,
            envoy_gateway_bind_addresses: None,
            envoy_gateway_bind_tagged_addresses: None,
            envoy_gateway_no_default_bind: None,
        }
    }
}


