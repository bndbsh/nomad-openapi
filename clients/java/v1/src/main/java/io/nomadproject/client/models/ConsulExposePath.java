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
 * ConsulExposePath
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConsulExposePath {
  public static final String SERIALIZED_NAME_LISTENER_PORT = "ListenerPort";
  @SerializedName(SERIALIZED_NAME_LISTENER_PORT)
  private String listenerPort;

  public static final String SERIALIZED_NAME_LOCAL_PATH_PORT = "LocalPathPort";
  @SerializedName(SERIALIZED_NAME_LOCAL_PATH_PORT)
  private Integer localPathPort;

  public static final String SERIALIZED_NAME_PATH = "Path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_PROTOCOL = "Protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private String protocol;

  public ConsulExposePath() { 
  }

  public ConsulExposePath listenerPort(String listenerPort) {
    
    this.listenerPort = listenerPort;
    return this;
  }

   /**
   * Get listenerPort
   * @return listenerPort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getListenerPort() {
    return listenerPort;
  }


  public void setListenerPort(String listenerPort) {
    this.listenerPort = listenerPort;
  }


  public ConsulExposePath localPathPort(Integer localPathPort) {
    
    this.localPathPort = localPathPort;
    return this;
  }

   /**
   * Get localPathPort
   * @return localPathPort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLocalPathPort() {
    return localPathPort;
  }


  public void setLocalPathPort(Integer localPathPort) {
    this.localPathPort = localPathPort;
  }


  public ConsulExposePath path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public ConsulExposePath protocol(String protocol) {
    
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProtocol() {
    return protocol;
  }


  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsulExposePath consulExposePath = (ConsulExposePath) o;
    return Objects.equals(this.listenerPort, consulExposePath.listenerPort) &&
        Objects.equals(this.localPathPort, consulExposePath.localPathPort) &&
        Objects.equals(this.path, consulExposePath.path) &&
        Objects.equals(this.protocol, consulExposePath.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listenerPort, localPathPort, path, protocol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsulExposePath {\n");
    sb.append("    listenerPort: ").append(toIndentedString(listenerPort)).append("\n");
    sb.append("    localPathPort: ").append(toIndentedString(localPathPort)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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
    openapiFields.add("ListenerPort");
    openapiFields.add("LocalPathPort");
    openapiFields.add("Path");
    openapiFields.add("Protocol");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConsulExposePath
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ConsulExposePath.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConsulExposePath is not found in the empty JSON string", ConsulExposePath.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ConsulExposePath.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConsulExposePath` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("ListenerPort") != null && !jsonObj.get("ListenerPort").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ListenerPort` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ListenerPort").toString()));
      }
      if (jsonObj.get("Path") != null && !jsonObj.get("Path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Path").toString()));
      }
      if (jsonObj.get("Protocol") != null && !jsonObj.get("Protocol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Protocol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Protocol").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConsulExposePath.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConsulExposePath' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConsulExposePath> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConsulExposePath.class));

       return (TypeAdapter<T>) new TypeAdapter<ConsulExposePath>() {
           @Override
           public void write(JsonWriter out, ConsulExposePath value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConsulExposePath read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConsulExposePath given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConsulExposePath
  * @throws IOException if the JSON string is invalid with respect to ConsulExposePath
  */
  public static ConsulExposePath fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConsulExposePath.class);
  }

 /**
  * Convert an instance of ConsulExposePath to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

