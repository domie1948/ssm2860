package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CangkuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CangkuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CangkuView;


/**
 * 仓库
 *
 * @author 
 * @email 
 * @date 2021-04-12 20:16:54
 */
public interface CangkuService extends IService<CangkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CangkuVO> selectListVO(Wrapper<CangkuEntity> wrapper);
   	
   	CangkuVO selectVO(@Param("ew") Wrapper<CangkuEntity> wrapper);
   	
   	List<CangkuView> selectListView(Wrapper<CangkuEntity> wrapper);
   	
   	CangkuView selectView(@Param("ew") Wrapper<CangkuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CangkuEntity> wrapper);
   	
}

