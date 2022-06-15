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
 * TaskLifecycle
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TaskLifecycle {
  public static final String SERIALIZED_NAME_HOOK = "Hook";
  @SerializedName(SERIALIZED_NAME_HOOK)
  private String hook;

  public static final String SERIALIZED_NAME_SIDECAR = "Sidecar";
  @SerializedName(SERIALIZED_NAME_SIDECAR)
  private Boolean sidecar;

  public TaskLifecycle() { 
  }

  public TaskLifecycle hook(String hook) {
    
    this.hook = hook;
    return this;
  }

   /**
   * Get hook
   * @return hook
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHook() {
    return hook;
  }


  public void setHook(String hook) {
    this.hook = hook;
  }


  public TaskLifecycle sidecar(Boolean sidecar) {
    
    this.sidecar = sidecar;
    return this;
  }

   /**
   * Get sidecar
   * @return sidecar
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSidecar() {
    return sidecar;
  }


  public void setSidecar(Boolean sidecar) {
    this.sidecar = sidecar;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskLifecycle taskLifecycle = (TaskLifecycle) o;
    return Objects.equals(this.hook, taskLifecycle.hook) &&
        Objects.equals(this.sidecar, taskLifecycle.sidecar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hook, sidecar);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskLifecycle {\n");
    sb.append("    hook: ").append(toIndentedString(hook)).append("\n");
    sb.append("    sidecar: ").append(toIndentedString(sidecar)).append("\n");
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
    openapiFields.add("Hook");
    openapiFields.add("Sidecar");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TaskLifecycle
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TaskLifecycle.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TaskLifecycle is not found in the empty JSON string", TaskLifecycle.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TaskLifecycle.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TaskLifecycle` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("Hook") != null && !jsonObj.get("Hook").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Hook` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Hook").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TaskLifecycle.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TaskLifecycle' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TaskLifecycle> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TaskLifecycle.class));

       return (TypeAdapter<T>) new TypeAdapter<TaskLifecycle>() {
           @Override
           public void write(JsonWriter out, TaskLifecycle value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TaskLifecycle read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TaskLifecycle given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TaskLifecycle
  * @throws IOException if the JSON string is invalid with respect to TaskLifecycle
  */
  public static TaskLifecycle fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TaskLifecycle.class);
  }

 /**
  * Convert an instance of TaskLifecycle to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

