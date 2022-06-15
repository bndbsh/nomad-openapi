/*
 * Nomad
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.1.4
 * Contact: support@hashicorp.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.nomadproject.client.api;

import io.nomadproject.client.ApiException;
import io.nomadproject.client.models.AutopilotConfiguration;
import io.nomadproject.client.models.OperatorHealthReply;
import io.nomadproject.client.models.RaftConfiguration;
import io.nomadproject.client.models.SchedulerConfiguration;
import io.nomadproject.client.models.SchedulerConfigurationResponse;
import io.nomadproject.client.models.SchedulerSetConfigurationResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OperatorApi
 */
@Disabled
public class OperatorApiTest {

    private final OperatorApi api = new OperatorApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteOperatorRaftPeerTest() throws ApiException {
        String region = null;
        String namespace = null;
        String xNomadToken = null;
        String idempotencyToken = null;
        api.deleteOperatorRaftPeer(region, namespace, xNomadToken, idempotencyToken);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOperatorAutopilotConfigurationTest() throws ApiException {
        String region = null;
        String namespace = null;
        Integer index = null;
        String wait = null;
        String stale = null;
        String prefix = null;
        String xNomadToken = null;
        Integer perPage = null;
        String nextToken = null;
        AutopilotConfiguration response = api.getOperatorAutopilotConfiguration(region, namespace, index, wait, stale, prefix, xNomadToken, perPage, nextToken);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOperatorAutopilotHealthTest() throws ApiException {
        String region = null;
        String namespace = null;
        Integer index = null;
        String wait = null;
        String stale = null;
        String prefix = null;
        String xNomadToken = null;
        Integer perPage = null;
        String nextToken = null;
        OperatorHealthReply response = api.getOperatorAutopilotHealth(region, namespace, index, wait, stale, prefix, xNomadToken, perPage, nextToken);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOperatorRaftConfigurationTest() throws ApiException {
        String region = null;
        String namespace = null;
        Integer index = null;
        String wait = null;
        String stale = null;
        String prefix = null;
        String xNomadToken = null;
        Integer perPage = null;
        String nextToken = null;
        RaftConfiguration response = api.getOperatorRaftConfiguration(region, namespace, index, wait, stale, prefix, xNomadToken, perPage, nextToken);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOperatorSchedulerConfigurationTest() throws ApiException {
        String region = null;
        String namespace = null;
        Integer index = null;
        String wait = null;
        String stale = null;
        String prefix = null;
        String xNomadToken = null;
        Integer perPage = null;
        String nextToken = null;
        SchedulerConfigurationResponse response = api.getOperatorSchedulerConfiguration(region, namespace, index, wait, stale, prefix, xNomadToken, perPage, nextToken);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postOperatorSchedulerConfigurationTest() throws ApiException {
        SchedulerConfiguration schedulerConfiguration = null;
        String region = null;
        String namespace = null;
        String xNomadToken = null;
        String idempotencyToken = null;
        SchedulerSetConfigurationResponse response = api.postOperatorSchedulerConfiguration(schedulerConfiguration, region, namespace, xNomadToken, idempotencyToken);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putOperatorAutopilotConfigurationTest() throws ApiException {
        AutopilotConfiguration autopilotConfiguration = null;
        String region = null;
        String namespace = null;
        String xNomadToken = null;
        String idempotencyToken = null;
        Boolean response = api.putOperatorAutopilotConfiguration(autopilotConfiguration, region, namespace, xNomadToken, idempotencyToken);
        // TODO: test validations
    }

}
