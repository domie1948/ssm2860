package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiesuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiesuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiesuanView;


/**
 * 结算
 *
 * @author 
 * @email 
 * @date 2021-04-12 20:16:54
 */
public interface JiesuanService extends IService<JiesuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiesuanVO> selectListVO(Wrapper<JiesuanEntity> wrapper);
   	
   	JiesuanVO selectVO(@Param("ew") Wrapper<JiesuanEntity> wrapper);
   	
   	List<JiesuanView> selectListView(Wrapper<JiesuanEntity> wrapper);
   	
   	JiesuanView selectView(@Param("ew") Wrapper<JiesuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiesuanEntity> wrapper);
   	
}

