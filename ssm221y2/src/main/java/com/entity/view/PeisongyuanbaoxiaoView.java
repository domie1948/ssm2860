package com.entity.view;

import com.entity.PeisongyuanbaoxiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 配送员报销
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-12 20:16:54
 */
@TableName("peisongyuanbaoxiao")
public class PeisongyuanbaoxiaoView  extends PeisongyuanbaoxiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PeisongyuanbaoxiaoView(){
	}
 
 	public PeisongyuanbaoxiaoView(PeisongyuanbaoxiaoEntity peisongyuanbaoxiaoEntity){
 	try {
			BeanUtils.copyProperties(this, peisongyuanbaoxiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
