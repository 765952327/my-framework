package cn.winstone.framework.mybatis.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Winstone
 * @date 2021/8/25 - 5:06 下午
 */

@Retention(RetentionPolicy.RUNTIME)
@Target( {ElementType.FIELD})
public @interface UpdateTime {
	String value() default "";
}
