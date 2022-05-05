package cn.winstone.framework.mq;

/**
 * @author Winstone
 * @date 2022/5/4 - 23:31
 */
public interface Consumer<M extends Message<?>>{
	void consume(M message);
}
