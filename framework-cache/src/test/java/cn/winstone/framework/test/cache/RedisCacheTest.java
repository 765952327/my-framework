package cn.winstone.framework.test.cache;

import cn.winstone.framework.CacheApp;
import cn.winstone.framework.cache.Cache;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Winstone
 * @date 2022/5/4 - 21:17
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CacheApp.class)
@ComponentScan(basePackages = {"cn.winstone.framework.cache"})
public class RedisCacheTest{
	@Autowired
	private Cache<String> cache;

	@Test
	public void set(){
		cache.set("test","test");
	}

	@Test
	public void get(){
		String s = cache.get("test");
		System.out.println(s);
	}

}
