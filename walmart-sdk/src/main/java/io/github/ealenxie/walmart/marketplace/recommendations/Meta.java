package io.github.ealenxie.walmart.marketplace.recommendations;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 12:09
 */
@Getter
@Setter
public class Meta {
    /**
     * limit
     */
    @JsonProperty("limit")
    private Integer limit;
    /**
     * nextCursor
     */
    @JsonProperty("nextCursor")
    private String nextCursor;
}
