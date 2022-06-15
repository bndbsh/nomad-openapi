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
import io.nomadproject.client.models.RaftServer;
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
 * RaftConfiguration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RaftConfiguration {
  public static final String SERIALIZED_NAME_INDEX = "Index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private Integer index;

  public static final String SERIALIZED_NAME_SERVERS = "Servers";
  @SerializedName(SERIALIZED_NAME_SERVERS)
  private List<RaftServer> servers = null;

  public RaftConfiguration() { 
  }

  public RaftConfiguration index(Integer index) {
    
    this.index = index;
    return this;
  }

   /**
   * Get index
   * minimum: 0
   * maximum: 384
   * @return index
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIndex() {
    return index;
  }


  public void setIndex(Integer index) {
    this.index = index;
  }


  public RaftConfiguration servers(List<RaftServer> servers) {
    
    this.servers = servers;
    return this;
  }

  public RaftConfiguration addServersItem(RaftServer serversItem) {
    if (this.servers == null) {
      this.servers = new ArrayList<>();
    }
    this.servers.add(serversItem);
    return this;
  }

   /**
   * Get servers
   * @return servers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<RaftServer> getServers() {
    return servers;
  }


  public void setServers(List<RaftServer> servers) {
    this.servers = servers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RaftConfiguration raftConfiguration = (RaftConfiguration) o;
    return Objects.equals(this.index, raftConfiguration.index) &&
        Objects.equals(this.servers, raftConfiguration.servers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, servers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RaftConfiguration {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
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
    openapiFields.add("Index");
    openapiFields.add("Servers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RaftConfiguration
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RaftConfiguration.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RaftConfiguration is not found in the empty JSON string", RaftConfiguration.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RaftConfiguration.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RaftConfiguration` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayservers = jsonObj.getAsJsonArray("Servers");
      if (jsonArrayservers != null) {
        // ensure the json data is an array
        if (!jsonObj.get("Servers").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `Servers` to be an array in the JSON string but got `%s`", jsonObj.get("Servers").toString()));
        }

        // validate the optional field `Servers` (array)
        for (int i = 0; i < jsonArrayservers.size(); i++) {
          RaftServer.validateJsonObject(jsonArrayservers.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RaftConfiguration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RaftConfiguration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RaftConfiguration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RaftConfiguration.class));

       return (TypeAdapter<T>) new TypeAdapter<RaftConfiguration>() {
           @Override
           public void write(JsonWriter out, RaftConfiguration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RaftConfiguration read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RaftConfiguration given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RaftConfiguration
  * @throws IOException if the JSON string is invalid with respect to RaftConfiguration
  */
  public static RaftConfiguration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RaftConfiguration.class);
  }

 /**
  * Convert an instance of RaftConfiguration to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

