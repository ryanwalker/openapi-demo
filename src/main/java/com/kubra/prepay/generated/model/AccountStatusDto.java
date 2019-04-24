package com.kubra.prepay.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets AccountStatus
 */
public enum AccountStatusDto {
  
  CONNECTED("CONNECTED"),
  
  PAUSED("PAUSED"),
  
  DISCONNECTED("DISCONNECTED");

  private String value;

  AccountStatusDto(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AccountStatusDto fromValue(String text) {
    for (AccountStatusDto b : AccountStatusDto.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

