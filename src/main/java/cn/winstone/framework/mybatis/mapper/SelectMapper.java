package cn.winstone.framework.mybatis.mapper;

import tk.mybatis.mapper.common.Marker;
import tk.mybatis.mapper.common.base.select.ExistsWithPrimaryKeyMapper;
import tk.mybatis.mapper.common.base.select.SelectAllMapper;
import tk.mybatis.mapper.common.base.select.SelectByPrimaryKeyMapper;
import tk.mybatis.mapper.common.base.select.SelectCountMapper;
import tk.mybatis.mapper.common.base.select.SelectOneMapper;
import tk.mybatis.mapper.common.condition.SelectByConditionMapper;
import tk.mybatis.mapper.common.condition.SelectCountByConditionMapper;
import tk.mybatis.mapper.common.example.SelectByExampleMapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

/**
 * @author Winstone
 * @date 2021/8/24 - 7:11 下午
 */
public interface SelectMapper<T> extends Marker,
		SelectOneMapper<T>,
		tk.mybatis.mapper.common.base.select.SelectMapper<T>,
		SelectAllMapper<T>,
		SelectCountMapper<T>,
		SelectByPrimaryKeyMapper<T>,
		ExistsWithPrimaryKeyMapper<T>,
		SelectByIdsMapper<T>,
		SelectByConditionMapper<T>,
		SelectCountByConditionMapper<T>,
		SelectByExampleMapper<T> {
}