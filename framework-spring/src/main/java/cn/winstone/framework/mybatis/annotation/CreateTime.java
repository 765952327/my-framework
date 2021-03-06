package cn.winstone.framework.mybatis.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 创建时间
 * @author Winstone
 * @date 2021/8/25 - 5:04 下午
 */
@Retention(RetentionPolicy.RUNTIME)
@Target( {ElementType.FIELD})
public @interface CreateTime {
	String value() default "";
}
