package xyz.zao123.configtest;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author gejt
 */
@Data
@Accessors(chain = true)
public class HelloWorldDto {
    private String name;
    private String msg;
}
