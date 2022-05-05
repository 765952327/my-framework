package cn.winstone.framework.mq;

/**
 * @author Winstone
 * @date 2022/5/4 - 23:15
 */
public interface Producer<M extends Message<?>>{
	void send(M message);
}
