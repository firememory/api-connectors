/*
 * Bybit API
 * ## REST API for the Bybit Exchange. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@bybit.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

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
 * Get the last funding fee
 */
@ApiModel(description = "Get the last funding fee")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-27T16:42:38.839+08:00")
public class FundingPredicted {
  @SerializedName("predicted_funding_rate")
  private Double predictedFundingRate = null;

  @SerializedName("predicted_funding_fee")
  private Double predictedFundingFee = null;

  public FundingPredicted predictedFundingRate(Double predictedFundingRate) {
    this.predictedFundingRate = predictedFundingRate;
    return this;
  }

   /**
   * Get predictedFundingRate
   * @return predictedFundingRate
  **/
  @ApiModelProperty(value = "")
  public Double getPredictedFundingRate() {
    return predictedFundingRate;
  }

  public void setPredictedFundingRate(Double predictedFundingRate) {
    this.predictedFundingRate = predictedFundingRate;
  }

  public FundingPredicted predictedFundingFee(Double predictedFundingFee) {
    this.predictedFundingFee = predictedFundingFee;
    return this;
  }

   /**
   * Get predictedFundingFee
   * @return predictedFundingFee
  **/
  @ApiModelProperty(value = "")
  public Double getPredictedFundingFee() {
    return predictedFundingFee;
  }

  public void setPredictedFundingFee(Double predictedFundingFee) {
    this.predictedFundingFee = predictedFundingFee;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundingPredicted fundingPredicted = (FundingPredicted) o;
    return Objects.equals(this.predictedFundingRate, fundingPredicted.predictedFundingRate) &&
        Objects.equals(this.predictedFundingFee, fundingPredicted.predictedFundingFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(predictedFundingRate, predictedFundingFee);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundingPredicted {\n");
    
    sb.append("    predictedFundingRate: ").append(toIndentedString(predictedFundingRate)).append("\n");
    sb.append("    predictedFundingFee: ").append(toIndentedString(predictedFundingFee)).append("\n");
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

