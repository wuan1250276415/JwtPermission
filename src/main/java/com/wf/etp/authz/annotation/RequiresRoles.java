package com.wf.etp.authz.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

/**
 * 角色判断注解
 * 
 * @author wangfan
 * @date 2018-2-1 上午10:50:34
 */
@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface RequiresRoles {

	String[] value();

	/**
	 * 多个权限的逻辑操作，是and还是or，默认是and
	 */
	Logical logical() default Logical.AND;
}
