package com.entity.vo;

import com.entity.JijiandingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 寄件订单
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-12 20:16:54
 */
public class JijiandingdanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 寄件人姓名
	 */
	
	private String jijianrenxingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 订单编号
	 */
	
	private String dingdanbianhao;
		
	/**
	 * 物品名称
	 */
	
	private String wupinmingcheng;
		
	/**
	 * 物品类型
	 */
	
	private String wupinleixing;
		
	/**
	 * 重量计费
	 */
	
	private String zhongliangjifei;
		
	/**
	 * 重量
	 */
	
	private Integer zhongliang;
		
	/**
	 * 物流费
	 */
	
	private String wuliufei;
		
	/**
	 * 上门地址
	 */
	
	private String shangmendizhi;
		
	/**
	 * 目的地
	 */
	
	private String mudedi;
		
	/**
	 * 收件人姓名
	 */
	
	private String shoujianrenxingming;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 订单状态
	 */
	
	private String dingdanzhuangtai;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：寄件人姓名
	 */
	 
	public void setJijianrenxingming(String jijianrenxingming) {
		this.jijianrenxingming = jijianrenxingming;
	}
	
	/**
	 * 获取：寄件人姓名
	 */
	public String getJijianrenxingming() {
		return jijianrenxingming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：订单编号
	 */
	 
	public void setDingdanbianhao(String dingdanbianhao) {
		this.dingdanbianhao = dingdanbianhao;
	}
	
	/**
	 * 获取：订单编号
	 */
	public String getDingdanbianhao() {
		return dingdanbianhao;
	}
				
	
	/**
	 * 设置：物品名称
	 */
	 
	public void setWupinmingcheng(String wupinmingcheng) {
		this.wupinmingcheng = wupinmingcheng;
	}
	
	/**
	 * 获取：物品名称
	 */
	public String getWupinmingcheng() {
		return wupinmingcheng;
	}
				
	
	/**
	 * 设置：物品类型
	 */
	 
	public void setWupinleixing(String wupinleixing) {
		this.wupinleixing = wupinleixing;
	}
	
	/**
	 * 获取：物品类型
	 */
	public String getWupinleixing() {
		return wupinleixing;
	}
				
	
	/**
	 * 设置：重量计费
	 */
	 
	public void setZhongliangjifei(String zhongliangjifei) {
		this.zhongliangjifei = zhongliangjifei;
	}
	
	/**
	 * 获取：重量计费
	 */
	public String getZhongliangjifei() {
		return zhongliangjifei;
	}
				
	
	/**
	 * 设置：重量
	 */
	 
	public void setZhongliang(Integer zhongliang) {
		this.zhongliang = zhongliang;
	}
	
	/**
	 * 获取：重量
	 */
	public Integer getZhongliang() {
		return zhongliang;
	}
				
	
	/**
	 * 设置：物流费
	 */
	 
	public void setWuliufei(String wuliufei) {
		this.wuliufei = wuliufei;
	}
	
	/**
	 * 获取：物流费
	 */
	public String getWuliufei() {
		return wuliufei;
	}
				
	
	/**
	 * 设置：上门地址
	 */
	 
	public void setShangmendizhi(String shangmendizhi) {
		this.shangmendizhi = shangmendizhi;
	}
	
	/**
	 * 获取：上门地址
	 */
	public String getShangmendizhi() {
		return shangmendizhi;
	}
				
	
	/**
	 * 设置：目的地
	 */
	 
	public void setMudedi(String mudedi) {
		this.mudedi = mudedi;
	}
	
	/**
	 * 获取：目的地
	 */
	public String getMudedi() {
		return mudedi;
	}
				
	
	/**
	 * 设置：收件人姓名
	 */
	 
	public void setShoujianrenxingming(String shoujianrenxingming) {
		this.shoujianrenxingming = shoujianrenxingming;
	}
	
	/**
	 * 获取：收件人姓名
	 */
	public String getShoujianrenxingming() {
		return shoujianrenxingming;
	}
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
				
	
	/**
	 * 设置：订单状态
	 */
	 
	public void setDingdanzhuangtai(String dingdanzhuangtai) {
		this.dingdanzhuangtai = dingdanzhuangtai;
	}
	
	/**
	 * 获取：订单状态
	 */
	public String getDingdanzhuangtai() {
		return dingdanzhuangtai;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
