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
import java.util.ArrayList;
import java.util.List;

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
 * ServiceRegistration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ServiceRegistration {
  public static final String SERIALIZED_NAME_ADDRESS = "Address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_ALLOC_I_D = "AllocID";
  @SerializedName(SERIALIZED_NAME_ALLOC_I_D)
  private String allocID;

  public static final String SERIALIZED_NAME_CREATE_INDEX = "CreateIndex";
  @SerializedName(SERIALIZED_NAME_CREATE_INDEX)
  private Integer createIndex;

  public static final String SERIALIZED_NAME_DATACENTER = "Datacenter";
  @SerializedName(SERIALIZED_NAME_DATACENTER)
  private String datacenter;

  public static final String SERIALIZED_NAME_I_D = "ID";
  @SerializedName(SERIALIZED_NAME_I_D)
  private String ID;

  public static final String SERIALIZED_NAME_JOB_I_D = "JobID";
  @SerializedName(SERIALIZED_NAME_JOB_I_D)
  private String jobID;

  public static final String SERIALIZED_NAME_MODIFY_INDEX = "ModifyIndex";
  @SerializedName(SERIALIZED_NAME_MODIFY_INDEX)
  private Integer modifyIndex;

  public static final String SERIALIZED_NAME_NAMESPACE = "Namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_NODE_I_D = "NodeID";
  @SerializedName(SERIALIZED_NAME_NODE_I_D)
  private String nodeID;

  public static final String SERIALIZED_NAME_PORT = "Port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_SERVICE_NAME = "ServiceName";
  @SerializedName(SERIALIZED_NAME_SERVICE_NAME)
  private String serviceName;

  public static final String SERIALIZED_NAME_TAGS = "Tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public ServiceRegistration() { 
  }

  public ServiceRegistration address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public ServiceRegistration allocID(String allocID) {
    
    this.allocID = allocID;
    return this;
  }

   /**
   * Get allocID
   * @return allocID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAllocID() {
    return allocID;
  }


  public void setAllocID(String allocID) {
    this.allocID = allocID;
  }


  public ServiceRegistration createIndex(Integer createIndex) {
    
    this.createIndex = createIndex;
    return this;
  }

   /**
   * Get createIndex
   * minimum: 0
   * maximum: 384
   * @return createIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCreateIndex() {
    return createIndex;
  }


  public void setCreateIndex(Integer createIndex) {
    this.createIndex = createIndex;
  }


  public ServiceRegistration datacenter(String datacenter) {
    
    this.datacenter = datacenter;
    return this;
  }

   /**
   * Get datacenter
   * @return datacenter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDatacenter() {
    return datacenter;
  }


  public void setDatacenter(String datacenter) {
    this.datacenter = datacenter;
  }


  public ServiceRegistration ID(String ID) {
    
    this.ID = ID;
    return this;
  }

   /**
   * Get ID
   * @return ID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getID() {
    return ID;
  }


  public void setID(String ID) {
    this.ID = ID;
  }


  public ServiceRegistration jobID(String jobID) {
    
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


  public ServiceRegistration modifyIndex(Integer modifyIndex) {
    
    this.modifyIndex = modifyIndex;
    return this;
  }

   /**
   * Get modifyIndex
   * minimum: 0
   * maximum: 384
   * @return modifyIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getModifyIndex() {
    return modifyIndex;
  }


  public void setModifyIndex(Integer modifyIndex) {
    this.modifyIndex = modifyIndex;
  }


  public ServiceRegistration namespace(String namespace) {
    
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


  public ServiceRegistration nodeID(String nodeID) {
    
    this.nodeID = nodeID;
    return this;
  }

   /**
   * Get nodeID
   * @return nodeID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNodeID() {
    return nodeID;
  }


  public void setNodeID(String nodeID) {
    this.nodeID = nodeID;
  }


  public ServiceRegistration port(Integer port) {
    
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPort() {
    return port;
  }


  public void setPort(Integer port) {
    this.port = port;
  }


  public ServiceRegistration serviceName(String serviceName) {
    
    this.serviceName = serviceName;
    return this;
  }

   /**
   * Get serviceName
   * @return serviceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getServiceName() {
    return serviceName;
  }


  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }


  public ServiceRegistration tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public ServiceRegistration addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceRegistration serviceRegistration = (ServiceRegistration) o;
    return Objects.equals(this.address, serviceRegistration.address) &&
        Objects.equals(this.allocID, serviceRegistration.allocID) &&
        Objects.equals(this.createIndex, serviceRegistration.createIndex) &&
        Objects.equals(this.datacenter, serviceRegistration.datacenter) &&
        Objects.equals(this.ID, serviceRegistration.ID) &&
        Objects.equals(this.jobID, serviceRegistration.jobID) &&
        Objects.equals(this.modifyIndex, serviceRegistration.modifyIndex) &&
        Objects.equals(this.namespace, serviceRegistration.namespace) &&
        Objects.equals(this.nodeID, serviceRegistration.nodeID) &&
        Objects.equals(this.port, serviceRegistration.port) &&
        Objects.equals(this.serviceName, serviceRegistration.serviceName) &&
        Objects.equals(this.tags, serviceRegistration.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, allocID, createIndex, datacenter, ID, jobID, modifyIndex, namespace, nodeID, port, serviceName, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceRegistration {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    allocID: ").append(toIndentedString(allocID)).append("\n");
    sb.append("    createIndex: ").append(toIndentedString(createIndex)).append("\n");
    sb.append("    datacenter: ").append(toIndentedString(datacenter)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    jobID: ").append(toIndentedString(jobID)).append("\n");
    sb.append("    modifyIndex: ").append(toIndentedString(modifyIndex)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    nodeID: ").append(toIndentedString(nodeID)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("Address");
    openapiFields.add("AllocID");
    openapiFields.add("CreateIndex");
    openapiFields.add("Datacenter");
    openapiFields.add("ID");
    openapiFields.add("JobID");
    openapiFields.add("ModifyIndex");
    openapiFields.add("Namespace");
    openapiFields.add("NodeID");
    openapiFields.add("Port");
    openapiFields.add("ServiceName");
    openapiFields.add("Tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ServiceRegistration
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ServiceRegistration.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ServiceRegistration is not found in the empty JSON string", ServiceRegistration.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ServiceRegistration.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ServiceRegistration` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("Address") != null && !jsonObj.get("Address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Address").toString()));
      }
      if (jsonObj.get("AllocID") != null && !jsonObj.get("AllocID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AllocID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AllocID").toString()));
      }
      if (jsonObj.get("Datacenter") != null && !jsonObj.get("Datacenter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Datacenter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Datacenter").toString()));
      }
      if (jsonObj.get("ID") != null && !jsonObj.get("ID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ID").toString()));
      }
      if (jsonObj.get("JobID") != null && !jsonObj.get("JobID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `JobID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("JobID").toString()));
      }
      if (jsonObj.get("Namespace") != null && !jsonObj.get("Namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Namespace").toString()));
      }
      if (jsonObj.get("NodeID") != null && !jsonObj.get("NodeID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `NodeID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("NodeID").toString()));
      }
      if (jsonObj.get("ServiceName") != null && !jsonObj.get("ServiceName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ServiceName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ServiceName").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("Tags") != null && !jsonObj.get("Tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Tags` to be an array in the JSON string but got `%s`", jsonObj.get("Tags").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ServiceRegistration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ServiceRegistration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ServiceRegistration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ServiceRegistration.class));

       return (TypeAdapter<T>) new TypeAdapter<ServiceRegistration>() {
           @Override
           public void write(JsonWriter out, ServiceRegistration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ServiceRegistration read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ServiceRegistration given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ServiceRegistration
  * @throws IOException if the JSON string is invalid with respect to ServiceRegistration
  */
  public static ServiceRegistration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ServiceRegistration.class);
  }

 /**
  * Convert an instance of ServiceRegistration to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
