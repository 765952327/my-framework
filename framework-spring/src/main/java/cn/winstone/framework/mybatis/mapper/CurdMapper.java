package cn.winstone.framework.mybatis.mapper;


/**
 * 基础增删改查功能mapper
 * @author Winstone
 * @date 2021/8/24 - 7:10 下午
 */

public interface CurdMapper<T> extends InsertMapper<T>,
		DeleteMapper<T>,
		UpdateMapper<T>,
		SelectMapper<T> {
}