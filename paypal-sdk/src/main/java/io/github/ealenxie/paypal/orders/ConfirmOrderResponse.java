package io.github.ealenxie.paypal.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Link;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/29 10:00
 */
@Getter
@Setter
public class ConfirmOrderResponse {

    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * paymentSource
     */
    @JsonProperty("payment_source")
    private PayPalPayload<Paypal> paymentSource;
    /**
     * payer
     */
    @JsonProperty("payer")
    private Payer payer;
    /**
     * links
     */
    @JsonProperty("links")
    private List<Link> links;
}
