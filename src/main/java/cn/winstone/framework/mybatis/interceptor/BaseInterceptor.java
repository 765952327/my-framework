package cn.winstone.framework.mybatis.interceptor;

/**
 * @author Winstone
 * @date 2021/8/25 - 5:23 下午
 */

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import cn.winstone.framework.mybatis.annotation.CreateTime;
import cn.winstone.framework.mybatis.annotation.UpdateTime;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.springframework.stereotype.Component;

import javax.persistence.Id;
import java.lang.reflect.Field;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

/**
 * mybatis 时间插件
 */
@Slf4j
@Intercepts({
		@Signature(type = Executor.class, method = "update", args = {MappedStatement.class, Object.class}),
})
@Component
public class BaseInterceptor implements Interceptor {

	private final Snowflake snowflake = IdUtil.getSnowflake(1, 1);

	@Override
	public Object intercept(Invocation invocation) throws Throwable {
		MappedStatement mappedStatement = (MappedStatement) invocation.getArgs()[0];

		// 获取 SQL 命令
		SqlCommandType sqlCommandType = mappedStatement.getSqlCommandType();

		// 获取参数
		Object parameter = invocation.getArgs()[1];

		// 获取所有成员变量
		List<Field> fields = new ArrayList<>();
		Class tempClass = parameter.getClass();
		while (tempClass != null) {//当父类为null的时候说明到达了最上层的父类(Object类).
			fields.addAll(Arrays.asList(tempClass.getDeclaredFields()));
			tempClass = tempClass.getSuperclass(); //得到父类,然后赋给自己
		}


		for (Field field : fields) {
			if (field.getAnnotation(CreateTime.class) != null) {
				if (SqlCommandType.INSERT.equals(sqlCommandType)) { // insert 语句插入 createTime
					field.setAccessible(true);
					field.set(parameter, new Timestamp(System.currentTimeMillis()));
				}
			}

			if (field.getAnnotation(UpdateTime.class) != null) { // insert 或 update 语句插入 updateTime
				if (SqlCommandType.INSERT.equals(sqlCommandType) || SqlCommandType.UPDATE.equals(sqlCommandType)) {
					field.setAccessible(true);
					field.set(parameter, new Timestamp(System.currentTimeMillis()));
				}
			}
			if (field.getAnnotation(Id.class) != null) {
				if (SqlCommandType.INSERT.equals(sqlCommandType)) {
					field.setAccessible(true);
					field.set(parameter, snowflake.nextId());
				}
			}
		}
		return invocation.proceed();
	}

	@Override
	public Object plugin(Object target) {
		return Plugin.wrap(target, this);
	}

	@Override
	public void setProperties(Properties properties) {
	}
}