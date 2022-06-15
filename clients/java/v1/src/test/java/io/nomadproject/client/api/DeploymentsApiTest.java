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
import io.nomadproject.client.models.AllocationListStub;
import io.nomadproject.client.models.Deployment;
import io.nomadproject.client.models.DeploymentAllocHealthRequest;
import io.nomadproject.client.models.DeploymentPauseRequest;
import io.nomadproject.client.models.DeploymentPromoteRequest;
import io.nomadproject.client.models.DeploymentUnblockRequest;
import io.nomadproject.client.models.DeploymentUpdateResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DeploymentsApi
 */
@Disabled
public class DeploymentsApiTest {

    private final DeploymentsApi api = new DeploymentsApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDeploymentTest() throws ApiException {
        String deploymentID = null;
        String region = null;
        String namespace = null;
        Integer index = null;
        String wait = null;
        String stale = null;
        String prefix = null;
        String xNomadToken = null;
        Integer perPage = null;
        String nextToken = null;
        Deployment response = api.getDeployment(deploymentID, region, namespace, index, wait, stale, prefix, xNomadToken, perPage, nextToken);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDeploymentAllocationsTest() throws ApiException {
        String deploymentID = null;
        String region = null;
        String namespace = null;
        Integer index = null;
        String wait = null;
        String stale = null;
        String prefix = null;
        String xNomadToken = null;
        Integer perPage = null;
        String nextToken = null;
        List<AllocationListStub> response = api.getDeploymentAllocations(deploymentID, region, namespace, index, wait, stale, prefix, xNomadToken, perPage, nextToken);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDeploymentsTest() throws ApiException {
        String region = null;
        String namespace = null;
        Integer index = null;
        String wait = null;
        String stale = null;
        String prefix = null;
        String xNomadToken = null;
        Integer perPage = null;
        String nextToken = null;
        List<Deployment> response = api.getDeployments(region, namespace, index, wait, stale, prefix, xNomadToken, perPage, nextToken);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postDeploymentAllocationHealthTest() throws ApiException {
        String deploymentID = null;
        DeploymentAllocHealthRequest deploymentAllocHealthRequest = null;
        String region = null;
        String namespace = null;
        String xNomadToken = null;
        String idempotencyToken = null;
        DeploymentUpdateResponse response = api.postDeploymentAllocationHealth(deploymentID, deploymentAllocHealthRequest, region, namespace, xNomadToken, idempotencyToken);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postDeploymentFailTest() throws ApiException {
        String deploymentID = null;
        String region = null;
        String namespace = null;
        String xNomadToken = null;
        String idempotencyToken = null;
        DeploymentUpdateResponse response = api.postDeploymentFail(deploymentID, region, namespace, xNomadToken, idempotencyToken);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postDeploymentPauseTest() throws ApiException {
        String deploymentID = null;
        DeploymentPauseRequest deploymentPauseRequest = null;
        String region = null;
        String namespace = null;
        String xNomadToken = null;
        String idempotencyToken = null;
        DeploymentUpdateResponse response = api.postDeploymentPause(deploymentID, deploymentPauseRequest, region, namespace, xNomadToken, idempotencyToken);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postDeploymentPromoteTest() throws ApiException {
        String deploymentID = null;
        DeploymentPromoteRequest deploymentPromoteRequest = null;
        String region = null;
        String namespace = null;
        String xNomadToken = null;
        String idempotencyToken = null;
        DeploymentUpdateResponse response = api.postDeploymentPromote(deploymentID, deploymentPromoteRequest, region, namespace, xNomadToken, idempotencyToken);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postDeploymentUnblockTest() throws ApiException {
        String deploymentID = null;
        DeploymentUnblockRequest deploymentUnblockRequest = null;
        String region = null;
        String namespace = null;
        String xNomadToken = null;
        String idempotencyToken = null;
        DeploymentUpdateResponse response = api.postDeploymentUnblock(deploymentID, deploymentUnblockRequest, region, namespace, xNomadToken, idempotencyToken);
        // TODO: test validations
    }

}
