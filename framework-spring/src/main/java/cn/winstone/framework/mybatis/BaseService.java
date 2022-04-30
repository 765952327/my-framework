package cn.winstone.framework.mybatis;

import cn.winstone.framework.entity.Entity;
import cn.winstone.framework.mybatis.mapper.BaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@SuppressWarnings("all")
public abstract class BaseService<T extends Entity> {

	@Autowired
	private BaseMapper<T> mapper;

	public T get(Long id) {
		return (T) mapper.selectByPrimaryKey(id);
	}

	public T select(T entity) {
		return (T) mapper.selectOne(entity);
	}

	public List<T> query(T entity) {
		return (List<T>) mapper.select(entity);
	}

	public void updateSelective(T entity) {
		mapper.updateByPrimaryKeySelective(entity);
	}

	public void update(T entity) {
		mapper.updateByPrimaryKey(entity);
	}

	public void delete(Long id){
		mapper.deleteByPrimaryKey(id);
	}

	public void delete(T entity){
		mapper.delete(entity);
	}

	public void create(T entity){
		mapper.insert(entity);
	}
}
