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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * JobDispatchRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JobDispatchRequest {
  public static final String SERIALIZED_NAME_JOB_I_D = "JobID";
  @SerializedName(SERIALIZED_NAME_JOB_I_D)
  private String jobID;

  public static final String SERIALIZED_NAME_META = "Meta";
  @SerializedName(SERIALIZED_NAME_META)
  private Map<String, String> meta = null;

  public static final String SERIALIZED_NAME_PAYLOAD = "Payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private byte[] payload;

  public JobDispatchRequest() { 
  }

  public JobDispatchRequest jobID(String jobID) {
    
    this.jobID = jobID;
    return this;
  }

   /**
   * Get jobID
   * @return jobID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getJobID() {
    return jobID;
  }


  public void setJobID(String jobID) {
    this.jobID = jobID;
  }


  public JobDispatchRequest meta(Map<String, String> meta) {
    
    this.meta = meta;
    return this;
  }

  public JobDispatchRequest putMetaItem(String key, String metaItem) {
    if (this.meta == null) {
      this.meta = new HashMap<>();
    }
    this.meta.put(key, metaItem);
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getMeta() {
    return meta;
  }


  public void setMeta(Map<String, String> meta) {
    this.meta = meta;
  }


  public JobDispatchRequest payload(byte[] payload) {
    
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public byte[] getPayload() {
    return payload;
  }


  public void setPayload(byte[] payload) {
    this.payload = payload;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobDispatchRequest jobDispatchRequest = (JobDispatchRequest) o;
    return Objects.equals(this.jobID, jobDispatchRequest.jobID) &&
        Objects.equals(this.meta, jobDispatchRequest.meta) &&
        Arrays.equals(this.payload, jobDispatchRequest.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobID, meta, Arrays.hashCode(payload));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobDispatchRequest {\n");
    sb.append("    jobID: ").append(toIndentedString(jobID)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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
    openapiFields.add("JobID");
    openapiFields.add("Meta");
    openapiFields.add("Payload");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JobDispatchRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (JobDispatchRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in JobDispatchRequest is not found in the empty JSON string", JobDispatchRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!JobDispatchRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JobDispatchRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("JobID") != null && !jsonObj.get("JobID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `JobID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("JobID").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JobDispatchRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JobDispatchRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JobDispatchRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JobDispatchRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<JobDispatchRequest>() {
           @Override
           public void write(JsonWriter out, JobDispatchRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JobDispatchRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JobDispatchRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JobDispatchRequest
  * @throws IOException if the JSON string is invalid with respect to JobDispatchRequest
  */
  public static JobDispatchRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JobDispatchRequest.class);
  }

 /**
  * Convert an instance of JobDispatchRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

