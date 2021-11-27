package cn.winstone.finder.dao;

import cn.winstone.framework.Test;
import cn.winstone.framework.mybatis.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Winstone
 * @date 2021/8/25 - 6:56 下午
 */
@Mapper
public interface TestDao extends BaseMapper<Test> {
}
