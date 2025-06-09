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


import com.dao.CangkuDao;
import com.entity.CangkuEntity;
import com.service.CangkuService;
import com.entity.vo.CangkuVO;
import com.entity.view.CangkuView;

@Service("cangkuService")
public class CangkuServiceImpl extends ServiceImpl<CangkuDao, CangkuEntity> implements CangkuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CangkuEntity> page = this.selectPage(
                new Query<CangkuEntity>(params).getPage(),
                new EntityWrapper<CangkuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CangkuEntity> wrapper) {
		  Page<CangkuView> page =new Query<CangkuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CangkuVO> selectListVO(Wrapper<CangkuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CangkuVO selectVO(Wrapper<CangkuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CangkuView> selectListView(Wrapper<CangkuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CangkuView selectView(Wrapper<CangkuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
