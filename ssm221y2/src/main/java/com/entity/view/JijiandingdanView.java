package com.entity.view;

import com.entity.JijiandingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 寄件订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-12 20:16:54
 */
@TableName("jijiandingdan")
public class JijiandingdanView  extends JijiandingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JijiandingdanView(){
	}
 
 	public JijiandingdanView(JijiandingdanEntity jijiandingdanEntity){
 	try {
			BeanUtils.copyProperties(this, jijiandingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
