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


import com.dao.JiesuanDao;
import com.entity.JiesuanEntity;
import com.service.JiesuanService;
import com.entity.vo.JiesuanVO;
import com.entity.view.JiesuanView;

@Service("jiesuanService")
public class JiesuanServiceImpl extends ServiceImpl<JiesuanDao, JiesuanEntity> implements JiesuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiesuanEntity> page = this.selectPage(
                new Query<JiesuanEntity>(params).getPage(),
                new EntityWrapper<JiesuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiesuanEntity> wrapper) {
		  Page<JiesuanView> page =new Query<JiesuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiesuanVO> selectListVO(Wrapper<JiesuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiesuanVO selectVO(Wrapper<JiesuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiesuanView> selectListView(Wrapper<JiesuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiesuanView selectView(Wrapper<JiesuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
