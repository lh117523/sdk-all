package io.github.ealenxie.goodcang.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/25 16:13
 */
@Getter
@Setter
public class ProductFreeze {
    /**
     * 冻结id
     */
    @JsonProperty("id")
    private String id;
    /**
     * 商品sku
     */
    @JsonProperty("product_sku")
    private String productSku;
    /**
     * 冻结状态
     */
    @JsonProperty("freeze_status")
    private Integer freezeStatus;
    /**
     * 状态文本
     */
    @JsonProperty("freeze_status_text")
    private String freezeStatusText;
    /**
     * 仓库代码
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    /**
     * 仓库名称
     */
    @JsonProperty("warehouse_name")
    private String warehouseName;
    /**
     * 操作原因
     */
    @JsonProperty("operate_reason")
    private String operateReason;
    /**
     * 操作时间
     */
    @JsonProperty("operate_time")
    private String operateTime;
}
