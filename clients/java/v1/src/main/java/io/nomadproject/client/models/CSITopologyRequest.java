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
import io.nomadproject.client.models.CSITopology;
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
 * CSITopologyRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CSITopologyRequest {
  public static final String SERIALIZED_NAME_PREFERRED = "Preferred";
  @SerializedName(SERIALIZED_NAME_PREFERRED)
  private List<CSITopology> preferred = null;

  public static final String SERIALIZED_NAME_REQUIRED = "Required";
  @SerializedName(SERIALIZED_NAME_REQUIRED)
  private List<CSITopology> required = null;

  public CSITopologyRequest() { 
  }

  public CSITopologyRequest preferred(List<CSITopology> preferred) {
    
    this.preferred = preferred;
    return this;
  }

  public CSITopologyRequest addPreferredItem(CSITopology preferredItem) {
    if (this.preferred == null) {
      this.preferred = new ArrayList<>();
    }
    this.preferred.add(preferredItem);
    return this;
  }

   /**
   * Get preferred
   * @return preferred
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CSITopology> getPreferred() {
    return preferred;
  }


  public void setPreferred(List<CSITopology> preferred) {
    this.preferred = preferred;
  }


  public CSITopologyRequest required(List<CSITopology> required) {
    
    this.required = required;
    return this;
  }

  public CSITopologyRequest addRequiredItem(CSITopology requiredItem) {
    if (this.required == null) {
      this.required = new ArrayList<>();
    }
    this.required.add(requiredItem);
    return this;
  }

   /**
   * Get required
   * @return required
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CSITopology> getRequired() {
    return required;
  }


  public void setRequired(List<CSITopology> required) {
    this.required = required;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSITopologyRequest csITopologyRequest = (CSITopologyRequest) o;
    return Objects.equals(this.preferred, csITopologyRequest.preferred) &&
        Objects.equals(this.required, csITopologyRequest.required);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preferred, required);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSITopologyRequest {\n");
    sb.append("    preferred: ").append(toIndentedString(preferred)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
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
    openapiFields.add("Preferred");
    openapiFields.add("Required");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CSITopologyRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CSITopologyRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CSITopologyRequest is not found in the empty JSON string", CSITopologyRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CSITopologyRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CSITopologyRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraypreferred = jsonObj.getAsJsonArray("Preferred");
      if (jsonArraypreferred != null) {
        // ensure the json data is an array
        if (!jsonObj.get("Preferred").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `Preferred` to be an array in the JSON string but got `%s`", jsonObj.get("Preferred").toString()));
        }

        // validate the optional field `Preferred` (array)
        for (int i = 0; i < jsonArraypreferred.size(); i++) {
          CSITopology.validateJsonObject(jsonArraypreferred.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayrequired = jsonObj.getAsJsonArray("Required");
      if (jsonArrayrequired != null) {
        // ensure the json data is an array
        if (!jsonObj.get("Required").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `Required` to be an array in the JSON string but got `%s`", jsonObj.get("Required").toString()));
        }

        // validate the optional field `Required` (array)
        for (int i = 0; i < jsonArrayrequired.size(); i++) {
          CSITopology.validateJsonObject(jsonArrayrequired.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CSITopologyRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CSITopologyRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CSITopologyRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CSITopologyRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CSITopologyRequest>() {
           @Override
           public void write(JsonWriter out, CSITopologyRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CSITopologyRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CSITopologyRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CSITopologyRequest
  * @throws IOException if the JSON string is invalid with respect to CSITopologyRequest
  */
  public static CSITopologyRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CSITopologyRequest.class);
  }

 /**
  * Convert an instance of CSITopologyRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

