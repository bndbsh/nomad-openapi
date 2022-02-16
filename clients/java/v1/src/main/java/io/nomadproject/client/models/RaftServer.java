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

/**
 * RaftServer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RaftServer {
  public static final String SERIALIZED_NAME_ADDRESS = "Address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_I_D = "ID";
  @SerializedName(SERIALIZED_NAME_I_D)
  private String ID;

  public static final String SERIALIZED_NAME_LEADER = "Leader";
  @SerializedName(SERIALIZED_NAME_LEADER)
  private Boolean leader;

  public static final String SERIALIZED_NAME_NODE = "Node";
  @SerializedName(SERIALIZED_NAME_NODE)
  private String node;

  public static final String SERIALIZED_NAME_RAFT_PROTOCOL = "RaftProtocol";
  @SerializedName(SERIALIZED_NAME_RAFT_PROTOCOL)
  private String raftProtocol;

  public static final String SERIALIZED_NAME_VOTER = "Voter";
  @SerializedName(SERIALIZED_NAME_VOTER)
  private Boolean voter;


  public RaftServer address(String address) {
    
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


  public RaftServer ID(String ID) {
    
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


  public RaftServer leader(Boolean leader) {
    
    this.leader = leader;
    return this;
  }

   /**
   * Get leader
   * @return leader
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getLeader() {
    return leader;
  }


  public void setLeader(Boolean leader) {
    this.leader = leader;
  }


  public RaftServer node(String node) {
    
    this.node = node;
    return this;
  }

   /**
   * Get node
   * @return node
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNode() {
    return node;
  }


  public void setNode(String node) {
    this.node = node;
  }


  public RaftServer raftProtocol(String raftProtocol) {
    
    this.raftProtocol = raftProtocol;
    return this;
  }

   /**
   * Get raftProtocol
   * @return raftProtocol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRaftProtocol() {
    return raftProtocol;
  }


  public void setRaftProtocol(String raftProtocol) {
    this.raftProtocol = raftProtocol;
  }


  public RaftServer voter(Boolean voter) {
    
    this.voter = voter;
    return this;
  }

   /**
   * Get voter
   * @return voter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getVoter() {
    return voter;
  }


  public void setVoter(Boolean voter) {
    this.voter = voter;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RaftServer raftServer = (RaftServer) o;
    return Objects.equals(this.address, raftServer.address) &&
        Objects.equals(this.ID, raftServer.ID) &&
        Objects.equals(this.leader, raftServer.leader) &&
        Objects.equals(this.node, raftServer.node) &&
        Objects.equals(this.raftProtocol, raftServer.raftProtocol) &&
        Objects.equals(this.voter, raftServer.voter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, ID, leader, node, raftProtocol, voter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RaftServer {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    leader: ").append(toIndentedString(leader)).append("\n");
    sb.append("    node: ").append(toIndentedString(node)).append("\n");
    sb.append("    raftProtocol: ").append(toIndentedString(raftProtocol)).append("\n");
    sb.append("    voter: ").append(toIndentedString(voter)).append("\n");
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

}
