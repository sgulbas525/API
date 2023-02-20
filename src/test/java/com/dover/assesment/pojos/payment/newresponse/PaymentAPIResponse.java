package com.dover.assesment.pojos.payment.newresponse;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonPropertyOrder({
        "status",
        "cdtrInf"
})
public class PaymentAPIResponse {

    @JsonProperty("status")
    String status;

    @JsonProperty("cdtrInf")
    CdtrInf cdtrInf;
}
