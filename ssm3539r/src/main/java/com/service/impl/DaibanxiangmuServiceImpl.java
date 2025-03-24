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


import com.dao.DaibanxiangmuDao;
import com.entity.DaibanxiangmuEntity;
import com.service.DaibanxiangmuService;
import com.entity.vo.DaibanxiangmuVO;
import com.entity.view.DaibanxiangmuView;

@Service("daibanxiangmuService")
public class DaibanxiangmuServiceImpl extends ServiceImpl<DaibanxiangmuDao, DaibanxiangmuEntity> implements DaibanxiangmuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DaibanxiangmuEntity> page = this.selectPage(
                new Query<DaibanxiangmuEntity>(params).getPage(),
                new EntityWrapper<DaibanxiangmuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DaibanxiangmuEntity> wrapper) {
		  Page<DaibanxiangmuView> page =new Query<DaibanxiangmuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DaibanxiangmuVO> selectListVO(Wrapper<DaibanxiangmuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DaibanxiangmuVO selectVO(Wrapper<DaibanxiangmuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DaibanxiangmuView> selectListView(Wrapper<DaibanxiangmuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DaibanxiangmuView selectView(Wrapper<DaibanxiangmuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
