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
 * WaitConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WaitConfig {
  public static final String SERIALIZED_NAME_MAX = "Max";
  @SerializedName(SERIALIZED_NAME_MAX)
  private Long max;

  public static final String SERIALIZED_NAME_MIN = "Min";
  @SerializedName(SERIALIZED_NAME_MIN)
  private Long min;

  public WaitConfig() { 
  }

  public WaitConfig max(Long max) {
    
    this.max = max;
    return this;
  }

   /**
   * Get max
   * @return max
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getMax() {
    return max;
  }


  public void setMax(Long max) {
    this.max = max;
  }


  public WaitConfig min(Long min) {
    
    this.min = min;
    return this;
  }

   /**
   * Get min
   * @return min
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getMin() {
    return min;
  }


  public void setMin(Long min) {
    this.min = min;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WaitConfig waitConfig = (WaitConfig) o;
    return Objects.equals(this.max, waitConfig.max) &&
        Objects.equals(this.min, waitConfig.min);
  }

  @Override
  public int hashCode() {
    return Objects.hash(max, min);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WaitConfig {\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
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
    openapiFields.add("Max");
    openapiFields.add("Min");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WaitConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WaitConfig.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WaitConfig is not found in the empty JSON string", WaitConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WaitConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WaitConfig` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WaitConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WaitConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WaitConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WaitConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<WaitConfig>() {
           @Override
           public void write(JsonWriter out, WaitConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WaitConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WaitConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WaitConfig
  * @throws IOException if the JSON string is invalid with respect to WaitConfig
  */
  public static WaitConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WaitConfig.class);
  }

 /**
  * Convert an instance of WaitConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

