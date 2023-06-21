package io.github.ealenxie.fruugo.vo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author 无敌暴龙战士
 * @since 2022/08/10 12:27
 */
@Getter
@Setter
public class OrderLines {
    /**
     * orderLine
     */
    @JacksonXmlProperty(localName = "order")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<OrderLine> orderLine;
}
