package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/10 11:27
 */
@NoArgsConstructor
@Data
public class CreateFulfillmentResponse {

    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * header
     */
    @JsonProperty("header")
    private Header header;
    /**
     * payload
     */
    @JsonProperty("payload")
    private RequestIdPayload payload;
}
