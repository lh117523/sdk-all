package io.github.ealenxie.allegro.setting;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/3 14:21
 * @version 1.0
 */
@Getter
@Setter
public class ShippingRateResponse {

    /**
     * shippingRates
     */
    @JsonProperty("shippingRates")
    private List<ShippingRate> shippingRates;
}
