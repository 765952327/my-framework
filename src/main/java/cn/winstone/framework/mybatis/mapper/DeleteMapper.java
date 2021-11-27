package cn.winstone.framework.mybatis.mapper;

import tk.mybatis.mapper.common.Marker;
import tk.mybatis.mapper.common.base.delete.DeleteByPrimaryKeyMapper;
import tk.mybatis.mapper.common.condition.DeleteByConditionMapper;
import tk.mybatis.mapper.common.ids.DeleteByIdsMapper;

/**
 * 基础删除功能mapper
 *
 * @author Winstone
 * @date 2021/8/24 - 7:13 下午
 */
public interface DeleteMapper<T> extends Marker,
		tk.mybatis.mapper.common.base.delete.DeleteMapper<T>,
		DeleteByPrimaryKeyMapper<T>,
		DeleteByConditionMapper<T>,
		DeleteByIdsMapper<T> {
}