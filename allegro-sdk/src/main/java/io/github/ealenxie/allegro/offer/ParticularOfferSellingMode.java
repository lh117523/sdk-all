package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.Money;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/6/29 15:51
 */
@NoArgsConstructor
@Data
public class ParticularOfferSellingMode {
    /**
     * format
     */
    @JsonProperty("format")
    private String format;
    /**
     * price
     */
    @JsonProperty("price")
    private Money price;
    /**
     * minimalPrice
     */
    @JsonProperty("minimalPrice")
    private Money minimalPrice;
    /**
     * startingPrice
     */
    @JsonProperty("startingPrice")
    private Money startingPrice;
    /**
     * netPrice
     */
    @JsonProperty("netPrice")
    private Money netPrice;
}
