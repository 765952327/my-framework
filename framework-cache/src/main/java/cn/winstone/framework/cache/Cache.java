package cn.winstone.framework.cache;

import java.util.List;

/**
 * 缓存
 * @author Winstone
 * @date 2022/5/4 - 21:01
 */
public interface Cache<T>{
	void set(String key, T value);

	void setList(String key, List<T> values);

	T get(String key);

	List<T> getList(String key);
}
