package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/17 10:39
 */
@NoArgsConstructor
@Data
public class ReturnOrderList {
    /**
     * outboundOrderNo
     */
    @JsonProperty("outboundOrderNo")
    private String outboundOrderNo;
    /**
     * orderGoodsList
     */
    @JsonProperty("orderGoodsList")
    private List<OrderGoodsList> orderGoodsList;
    /**
     * sellerOrderNo
     */
    @JsonProperty("sellerOrderNo")
    private String sellerOrderNo;
    /**
     * expressNo
     */
    @JsonProperty("expressNo")
    private String expressNo;
    /**
     * mdImageList
     */
    @JsonProperty("mdImageList")
    private Object mdImageList;
    /**
     * customerExpressNo
     */
    @JsonProperty("customerExpressNo")
    private String customerExpressNo;
    /**
     * qtyItemNum
     */
    @JsonProperty("qtyItemNum")
    private Integer qtyItemNum;
    /**
     * buyerName
     */
    @JsonProperty("buyerName")
    private String buyerName;
    /**
     * warehouseCode
     */
    @JsonProperty("warehouseCode")
    private String warehouseCode;
    /**
     * returnGoodsOrderNo
     */
    @JsonProperty("returnGoodsOrderNo")
    private String returnGoodsOrderNo;
    /**
     * destroyOutboundOrder
     */
    @JsonProperty("destroyOutboundOrder")
    private Object destroyOutboundOrder;
    /**
     * retrunReason
     */
    @JsonProperty("retrunReason")
    private String retrunReason;
    /**
     * originCode
     */
    @JsonProperty("originCode")
    private String originCode;
    /**
     * rmaNo
     */
    @JsonProperty("rmaNo")
    private String rmaNo;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * createDate
     */
    @JsonProperty("createDate")
    private String createDate;
}
