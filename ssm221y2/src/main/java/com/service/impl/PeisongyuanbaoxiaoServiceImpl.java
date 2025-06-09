package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.PeisongyuanbaoxiaoDao;
import com.entity.PeisongyuanbaoxiaoEntity;
import com.service.PeisongyuanbaoxiaoService;
import com.entity.vo.PeisongyuanbaoxiaoVO;
import com.entity.view.PeisongyuanbaoxiaoView;

@Service("peisongyuanbaoxiaoService")
public class PeisongyuanbaoxiaoServiceImpl extends ServiceImpl<PeisongyuanbaoxiaoDao, PeisongyuanbaoxiaoEntity> implements PeisongyuanbaoxiaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PeisongyuanbaoxiaoEntity> page = this.selectPage(
                new Query<PeisongyuanbaoxiaoEntity>(params).getPage(),
                new EntityWrapper<PeisongyuanbaoxiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PeisongyuanbaoxiaoEntity> wrapper) {
		  Page<PeisongyuanbaoxiaoView> page =new Query<PeisongyuanbaoxiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PeisongyuanbaoxiaoVO> selectListVO(Wrapper<PeisongyuanbaoxiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PeisongyuanbaoxiaoVO selectVO(Wrapper<PeisongyuanbaoxiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PeisongyuanbaoxiaoView> selectListView(Wrapper<PeisongyuanbaoxiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PeisongyuanbaoxiaoView selectView(Wrapper<PeisongyuanbaoxiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
