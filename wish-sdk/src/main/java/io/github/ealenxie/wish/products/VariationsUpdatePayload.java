package io.github.ealenxie.wish.products;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.wish.Money;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/13 17:11
 */
@NoArgsConstructor
@Data
public class VariationsUpdatePayload {
    /**
     * sku
     */
    @JsonProperty("sku")
    private String sku;
    /**
     * quantityValue
     */
    @JsonProperty("quantity_value")
    private Integer quantityValue;
    /**
     * price
     */
    @JsonProperty("price")
    private Money price;
    /**
     * cost
     */
    @JsonProperty("cost")
    private Money cost;
    /**
     * gtin
     */
    @JsonProperty("gtin")
    private String gtin;
    /**
     * attributes
     */
    @JsonProperty("attributes")
    private List<Attributes> attributes;
    /**
     * inventories
     */
    @JsonProperty("inventories")
    private List<WarehouseInventory> inventories;
    /**
     * options
     */
    @JsonProperty("options")
    private List<Attributes> options;
    /**
     * logisticsDetails
     */
    @JsonProperty("logistics_details")
    private LogisticsDetails logisticsDetails;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * id
     */
    @JsonProperty("id")
    private String id;


}
