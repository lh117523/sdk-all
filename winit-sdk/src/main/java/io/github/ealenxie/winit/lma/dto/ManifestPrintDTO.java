package io.github.ealenxie.winit.lma.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/4/21 16:58
 * @version 1.0
 */
@Getter
@Setter
public class ManifestPrintDTO {

    /**
     * Winit 发货单号
     */
    @JsonProperty("winitManifestNo")
    private String winitManifestNo;
}
