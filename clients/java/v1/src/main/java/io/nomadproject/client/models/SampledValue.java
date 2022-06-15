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
 * SampledValue
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SampledValue {
  public static final String SERIALIZED_NAME_COUNT = "Count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_LABELS = "Labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = null;

  public static final String SERIALIZED_NAME_MAX = "Max";
  @SerializedName(SERIALIZED_NAME_MAX)
  private Double max;

  public static final String SERIALIZED_NAME_MEAN = "Mean";
  @SerializedName(SERIALIZED_NAME_MEAN)
  private Double mean;

  public static final String SERIALIZED_NAME_MIN = "Min";
  @SerializedName(SERIALIZED_NAME_MIN)
  private Double min;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RATE = "Rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  private Double rate;

  public static final String SERIALIZED_NAME_STDDEV = "Stddev";
  @SerializedName(SERIALIZED_NAME_STDDEV)
  private Double stddev;

  public static final String SERIALIZED_NAME_SUM = "Sum";
  @SerializedName(SERIALIZED_NAME_SUM)
  private Double sum;

  public SampledValue() { 
  }

  public SampledValue count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  public SampledValue labels(Map<String, String> labels) {
    
    this.labels = labels;
    return this;
  }

  public SampledValue putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getLabels() {
    return labels;
  }


  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  public SampledValue max(Double max) {
    
    this.max = max;
    return this;
  }

   /**
   * Get max
   * @return max
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getMax() {
    return max;
  }


  public void setMax(Double max) {
    this.max = max;
  }


  public SampledValue mean(Double mean) {
    
    this.mean = mean;
    return this;
  }

   /**
   * Get mean
   * @return mean
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getMean() {
    return mean;
  }


  public void setMean(Double mean) {
    this.mean = mean;
  }


  public SampledValue min(Double min) {
    
    this.min = min;
    return this;
  }

   /**
   * Get min
   * @return min
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getMin() {
    return min;
  }


  public void setMin(Double min) {
    this.min = min;
  }


  public SampledValue name(String name) {
    
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


  public SampledValue rate(Double rate) {
    
    this.rate = rate;
    return this;
  }

   /**
   * Get rate
   * @return rate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getRate() {
    return rate;
  }


  public void setRate(Double rate) {
    this.rate = rate;
  }


  public SampledValue stddev(Double stddev) {
    
    this.stddev = stddev;
    return this;
  }

   /**
   * Get stddev
   * @return stddev
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getStddev() {
    return stddev;
  }


  public void setStddev(Double stddev) {
    this.stddev = stddev;
  }


  public SampledValue sum(Double sum) {
    
    this.sum = sum;
    return this;
  }

   /**
   * Get sum
   * @return sum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getSum() {
    return sum;
  }


  public void setSum(Double sum) {
    this.sum = sum;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SampledValue sampledValue = (SampledValue) o;
    return Objects.equals(this.count, sampledValue.count) &&
        Objects.equals(this.labels, sampledValue.labels) &&
        Objects.equals(this.max, sampledValue.max) &&
        Objects.equals(this.mean, sampledValue.mean) &&
        Objects.equals(this.min, sampledValue.min) &&
        Objects.equals(this.name, sampledValue.name) &&
        Objects.equals(this.rate, sampledValue.rate) &&
        Objects.equals(this.stddev, sampledValue.stddev) &&
        Objects.equals(this.sum, sampledValue.sum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, labels, max, mean, min, name, rate, stddev, sum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SampledValue {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    mean: ").append(toIndentedString(mean)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    stddev: ").append(toIndentedString(stddev)).append("\n");
    sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
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
    openapiFields.add("Count");
    openapiFields.add("Labels");
    openapiFields.add("Max");
    openapiFields.add("Mean");
    openapiFields.add("Min");
    openapiFields.add("Name");
    openapiFields.add("Rate");
    openapiFields.add("Stddev");
    openapiFields.add("Sum");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SampledValue
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SampledValue.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SampledValue is not found in the empty JSON string", SampledValue.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SampledValue.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SampledValue` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SampledValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SampledValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SampledValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SampledValue.class));

       return (TypeAdapter<T>) new TypeAdapter<SampledValue>() {
           @Override
           public void write(JsonWriter out, SampledValue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SampledValue read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SampledValue given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SampledValue
  * @throws IOException if the JSON string is invalid with respect to SampledValue
  */
  public static SampledValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SampledValue.class);
  }

 /**
  * Convert an instance of SampledValue to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

