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


import com.dao.JijiandingdanDao;
import com.entity.JijiandingdanEntity;
import com.service.JijiandingdanService;
import com.entity.vo.JijiandingdanVO;
import com.entity.view.JijiandingdanView;

@Service("jijiandingdanService")
public class JijiandingdanServiceImpl extends ServiceImpl<JijiandingdanDao, JijiandingdanEntity> implements JijiandingdanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JijiandingdanEntity> page = this.selectPage(
                new Query<JijiandingdanEntity>(params).getPage(),
                new EntityWrapper<JijiandingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JijiandingdanEntity> wrapper) {
		  Page<JijiandingdanView> page =new Query<JijiandingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JijiandingdanVO> selectListVO(Wrapper<JijiandingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JijiandingdanVO selectVO(Wrapper<JijiandingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JijiandingdanView> selectListView(Wrapper<JijiandingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JijiandingdanView selectView(Wrapper<JijiandingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
