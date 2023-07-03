package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/3 10:05
 */
@Getter
@Setter
public class Quantity {
    /**
     * value
     */
    @JsonProperty("value")
    private Integer value;
}
