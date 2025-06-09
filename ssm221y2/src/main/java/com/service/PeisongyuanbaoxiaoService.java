package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PeisongyuanbaoxiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PeisongyuanbaoxiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PeisongyuanbaoxiaoView;


/**
 * 配送员报销
 *
 * @author 
 * @email 
 * @date 2021-04-12 20:16:54
 */
public interface PeisongyuanbaoxiaoService extends IService<PeisongyuanbaoxiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PeisongyuanbaoxiaoVO> selectListVO(Wrapper<PeisongyuanbaoxiaoEntity> wrapper);
   	
   	PeisongyuanbaoxiaoVO selectVO(@Param("ew") Wrapper<PeisongyuanbaoxiaoEntity> wrapper);
   	
   	List<PeisongyuanbaoxiaoView> selectListView(Wrapper<PeisongyuanbaoxiaoEntity> wrapper);
   	
   	PeisongyuanbaoxiaoView selectView(@Param("ew") Wrapper<PeisongyuanbaoxiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PeisongyuanbaoxiaoEntity> wrapper);
   	
}

