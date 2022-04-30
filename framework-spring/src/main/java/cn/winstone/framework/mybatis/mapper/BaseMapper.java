package cn.winstone.framework.mybatis.mapper;

import cn.winstone.framework.entity.Entity;
import cn.winstone.framework.mybatis.id.IdGenerator;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.weekend.WeekendSqls;


/**
 * @author Winstone
 * @date 2021/8/25 - 10:22 上午
 */
public interface BaseMapper <T extends Entity> extends CurdMapper<T> {

	default Example.Builder exampleOf(Class<T> clazz) {
		return new Example.Builder(clazz);
	}

	default WeekendSqls<T> criteria() {
		return WeekendSqls.custom();
	}

	IdGenerator idGenerator = new IdGenerator();

}
