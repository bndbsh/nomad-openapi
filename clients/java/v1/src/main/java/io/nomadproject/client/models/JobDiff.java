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
import io.nomadproject.client.models.FieldDiff;
import io.nomadproject.client.models.ObjectDiff;
import io.nomadproject.client.models.TaskGroupDiff;
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
 * JobDiff
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JobDiff {
  public static final String SERIALIZED_NAME_FIELDS = "Fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<FieldDiff> fields = null;

  public static final String SERIALIZED_NAME_I_D = "ID";
  @SerializedName(SERIALIZED_NAME_I_D)
  private String ID;

  public static final String SERIALIZED_NAME_OBJECTS = "Objects";
  @SerializedName(SERIALIZED_NAME_OBJECTS)
  private List<ObjectDiff> objects = null;

  public static final String SERIALIZED_NAME_TASK_GROUPS = "TaskGroups";
  @SerializedName(SERIALIZED_NAME_TASK_GROUPS)
  private List<TaskGroupDiff> taskGroups = null;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public JobDiff() { 
  }

  public JobDiff fields(List<FieldDiff> fields) {
    
    this.fields = fields;
    return this;
  }

  public JobDiff addFieldsItem(FieldDiff fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<FieldDiff> getFields() {
    return fields;
  }


  public void setFields(List<FieldDiff> fields) {
    this.fields = fields;
  }


  public JobDiff ID(String ID) {
    
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


  public JobDiff objects(List<ObjectDiff> objects) {
    
    this.objects = objects;
    return this;
  }

  public JobDiff addObjectsItem(ObjectDiff objectsItem) {
    if (this.objects == null) {
      this.objects = new ArrayList<>();
    }
    this.objects.add(objectsItem);
    return this;
  }

   /**
   * Get objects
   * @return objects
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ObjectDiff> getObjects() {
    return objects;
  }


  public void setObjects(List<ObjectDiff> objects) {
    this.objects = objects;
  }


  public JobDiff taskGroups(List<TaskGroupDiff> taskGroups) {
    
    this.taskGroups = taskGroups;
    return this;
  }

  public JobDiff addTaskGroupsItem(TaskGroupDiff taskGroupsItem) {
    if (this.taskGroups == null) {
      this.taskGroups = new ArrayList<>();
    }
    this.taskGroups.add(taskGroupsItem);
    return this;
  }

   /**
   * Get taskGroups
   * @return taskGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TaskGroupDiff> getTaskGroups() {
    return taskGroups;
  }


  public void setTaskGroups(List<TaskGroupDiff> taskGroups) {
    this.taskGroups = taskGroups;
  }


  public JobDiff type(String type) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobDiff jobDiff = (JobDiff) o;
    return Objects.equals(this.fields, jobDiff.fields) &&
        Objects.equals(this.ID, jobDiff.ID) &&
        Objects.equals(this.objects, jobDiff.objects) &&
        Objects.equals(this.taskGroups, jobDiff.taskGroups) &&
        Objects.equals(this.type, jobDiff.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields, ID, objects, taskGroups, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobDiff {\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
    sb.append("    taskGroups: ").append(toIndentedString(taskGroups)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("Fields");
    openapiFields.add("ID");
    openapiFields.add("Objects");
    openapiFields.add("TaskGroups");
    openapiFields.add("Type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JobDiff
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (JobDiff.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in JobDiff is not found in the empty JSON string", JobDiff.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!JobDiff.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JobDiff` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayfields = jsonObj.getAsJsonArray("Fields");
      if (jsonArrayfields != null) {
        // ensure the json data is an array
        if (!jsonObj.get("Fields").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `Fields` to be an array in the JSON string but got `%s`", jsonObj.get("Fields").toString()));
        }

        // validate the optional field `Fields` (array)
        for (int i = 0; i < jsonArrayfields.size(); i++) {
          FieldDiff.validateJsonObject(jsonArrayfields.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("ID") != null && !jsonObj.get("ID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ID").toString()));
      }
      JsonArray jsonArrayobjects = jsonObj.getAsJsonArray("Objects");
      if (jsonArrayobjects != null) {
        // ensure the json data is an array
        if (!jsonObj.get("Objects").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `Objects` to be an array in the JSON string but got `%s`", jsonObj.get("Objects").toString()));
        }

        // validate the optional field `Objects` (array)
        for (int i = 0; i < jsonArrayobjects.size(); i++) {
          ObjectDiff.validateJsonObject(jsonArrayobjects.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArraytaskGroups = jsonObj.getAsJsonArray("TaskGroups");
      if (jsonArraytaskGroups != null) {
        // ensure the json data is an array
        if (!jsonObj.get("TaskGroups").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `TaskGroups` to be an array in the JSON string but got `%s`", jsonObj.get("TaskGroups").toString()));
        }

        // validate the optional field `TaskGroups` (array)
        for (int i = 0; i < jsonArraytaskGroups.size(); i++) {
          TaskGroupDiff.validateJsonObject(jsonArraytaskGroups.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("Type") != null && !jsonObj.get("Type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JobDiff.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JobDiff' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JobDiff> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JobDiff.class));

       return (TypeAdapter<T>) new TypeAdapter<JobDiff>() {
           @Override
           public void write(JsonWriter out, JobDiff value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JobDiff read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JobDiff given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JobDiff
  * @throws IOException if the JSON string is invalid with respect to JobDiff
  */
  public static JobDiff fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JobDiff.class);
  }

 /**
  * Convert an instance of JobDiff to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

