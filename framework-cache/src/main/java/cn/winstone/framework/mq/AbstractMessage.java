package cn.winstone.framework.mq;

/**
 * @author Winstone
 * @date 2022/5/4 - 23:19
 */
public abstract class AbstractMessage<T> implements Message<T>{
	private T value;
	private String queueName;
	@Override
	public T getValue() {
		return this.value;
	}
}
