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
 * AllocatedDeviceResource
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AllocatedDeviceResource {
  public static final String SERIALIZED_NAME_DEVICE_I_DS = "DeviceIDs";
  @SerializedName(SERIALIZED_NAME_DEVICE_I_DS)
  private List<String> deviceIDs = null;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_VENDOR = "Vendor";
  @SerializedName(SERIALIZED_NAME_VENDOR)
  private String vendor;

  public AllocatedDeviceResource() { 
  }

  public AllocatedDeviceResource deviceIDs(List<String> deviceIDs) {
    
    this.deviceIDs = deviceIDs;
    return this;
  }

  public AllocatedDeviceResource addDeviceIDsItem(String deviceIDsItem) {
    if (this.deviceIDs == null) {
      this.deviceIDs = new ArrayList<>();
    }
    this.deviceIDs.add(deviceIDsItem);
    return this;
  }

   /**
   * Get deviceIDs
   * @return deviceIDs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDeviceIDs() {
    return deviceIDs;
  }


  public void setDeviceIDs(List<String> deviceIDs) {
    this.deviceIDs = deviceIDs;
  }


  public AllocatedDeviceResource name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AllocatedDeviceResource type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public AllocatedDeviceResource vendor(String vendor) {
    
    this.vendor = vendor;
    return this;
  }

   /**
   * Get vendor
   * @return vendor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVendor() {
    return vendor;
  }


  public void setVendor(String vendor) {
    this.vendor = vendor;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllocatedDeviceResource allocatedDeviceResource = (AllocatedDeviceResource) o;
    return Objects.equals(this.deviceIDs, allocatedDeviceResource.deviceIDs) &&
        Objects.equals(this.name, allocatedDeviceResource.name) &&
        Objects.equals(this.type, allocatedDeviceResource.type) &&
        Objects.equals(this.vendor, allocatedDeviceResource.vendor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceIDs, name, type, vendor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllocatedDeviceResource {\n");
    sb.append("    deviceIDs: ").append(toIndentedString(deviceIDs)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
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
    openapiFields.add("DeviceIDs");
    openapiFields.add("Name");
    openapiFields.add("Type");
    openapiFields.add("Vendor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AllocatedDeviceResource
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AllocatedDeviceResource.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AllocatedDeviceResource is not found in the empty JSON string", AllocatedDeviceResource.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AllocatedDeviceResource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AllocatedDeviceResource` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("DeviceIDs") != null && !jsonObj.get("DeviceIDs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `DeviceIDs` to be an array in the JSON string but got `%s`", jsonObj.get("DeviceIDs").toString()));
      }
      if (jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if (jsonObj.get("Type") != null && !jsonObj.get("Type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Type").toString()));
      }
      if (jsonObj.get("Vendor") != null && !jsonObj.get("Vendor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Vendor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Vendor").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AllocatedDeviceResource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AllocatedDeviceResource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AllocatedDeviceResource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AllocatedDeviceResource.class));

       return (TypeAdapter<T>) new TypeAdapter<AllocatedDeviceResource>() {
           @Override
           public void write(JsonWriter out, AllocatedDeviceResource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AllocatedDeviceResource read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AllocatedDeviceResource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AllocatedDeviceResource
  * @throws IOException if the JSON string is invalid with respect to AllocatedDeviceResource
  */
  public static AllocatedDeviceResource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AllocatedDeviceResource.class);
  }

 /**
  * Convert an instance of AllocatedDeviceResource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

