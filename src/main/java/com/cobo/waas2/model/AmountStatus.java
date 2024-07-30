/*
 * Cobo Wallet as a Service 2.0
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@cobo.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cobo.waas2.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The status of staking amount.
 */
@JsonAdapter(AmountStatus.Adapter.class)
public enum AmountStatus {
  UNKNOWN(null),
  
  STAKEINPROGRESS("StakeInProgress"),
  
  ACTIVE("Active"),
  
  REJECTED("Rejected"),
  
  LIMITEXCEEDED("LimitExceeded"),
  
  INVALID("Invalid"),
  
  UNSTAKEINPROGRESS("UnstakeInProgress"),
  
  WITHDRAWABLE("Withdrawable"),
  
  WITHDRAWINPROGRESS("WithdrawInProgress"),
  
  CLOSED("Closed");

  private String value;

  AmountStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AmountStatus fromValue(String value) {
    for (AmountStatus b : AmountStatus.values()) {
      if (b == UNKNOWN) continue;
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN;
    // throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AmountStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final AmountStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AmountStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AmountStatus.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    AmountStatus.fromValue(value);
  }
}
