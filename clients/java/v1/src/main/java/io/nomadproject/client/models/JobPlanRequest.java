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


package io.nomadproject.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.nomadproject.client.models.Job;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.nomadproject.client.JSON;

/**
 * JobPlanRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JobPlanRequest {
  public static final String SERIALIZED_NAME_DIFF = "Diff";
  @SerializedName(SERIALIZED_NAME_DIFF)
  private Boolean diff;

  public static final String SERIALIZED_NAME_JOB = "Job";
  @SerializedName(SERIALIZED_NAME_JOB)
  private Job job;

  public static final String SERIALIZED_NAME_NAMESPACE = "Namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_POLICY_OVERRIDE = "PolicyOverride";
  @SerializedName(SERIALIZED_NAME_POLICY_OVERRIDE)
  private Boolean policyOverride;

  public static final String SERIALIZED_NAME_REGION = "Region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_SECRET_I_D = "SecretID";
  @SerializedName(SERIALIZED_NAME_SECRET_I_D)
  private String secretID;

  public JobPlanRequest() { 
  }

  public JobPlanRequest diff(Boolean diff) {
    
    this.diff = diff;
    return this;
  }

   /**
   * Get diff
   * @return diff
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDiff() {
    return diff;
  }


  public void setDiff(Boolean diff) {
    this.diff = diff;
  }


  public JobPlanRequest job(Job job) {
    
    this.job = job;
    return this;
  }

   /**
   * Get job
   * @return job
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Job getJob() {
    return job;
  }


  public void setJob(Job job) {
    this.job = job;
  }


  public JobPlanRequest namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public JobPlanRequest policyOverride(Boolean policyOverride) {
    
    this.policyOverride = policyOverride;
    return this;
  }

   /**
   * Get policyOverride
   * @return policyOverride
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPolicyOverride() {
    return policyOverride;
  }


  public void setPolicyOverride(Boolean policyOverride) {
    this.policyOverride = policyOverride;
  }


  public JobPlanRequest region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public JobPlanRequest secretID(String secretID) {
    
    this.secretID = secretID;
    return this;
  }

   /**
   * Get secretID
   * @return secretID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSecretID() {
    return secretID;
  }


  public void setSecretID(String secretID) {
    this.secretID = secretID;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobPlanRequest jobPlanRequest = (JobPlanRequest) o;
    return Objects.equals(this.diff, jobPlanRequest.diff) &&
        Objects.equals(this.job, jobPlanRequest.job) &&
        Objects.equals(this.namespace, jobPlanRequest.namespace) &&
        Objects.equals(this.policyOverride, jobPlanRequest.policyOverride) &&
        Objects.equals(this.region, jobPlanRequest.region) &&
        Objects.equals(this.secretID, jobPlanRequest.secretID);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(diff, job, namespace, policyOverride, region, secretID);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobPlanRequest {\n");
    sb.append("    diff: ").append(toIndentedString(diff)).append("\n");
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    policyOverride: ").append(toIndentedString(policyOverride)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    secretID: ").append(toIndentedString(secretID)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("Diff");
    openapiFields.add("Job");
    openapiFields.add("Namespace");
    openapiFields.add("PolicyOverride");
    openapiFields.add("Region");
    openapiFields.add("SecretID");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JobPlanRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (JobPlanRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in JobPlanRequest is not found in the empty JSON string", JobPlanRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!JobPlanRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JobPlanRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `Job`
      if (jsonObj.getAsJsonObject("Job") != null) {
        Job.validateJsonObject(jsonObj.getAsJsonObject("Job"));
      }
      if (jsonObj.get("Namespace") != null && !jsonObj.get("Namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Namespace").toString()));
      }
      if (jsonObj.get("Region") != null && !jsonObj.get("Region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Region").toString()));
      }
      if (jsonObj.get("SecretID") != null && !jsonObj.get("SecretID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SecretID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SecretID").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JobPlanRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JobPlanRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JobPlanRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JobPlanRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<JobPlanRequest>() {
           @Override
           public void write(JsonWriter out, JobPlanRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JobPlanRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JobPlanRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JobPlanRequest
  * @throws IOException if the JSON string is invalid with respect to JobPlanRequest
  */
  public static JobPlanRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JobPlanRequest.class);
  }

 /**
  * Convert an instance of JobPlanRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

