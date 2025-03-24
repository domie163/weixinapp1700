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


import com.dao.DiscussdaikuanxinxiDao;
import com.entity.DiscussdaikuanxinxiEntity;
import com.service.DiscussdaikuanxinxiService;
import com.entity.vo.DiscussdaikuanxinxiVO;
import com.entity.view.DiscussdaikuanxinxiView;

@Service("discussdaikuanxinxiService")
public class DiscussdaikuanxinxiServiceImpl extends ServiceImpl<DiscussdaikuanxinxiDao, DiscussdaikuanxinxiEntity> implements DiscussdaikuanxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussdaikuanxinxiEntity> page = this.selectPage(
                new Query<DiscussdaikuanxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussdaikuanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussdaikuanxinxiEntity> wrapper) {
		  Page<DiscussdaikuanxinxiView> page =new Query<DiscussdaikuanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussdaikuanxinxiVO> selectListVO(Wrapper<DiscussdaikuanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussdaikuanxinxiVO selectVO(Wrapper<DiscussdaikuanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussdaikuanxinxiView> selectListView(Wrapper<DiscussdaikuanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussdaikuanxinxiView selectView(Wrapper<DiscussdaikuanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
