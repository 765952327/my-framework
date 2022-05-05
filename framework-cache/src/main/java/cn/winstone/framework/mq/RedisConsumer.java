package cn.winstone.framework.mq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @author Winstone
 * @date 2022/5/4 - 23:33
 */
@Component
public class RedisConsumer<M extends Message<?>> implements Consumer<M>{
	@Autowired
	private RedisTemplate<String, M> redis;

	@Override
	public void consume(M message) {
		redis.opsForList().rightPop(message.getQueueName());
	}
}
