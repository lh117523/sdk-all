package io.github.ealenxie.walmart.marketplace.rules;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/11 10:37
 */
@Getter
@Setter
public class RuleCreatePayload {


    /**
     * ruleHeader
     */
    @JsonProperty("ruleHeader")
    private RuleHeader ruleHeader;
    /**
     * rules
     */
    @JsonProperty("rules")
    private CreateRules rules;
}
