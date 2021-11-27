package cn.winstone.framework;

import cn.winstone.finder.dao.TestDao;
import cn.winstone.framework.entity.Entity;
import cn.winstone.framework.mybatis.BaseService;
import cn.winstone.framework.mybatis.mapper.BaseMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Winstone
 * @date 2021/8/25 - 6:38 下午
 */
@SpringBootTest
@SpringBootConfiguration
public class FrameWorkTest {
	@Autowired(required=true)
	private TestDao dao;
	@Test
	public void test(){
		cn.winstone.framework.Test entity = new cn.winstone.framework.Test();
		dao.insert(entity);
	}
}
