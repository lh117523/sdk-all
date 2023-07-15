package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/15 13:55
 */
@NoArgsConstructor
@Data
public class OrderCancelListData {

    /**
     * orderNoList
     */
    @JsonProperty("orderNoList")
    private List<CancelOrderData> orderNoList;
}
