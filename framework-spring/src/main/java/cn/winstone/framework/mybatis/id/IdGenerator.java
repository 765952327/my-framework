package cn.winstone.framework.mybatis.id;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.genid.GenId;

/**
 * ID 生成器（唯一ID）
 * 用不上了
 * @author Winstone
 * @date 2021/8/25 - 4:27 下午
 */
@Deprecated
public class IdGenerator implements GenId<Long> {
	private long nextId(){
		Snowflake snowflake = IdUtil.getSnowflake(1, 1);
		return snowflake.nextId();
	}

	@Override
	public Long genId(String s, String s1) {
		return nextId();
	}
}
