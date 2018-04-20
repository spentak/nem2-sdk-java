/*
 * Copyright 2018 NEM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * NIS2 API Endpoints
 * This document defines all the nis2 api endpoints
 *
 * OpenAPI spec version: 0.9.1
 * Contact: guillem@nemeurope.eu
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.nem.sdk.infrastructure;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

/**
 * LockFundsDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T12:25:00.783Z")
public class LockFundsDTO {
  @SerializedName("account")
  private String account = null;

  @SerializedName("accountAddress")
  private String accountAddress = null;

  @SerializedName("mosaicId")
  private UInt64DTO mosaicId = null;

  @SerializedName("amount")
  private UInt64DTO amount = null;

  @SerializedName("height")
  private UInt64DTO height = null;

  @SerializedName("status")
  private Integer status = null;

  @SerializedName("hash")
  private String hash = null;

  public LockFundsDTO account(String account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public LockFundsDTO accountAddress(String accountAddress) {
    this.accountAddress = accountAddress;
    return this;
  }

   /**
   * Get accountAddress
   * @return accountAddress
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAccountAddress() {
    return accountAddress;
  }

  public void setAccountAddress(String accountAddress) {
    this.accountAddress = accountAddress;
  }

  public LockFundsDTO mosaicId(UInt64DTO mosaicId) {
    this.mosaicId = mosaicId;
    return this;
  }

   /**
   * Get mosaicId
   * @return mosaicId
  **/
  @ApiModelProperty(required = true, value = "")
  public UInt64DTO getMosaicId() {
    return mosaicId;
  }

  public void setMosaicId(UInt64DTO mosaicId) {
    this.mosaicId = mosaicId;
  }

  public LockFundsDTO amount(UInt64DTO amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "")
  public UInt64DTO getAmount() {
    return amount;
  }

  public void setAmount(UInt64DTO amount) {
    this.amount = amount;
  }

  public LockFundsDTO height(UInt64DTO height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @ApiModelProperty(required = true, value = "")
  public UInt64DTO getHeight() {
    return height;
  }

  public void setHeight(UInt64DTO height) {
    this.height = height;
  }

  public LockFundsDTO status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public LockFundsDTO hash(String hash) {
    this.hash = hash;
    return this;
  }

   /**
   * Get hash
   * @return hash
  **/
  @ApiModelProperty(required = true, value = "")
  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LockFundsDTO lockFundsDTO = (LockFundsDTO) o;
    return Objects.equals(this.account, lockFundsDTO.account) &&
        Objects.equals(this.accountAddress, lockFundsDTO.accountAddress) &&
        Objects.equals(this.mosaicId, lockFundsDTO.mosaicId) &&
        Objects.equals(this.amount, lockFundsDTO.amount) &&
        Objects.equals(this.height, lockFundsDTO.height) &&
        Objects.equals(this.status, lockFundsDTO.status) &&
        Objects.equals(this.hash, lockFundsDTO.hash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, accountAddress, mosaicId, amount, height, status, hash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LockFundsDTO {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    accountAddress: ").append(toIndentedString(accountAddress)).append("\n");
    sb.append("    mosaicId: ").append(toIndentedString(mosaicId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

