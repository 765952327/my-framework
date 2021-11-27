package cn.winstone.framework;

import cn.winstone.framework.entity.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Table;

/**
 * @author Winstone
 * @date 2021/8/25 - 6:53 下午
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "GOOD")
public class Test extends Entity {
	private String imgUrl;
}
