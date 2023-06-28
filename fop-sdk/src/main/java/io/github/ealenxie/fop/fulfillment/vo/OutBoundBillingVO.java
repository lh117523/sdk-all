package io.github.ealenxie.fop.fulfillment.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/2/28 12:23
 */
@Getter
@Setter
public class OutBoundBillingVO {
    /**
     * 库存信息集合
     */
    @JsonProperty("billinglist")
    private List<Billing> billinglist;
}
