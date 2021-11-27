package cn.winstone.framework.mybatis.mapper;

import tk.mybatis.mapper.common.Marker;
import tk.mybatis.mapper.common.MySqlMapper;
import tk.mybatis.mapper.common.base.insert.InsertSelectiveMapper;

/**
 * 基础新增功能mapper
 * @author Winstone
 * @date 2021/8/24 - 7:13 下午
 */
public interface InsertMapper<T> extends Marker,
		tk.mybatis.mapper.common.base.BaseInsertMapper<T>,
		InsertSelectiveMapper<T>,
		MySqlMapper<T>{
}