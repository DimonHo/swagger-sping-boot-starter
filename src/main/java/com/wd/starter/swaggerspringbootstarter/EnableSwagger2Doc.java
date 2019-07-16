package com.wd.starter.swaggerspringbootstarter;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @Author: He Zhigang
 * @Date: 2019/7/15 18:21
 * @Description:
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({
        SwaggerAutoConfiguration.class,
        GsonSerializerConfigration.class
})
public @interface EnableSwagger2Doc {
}
