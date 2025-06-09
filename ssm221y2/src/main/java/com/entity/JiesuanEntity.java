package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 结算
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-12 20:16:54
 */
@TableName("jiesuan")
public class JiesuanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiesuanEntity() {
		
	}
	
	public JiesuanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 月份
	 */
					
	private String yuefen;
	
	/**
	 * 结算时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date jiesuanshijian;
	
	/**
	 * 站点收益
	 */
					
	private Integer zhandianshouyi;
	
	/**
	 * 站点支出
	 */
					
	private Integer zhandianzhichu;
	
	/**
	 * 员工支出
	 */
					
	private Integer yuangongzhichu;
	
	/**
	 * 结余
	 */
					
	private Integer jieyu;
	
	/**
	 * 收货量
	 */
					
	private Integer shouhuoliang;
	
	/**
	 * 发货量
	 */
					
	private Integer fahuoliang;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：月份
	 */
	public void setYuefen(String yuefen) {
		this.yuefen = yuefen;
	}
	/**
	 * 获取：月份
	 */
	public String getYuefen() {
		return yuefen;
	}
	/**
	 * 设置：结算时间
	 */
	public void setJiesuanshijian(Date jiesuanshijian) {
		this.jiesuanshijian = jiesuanshijian;
	}
	/**
	 * 获取：结算时间
	 */
	public Date getJiesuanshijian() {
		return jiesuanshijian;
	}
	/**
	 * 设置：站点收益
	 */
	public void setZhandianshouyi(Integer zhandianshouyi) {
		this.zhandianshouyi = zhandianshouyi;
	}
	/**
	 * 获取：站点收益
	 */
	public Integer getZhandianshouyi() {
		return zhandianshouyi;
	}
	/**
	 * 设置：站点支出
	 */
	public void setZhandianzhichu(Integer zhandianzhichu) {
		this.zhandianzhichu = zhandianzhichu;
	}
	/**
	 * 获取：站点支出
	 */
	public Integer getZhandianzhichu() {
		return zhandianzhichu;
	}
	/**
	 * 设置：员工支出
	 */
	public void setYuangongzhichu(Integer yuangongzhichu) {
		this.yuangongzhichu = yuangongzhichu;
	}
	/**
	 * 获取：员工支出
	 */
	public Integer getYuangongzhichu() {
		return yuangongzhichu;
	}
	/**
	 * 设置：结余
	 */
	public void setJieyu(Integer jieyu) {
		this.jieyu = jieyu;
	}
	/**
	 * 获取：结余
	 */
	public Integer getJieyu() {
		return jieyu;
	}
	/**
	 * 设置：收货量
	 */
	public void setShouhuoliang(Integer shouhuoliang) {
		this.shouhuoliang = shouhuoliang;
	}
	/**
	 * 获取：收货量
	 */
	public Integer getShouhuoliang() {
		return shouhuoliang;
	}
	/**
	 * 设置：发货量
	 */
	public void setFahuoliang(Integer fahuoliang) {
		this.fahuoliang = fahuoliang;
	}
	/**
	 * 获取：发货量
	 */
	public Integer getFahuoliang() {
		return fahuoliang;
	}

}
