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


import com.dao.DaibanshenqingDao;
import com.entity.DaibanshenqingEntity;
import com.service.DaibanshenqingService;
import com.entity.vo.DaibanshenqingVO;
import com.entity.view.DaibanshenqingView;

@Service("daibanshenqingService")
public class DaibanshenqingServiceImpl extends ServiceImpl<DaibanshenqingDao, DaibanshenqingEntity> implements DaibanshenqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DaibanshenqingEntity> page = this.selectPage(
                new Query<DaibanshenqingEntity>(params).getPage(),
                new EntityWrapper<DaibanshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DaibanshenqingEntity> wrapper) {
		  Page<DaibanshenqingView> page =new Query<DaibanshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DaibanshenqingVO> selectListVO(Wrapper<DaibanshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DaibanshenqingVO selectVO(Wrapper<DaibanshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DaibanshenqingView> selectListView(Wrapper<DaibanshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DaibanshenqingView selectView(Wrapper<DaibanshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
