package cn.winstone.framework.cache;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @author Winstone
 * @date 2022/5/4 - 21:05
 */
@Component
public class RedisCache<T> implements Cache<T>{
	@Autowired
	private RedisTemplate<String, T> template;

	@Override
	public void set(String key, T value) {
		template.opsForValue().set(key, value);
	}

	@Override
	public void setList(String key, List<T> values) {
		template.opsForList().leftPushAll(key, values);
	}

	@Override
	public T get(String key) {
		return template.opsForValue().get(key);
	}

	@Override
	public List<T> getList(String key) {
		Long size = template.opsForList().size(key);
		if (size == null || size == 0) {
			size = 1L;
		}
		return template.opsForList().range(key, 0, size - 1);
	}

}
