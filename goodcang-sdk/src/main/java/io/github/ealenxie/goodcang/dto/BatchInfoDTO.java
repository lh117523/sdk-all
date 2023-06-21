package io.github.ealenxie.goodcang.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2022/12/14 10:34
 */
@Getter
@Setter
public class BatchInfoDTO {
    @JsonProperty("validity_period_info")
    private ValidityPeriodInfoDTO validityPeriodInfo;
}
