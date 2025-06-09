package com.entity.view;

import com.entity.JiesuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 结算
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-12 20:16:54
 */
@TableName("jiesuan")
public class JiesuanView  extends JiesuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiesuanView(){
	}
 
 	public JiesuanView(JiesuanEntity jiesuanEntity){
 	try {
			BeanUtils.copyProperties(this, jiesuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
