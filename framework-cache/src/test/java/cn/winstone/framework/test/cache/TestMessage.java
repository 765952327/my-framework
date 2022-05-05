package cn.winstone.framework.test.cache;

import cn.winstone.framework.mq.AbstractMessage;

/**
 * @author Winstone
 * @date 2022/5/4 - 23:21
 */
public class TestMessage extends AbstractMessage<String>{
	@Override
	public String getQueueName() {
		return TestMessage.class.getName();
	}
}
