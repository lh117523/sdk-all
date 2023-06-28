package io.github.ealenxie.fop.fulfillment.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/2/28 14:48
 */
@Getter
@Setter
public class ExternalCreateVO {

    /**
     * 返回派送委托单号
     */
    @JsonProperty("consignment_no")
    private String consignmentNo;
}
