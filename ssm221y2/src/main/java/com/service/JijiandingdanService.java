package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JijiandingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JijiandingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JijiandingdanView;


/**
 * 寄件订单
 *
 * @author 
 * @email 
 * @date 2021-04-12 20:16:54
 */
public interface JijiandingdanService extends IService<JijiandingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JijiandingdanVO> selectListVO(Wrapper<JijiandingdanEntity> wrapper);
   	
   	JijiandingdanVO selectVO(@Param("ew") Wrapper<JijiandingdanEntity> wrapper);
   	
   	List<JijiandingdanView> selectListView(Wrapper<JijiandingdanEntity> wrapper);
   	
   	JijiandingdanView selectView(@Param("ew") Wrapper<JijiandingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JijiandingdanEntity> wrapper);
   	
}

