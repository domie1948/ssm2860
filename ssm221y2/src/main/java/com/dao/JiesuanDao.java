package com.dao;

import com.entity.JiesuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiesuanVO;
import com.entity.view.JiesuanView;


/**
 * 结算
 * 
 * @author 
 * @email 
 * @date 2021-04-12 20:16:54
 */
public interface JiesuanDao extends BaseMapper<JiesuanEntity> {
	
	List<JiesuanVO> selectListVO(@Param("ew") Wrapper<JiesuanEntity> wrapper);
	
	JiesuanVO selectVO(@Param("ew") Wrapper<JiesuanEntity> wrapper);
	
	List<JiesuanView> selectListView(@Param("ew") Wrapper<JiesuanEntity> wrapper);

	List<JiesuanView> selectListView(Pagination page,@Param("ew") Wrapper<JiesuanEntity> wrapper);
	
	JiesuanView selectView(@Param("ew") Wrapper<JiesuanEntity> wrapper);
	
}
