package cn.winstone.framework.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Winstone
 * @date 2021/8/28 - 2:56 下午
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AccessResult extends CodeMessage {
	private Object result;

	public AccessResult() {
	}
	public AccessResult(int code,String msg){
		super.setCode(code);
		super.setMessage(msg);
	}

	public static AccessResult SUCCESS() {
		return new AccessResult(0, "success");
	}

	public static AccessResult ERROR() {
		return new AccessResult(-1, "error");
	}

	public static AccessResult newSUCCESS(Object result) {
		AccessResult accessResult =  AccessResult.SUCCESS();
		accessResult.setResult(result);
		return accessResult;
	}

}
