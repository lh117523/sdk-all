package io.github.ealenxie.walmart.marketplace.prices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/7 17:02
 * @version 1.0
 */
@Getter
@Setter
public class StrategyResponse {

    /**
     * repricerStrategy
     */
    @JsonProperty("repricerStrategy")
    private String repricerStrategy;
    /**
     * strategyCollectionId
     */
    @JsonProperty("strategyCollectionId")
    private String strategyCollectionId;
    /**
     * enabled
     */
    @JsonProperty("enabled")
    private Boolean enabled;
    /**
     * enableRepricerForPromotion
     */
    @JsonProperty("enableRepricerForPromotion")
    private Boolean enableRepricerForPromotion;
    /**
     * strategies
     */
    @JsonProperty("strategies")
    private List<Strategies> strategies;
}
