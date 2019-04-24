package com.kubra.prepay.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kubra.prepay.generated.model.AccountStatusDto;
import com.kubra.prepay.generated.model.ContactDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccountDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-04-24T16:35:28.120441-07:00[America/Phoenix]")

public class AccountDto   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("connectionStatus")
  private AccountStatusDto connectionStatus = null;

  @JsonProperty("balance")
  private Double balance;

  @JsonProperty("contactInfo")
  @Valid
  private List<ContactDto> contactInfo = null;

  @JsonProperty("accountType")
  private String accountType;

  public AccountDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Internal account Id
   * @return id
  */
  @ApiModelProperty(value = "Internal account Id")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AccountDto connectionStatus(AccountStatusDto connectionStatus) {
    this.connectionStatus = connectionStatus;
    return this;
  }

  /**
   * Get connectionStatus
   * @return connectionStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccountStatusDto getConnectionStatus() {
    return connectionStatus;
  }

  public void setConnectionStatus(AccountStatusDto connectionStatus) {
    this.connectionStatus = connectionStatus;
  }

  public AccountDto balance(Double balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Get balance
   * @return balance
  */
  @ApiModelProperty(value = "")


  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  public AccountDto contactInfo(List<ContactDto> contactInfo) {
    this.contactInfo = contactInfo;
    return this;
  }

  public AccountDto addContactInfoItem(ContactDto contactInfoItem) {
    if (this.contactInfo == null) {
      this.contactInfo = new ArrayList<>();
    }
    this.contactInfo.add(contactInfoItem);
    return this;
  }

  /**
   * Get contactInfo
   * @return contactInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ContactDto> getContactInfo() {
    return contactInfo;
  }

  public void setContactInfo(List<ContactDto> contactInfo) {
    this.contactInfo = contactInfo;
  }

  public AccountDto accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Get accountType
   * @return accountType
  */
  @ApiModelProperty(value = "")


  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountDto account = (AccountDto) o;
    return Objects.equals(this.id, account.id) &&
        Objects.equals(this.connectionStatus, account.connectionStatus) &&
        Objects.equals(this.balance, account.balance) &&
        Objects.equals(this.contactInfo, account.contactInfo) &&
        Objects.equals(this.accountType, account.accountType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, connectionStatus, balance, contactInfo, accountType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    connectionStatus: ").append(toIndentedString(connectionStatus)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    contactInfo: ").append(toIndentedString(contactInfo)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
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

