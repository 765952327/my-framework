package cn.winstone.framework.mybatis.mapper;

import tk.mybatis.mapper.common.Marker;
import tk.mybatis.mapper.common.base.update.UpdateByPrimaryKeyMapper;
import tk.mybatis.mapper.common.base.update.UpdateByPrimaryKeySelectiveMapper;
import tk.mybatis.mapper.common.condition.UpdateByConditionMapper;
import tk.mybatis.mapper.common.condition.UpdateByConditionSelectiveMapper;
import tk.mybatis.mapper.common.example.UpdateByExampleSelectiveMapper;

/**
/**
 * 基础修改功能mapper
 * @author Winstone
 * @date 2021/8/24 - 7:11 下午
 */
public interface UpdateMapper<T> extends Marker,
		UpdateByPrimaryKeyMapper<T>,
		UpdateByPrimaryKeySelectiveMapper<T>,
		UpdateByConditionMapper<T>,
		UpdateByConditionSelectiveMapper<T>,
		UpdateByExampleSelectiveMapper<T> {
}