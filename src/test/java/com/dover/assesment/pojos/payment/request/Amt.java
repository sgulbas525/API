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
        "ccy",
        "amt",
})
public class Amt {
    private String ccy;
    private String amt;
}
