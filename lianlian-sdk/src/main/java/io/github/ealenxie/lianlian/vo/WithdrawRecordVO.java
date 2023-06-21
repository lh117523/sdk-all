package io.github.ealenxie.lianlian.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/6/7 17:26
 */
@Getter
@Setter
public class WithdrawRecordVO {
    @JsonProperty("totalSize")
    private Integer totalSize;
    @JsonProperty("resultList")
    private List<WithdrawRecord> resultList;
}
