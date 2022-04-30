package cn.winstone.framework.entity;

import cn.winstone.framework.mybatis.annotation.CreateTime;
import cn.winstone.framework.mybatis.annotation.UpdateTime;
import lombok.Data;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * BaseEntity
 */
@Data
public class Entity implements Serializable {
	@Id
	private Long id;
	/**
	 * 创建时间
	 */
	@CreateTime
	private Date createTime;
	/**
	 * 更新时间
	 */
	@UpdateTime
	private Date updateTime;
}
