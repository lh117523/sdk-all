package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.goodcang.PagePayload;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/26 17:31
 */
@Getter
@Setter
public class PlanOrderBoxListPayload extends PagePayload {

    /**
     * 箱状态
     */
    @JsonProperty("box_status")
    private Integer boxStatus;
    /**
     * 单号类型
     */
    @JsonProperty("code_type")
    private Integer codeType;
    /**
     * 单号值
     */
    @JsonProperty("code_value_list")
    private List<String> codeValueList;
    /**
     * 发货仓库
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    /**
     * 换标服务
     */
    @JsonProperty("is_change_label")
    private Integer isChangeLabel;
    /**
     * 换标要求
     */
    @JsonProperty("label_replacement_option")
    private Integer labelReplacementOption;
    /**
     * 贴标服务
     */
    @JsonProperty("is_stick_label")
    private Integer isStickLabel;
    /**
     * 时间类型
     */
    @JsonProperty("time_type")
    private Integer timeType;
    /**
     * 起始时间
     */
    @JsonProperty("start_time")
    private String startTime;
    /**
     * 截止时间
     */
    @JsonProperty("end_time")
    private String endTime;

}
