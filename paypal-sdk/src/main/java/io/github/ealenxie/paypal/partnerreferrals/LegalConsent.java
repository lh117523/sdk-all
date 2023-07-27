package io.github.ealenxie.paypal.partnerreferrals;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/27 9:04
 * @version 1.0
 */
@Getter
@Setter
public class LegalConsent {
    /**
     * type
     */
    @JsonProperty("type")
    private String type;
    /**
     * granted
     */
    @JsonProperty("granted")
    private Boolean granted;
}
