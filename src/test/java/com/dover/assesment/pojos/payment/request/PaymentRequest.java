package com.dover.assesment.pojos.payment.request;


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
        "paymentDateStamp",
        "dbtr",
        "cdtr",
        "pymt"

})
public class PaymentRequest {

    @JsonProperty ("paymentDateStamp")
    private String paymentDateStamp;
    @JsonProperty ("dbtr")
    private Debtor dbtr;

    @JsonProperty ("cdtr")
    private Creditor cdtr;
    @JsonProperty ("pymtinf")
    private PaymentInformation pymtinf;

}
