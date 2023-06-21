package io.github.ealenxie.winit.oswh.outbound.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/4/21 13:22
 * @version 1.0
 */
@Getter
@Setter
public class OutboundOrderFeeResp {

    /**
     * 分页参数
     */
    @JsonProperty("pageParams")
    private PageParamsVO pageParams;
    /**
     * 查询结果
     */
    @JsonProperty("list")
    private List<OutboundOrderFeeVO> list;
}
