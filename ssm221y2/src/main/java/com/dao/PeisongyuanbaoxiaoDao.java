package com.dao;

import com.entity.PeisongyuanbaoxiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PeisongyuanbaoxiaoVO;
import com.entity.view.PeisongyuanbaoxiaoView;


/**
 * 配送员报销
 * 
 * @author 
 * @email 
 * @date 2021-04-12 20:16:54
 */
public interface PeisongyuanbaoxiaoDao extends BaseMapper<PeisongyuanbaoxiaoEntity> {
	
	List<PeisongyuanbaoxiaoVO> selectListVO(@Param("ew") Wrapper<PeisongyuanbaoxiaoEntity> wrapper);
	
	PeisongyuanbaoxiaoVO selectVO(@Param("ew") Wrapper<PeisongyuanbaoxiaoEntity> wrapper);
	
	List<PeisongyuanbaoxiaoView> selectListView(@Param("ew") Wrapper<PeisongyuanbaoxiaoEntity> wrapper);

	List<PeisongyuanbaoxiaoView> selectListView(Pagination page,@Param("ew") Wrapper<PeisongyuanbaoxiaoEntity> wrapper);
	
	PeisongyuanbaoxiaoView selectView(@Param("ew") Wrapper<PeisongyuanbaoxiaoEntity> wrapper);
	
}
