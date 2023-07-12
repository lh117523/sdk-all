package io.github.ealenxie.walmart.marketplace.inventory;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/12 11:10
 * @version 1.0
 */
@Getter
@Setter
public class WfsInventory {
    /**
     * sku
     */
    @JsonProperty("sku")
    private String sku;
    /**
     * shipNodes
     */
    @JsonProperty("shipNodes")
    private List<ShipNode> shipNodes;
}
