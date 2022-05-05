package cn.winstone.framework.mq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @author Winstone
 * @date 2022/5/4 - 23:23
 */
@Component
public class RedisProducer<M extends Message<?>> implements Producer<M>{
	@Autowired
	private RedisTemplate<String, M> redis;

	@Override
	public void send(M message) {
		redis.opsForList().leftPush(message.getQueueName(), message);
	}
}
