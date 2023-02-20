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
        "crty",
        "city",
        "pstcd",
        "bldNb"

})
public class Adr {

    @JsonProperty("crty")
    String crty;
    @JsonProperty("city")

    String city;
    @JsonProperty("pstcd")

    String pstcd;
    @JsonProperty("bldNb")

    String bldNb;
}
