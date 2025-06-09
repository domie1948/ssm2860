package com.entity.vo;

import com.entity.WuliuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 物流信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-12 20:16:54
 */
public class WuliuxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 寄件人姓名
	 */
	
	private String jijianrenxingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 物品名称
	 */
	
	private String wupinmingcheng;
		
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
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 配送员工号
	 */
	
	private String peisongyuangonghao;
		
	/**
	 * 配送员姓名
	 */
	
	private String peisongyuanxingming;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 物流状态
	 */
	
	private String wuliuzhuangtai;
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
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
	 * 设置：配送员工号
	 */
	 
	public void setPeisongyuangonghao(String peisongyuangonghao) {
		this.peisongyuangonghao = peisongyuangonghao;
	}
	
	/**
	 * 获取：配送员工号
	 */
	public String getPeisongyuangonghao() {
		return peisongyuangonghao;
	}
				
	
	/**
	 * 设置：配送员姓名
	 */
	 
	public void setPeisongyuanxingming(String peisongyuanxingming) {
		this.peisongyuanxingming = peisongyuanxingming;
	}
	
	/**
	 * 获取：配送员姓名
	 */
	public String getPeisongyuanxingming() {
		return peisongyuanxingming;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：物流状态
	 */
	 
	public void setWuliuzhuangtai(String wuliuzhuangtai) {
		this.wuliuzhuangtai = wuliuzhuangtai;
	}
	
	/**
	 * 获取：物流状态
	 */
	public String getWuliuzhuangtai() {
		return wuliuzhuangtai;
	}
			
}
