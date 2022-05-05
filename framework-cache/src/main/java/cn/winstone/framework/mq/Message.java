package cn.winstone.framework.mq;

/**
 * @author Winstone
 * @date 2022/5/4 - 23:16
 */
public interface Message<T>{
	T getValue();

	String getQueueName();
}
