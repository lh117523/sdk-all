package io.github.ealenxie.allegro.setting;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdNamePayload;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/3 10:29
 * @version 1.0
 */
@Getter
@Setter
public class PublicSellerUsingResponse {

    /**
     * count
     */
    @JsonProperty("count")
    private Integer count;
    /**
     * returnPolicies
     */
    @JsonProperty("returnPolicies")
    private List<IdNamePayload> returnPolicies;
}
