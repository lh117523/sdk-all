package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/10 11:23
 */
@Getter
@Setter
public class Header {
    /**
     * headerAttributes
     */
    @JsonProperty("headerAttributes")
    private HeaderAttributes headerAttributes;
}
