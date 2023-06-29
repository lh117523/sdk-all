package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/6/29 15:51
 */
@NoArgsConstructor
@Data
public class Tax {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * rate
     */
    @JsonProperty("rate")
    private String rate;
    /**
     * subject
     */
    @JsonProperty("subject")
    private String subject;
    /**
     * exemption
     */
    @JsonProperty("exemption")
    private String exemption;
    /**
     * percentage
     */
    @JsonProperty("percentage")
    private String percentage;
}
