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
 * NamespaceCapabilities
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NamespaceCapabilities {
  public static final String SERIALIZED_NAME_DISABLED_TASK_DRIVERS = "DisabledTaskDrivers";
  @SerializedName(SERIALIZED_NAME_DISABLED_TASK_DRIVERS)
  private List<String> disabledTaskDrivers = null;

  public static final String SERIALIZED_NAME_ENABLED_TASK_DRIVERS = "EnabledTaskDrivers";
  @SerializedName(SERIALIZED_NAME_ENABLED_TASK_DRIVERS)
  private List<String> enabledTaskDrivers = null;

  public NamespaceCapabilities() { 
  }

  public NamespaceCapabilities disabledTaskDrivers(List<String> disabledTaskDrivers) {
    
    this.disabledTaskDrivers = disabledTaskDrivers;
    return this;
  }

  public NamespaceCapabilities addDisabledTaskDriversItem(String disabledTaskDriversItem) {
    if (this.disabledTaskDrivers == null) {
      this.disabledTaskDrivers = new ArrayList<>();
    }
    this.disabledTaskDrivers.add(disabledTaskDriversItem);
    return this;
  }

   /**
   * Get disabledTaskDrivers
   * @return disabledTaskDrivers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDisabledTaskDrivers() {
    return disabledTaskDrivers;
  }


  public void setDisabledTaskDrivers(List<String> disabledTaskDrivers) {
    this.disabledTaskDrivers = disabledTaskDrivers;
  }


  public NamespaceCapabilities enabledTaskDrivers(List<String> enabledTaskDrivers) {
    
    this.enabledTaskDrivers = enabledTaskDrivers;
    return this;
  }

  public NamespaceCapabilities addEnabledTaskDriversItem(String enabledTaskDriversItem) {
    if (this.enabledTaskDrivers == null) {
      this.enabledTaskDrivers = new ArrayList<>();
    }
    this.enabledTaskDrivers.add(enabledTaskDriversItem);
    return this;
  }

   /**
   * Get enabledTaskDrivers
   * @return enabledTaskDrivers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getEnabledTaskDrivers() {
    return enabledTaskDrivers;
  }


  public void setEnabledTaskDrivers(List<String> enabledTaskDrivers) {
    this.enabledTaskDrivers = enabledTaskDrivers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NamespaceCapabilities namespaceCapabilities = (NamespaceCapabilities) o;
    return Objects.equals(this.disabledTaskDrivers, namespaceCapabilities.disabledTaskDrivers) &&
        Objects.equals(this.enabledTaskDrivers, namespaceCapabilities.enabledTaskDrivers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disabledTaskDrivers, enabledTaskDrivers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NamespaceCapabilities {\n");
    sb.append("    disabledTaskDrivers: ").append(toIndentedString(disabledTaskDrivers)).append("\n");
    sb.append("    enabledTaskDrivers: ").append(toIndentedString(enabledTaskDrivers)).append("\n");
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
    openapiFields.add("DisabledTaskDrivers");
    openapiFields.add("EnabledTaskDrivers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NamespaceCapabilities
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (NamespaceCapabilities.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in NamespaceCapabilities is not found in the empty JSON string", NamespaceCapabilities.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!NamespaceCapabilities.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NamespaceCapabilities` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("DisabledTaskDrivers") != null && !jsonObj.get("DisabledTaskDrivers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `DisabledTaskDrivers` to be an array in the JSON string but got `%s`", jsonObj.get("DisabledTaskDrivers").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("EnabledTaskDrivers") != null && !jsonObj.get("EnabledTaskDrivers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `EnabledTaskDrivers` to be an array in the JSON string but got `%s`", jsonObj.get("EnabledTaskDrivers").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NamespaceCapabilities.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NamespaceCapabilities' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NamespaceCapabilities> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NamespaceCapabilities.class));

       return (TypeAdapter<T>) new TypeAdapter<NamespaceCapabilities>() {
           @Override
           public void write(JsonWriter out, NamespaceCapabilities value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NamespaceCapabilities read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NamespaceCapabilities given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NamespaceCapabilities
  * @throws IOException if the JSON string is invalid with respect to NamespaceCapabilities
  */
  public static NamespaceCapabilities fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NamespaceCapabilities.class);
  }

 /**
  * Convert an instance of NamespaceCapabilities to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
