package cn.winstone.framework.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Winstone
 * @date 2021/8/28 - 8:38 下午
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BizException extends Exception {
	private int code;
	private String message;
	private Object result;

	public BizException(String message, Object result) {
		this.code = -1;
		this.message = message;
		this.result = result;
	}

	public BizException(String message) {
		this.code = -1;
		this.message = message;
	}
}
