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


import com.dao.DaikuanzhongleiDao;
import com.entity.DaikuanzhongleiEntity;
import com.service.DaikuanzhongleiService;
import com.entity.vo.DaikuanzhongleiVO;
import com.entity.view.DaikuanzhongleiView;

@Service("daikuanzhongleiService")
public class DaikuanzhongleiServiceImpl extends ServiceImpl<DaikuanzhongleiDao, DaikuanzhongleiEntity> implements DaikuanzhongleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DaikuanzhongleiEntity> page = this.selectPage(
                new Query<DaikuanzhongleiEntity>(params).getPage(),
                new EntityWrapper<DaikuanzhongleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DaikuanzhongleiEntity> wrapper) {
		  Page<DaikuanzhongleiView> page =new Query<DaikuanzhongleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DaikuanzhongleiVO> selectListVO(Wrapper<DaikuanzhongleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DaikuanzhongleiVO selectVO(Wrapper<DaikuanzhongleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DaikuanzhongleiView> selectListView(Wrapper<DaikuanzhongleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DaikuanzhongleiView selectView(Wrapper<DaikuanzhongleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
