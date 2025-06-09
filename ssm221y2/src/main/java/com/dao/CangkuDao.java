package com.dao;

import com.entity.CangkuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CangkuVO;
import com.entity.view.CangkuView;


/**
 * 仓库
 * 
 * @author 
 * @email 
 * @date 2021-04-12 20:16:54
 */
public interface CangkuDao extends BaseMapper<CangkuEntity> {
	
	List<CangkuVO> selectListVO(@Param("ew") Wrapper<CangkuEntity> wrapper);
	
	CangkuVO selectVO(@Param("ew") Wrapper<CangkuEntity> wrapper);
	
	List<CangkuView> selectListView(@Param("ew") Wrapper<CangkuEntity> wrapper);

	List<CangkuView> selectListView(Pagination page,@Param("ew") Wrapper<CangkuEntity> wrapper);
	
	CangkuView selectView(@Param("ew") Wrapper<CangkuEntity> wrapper);
	
}
