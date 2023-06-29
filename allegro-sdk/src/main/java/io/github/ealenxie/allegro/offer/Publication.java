package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/6/29 15:39
 */
@NoArgsConstructor
@Data
public class Publication {
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * startingAt
     */
    @JsonProperty("startingAt")
    private String startingAt;
    /**
     * startedAt
     */
    @JsonProperty("startedAt")
    private String startedAt;
    /**
     * endingAt
     */
    @JsonProperty("endingAt")
    private String endingAt;
    /**
     * endedAt
     */
    @JsonProperty("endedAt")
    private String endedAt;
    /**
     * marketplaces
     */
    @JsonProperty("marketplaces")
    private Marketplaces marketplaces;
}
