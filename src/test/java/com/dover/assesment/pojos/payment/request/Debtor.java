package com.dover.assesment.pojos.payment.request;

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
        "countryCode",
        "bank",
        "account"
})
public class Debtor {

    String countryCode;

    Bank bank;

    Account account;


}
