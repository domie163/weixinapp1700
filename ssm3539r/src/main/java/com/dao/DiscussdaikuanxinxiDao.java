package com.dao;

import com.entity.DiscussdaikuanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussdaikuanxinxiVO;
import com.entity.view.DiscussdaikuanxinxiView;


/**
 * 贷款信息评论表
 * 
 * @author 
 * @email 
 * @date 2023-02-28 16:44:53
 */
public interface DiscussdaikuanxinxiDao extends BaseMapper<DiscussdaikuanxinxiEntity> {
	
	List<DiscussdaikuanxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussdaikuanxinxiEntity> wrapper);
	
	DiscussdaikuanxinxiVO selectVO(@Param("ew") Wrapper<DiscussdaikuanxinxiEntity> wrapper);
	
	List<DiscussdaikuanxinxiView> selectListView(@Param("ew") Wrapper<DiscussdaikuanxinxiEntity> wrapper);

	List<DiscussdaikuanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussdaikuanxinxiEntity> wrapper);
	
	DiscussdaikuanxinxiView selectView(@Param("ew") Wrapper<DiscussdaikuanxinxiEntity> wrapper);
	

}
