package com.dao;

import com.entity.DaibanshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DaibanshenqingVO;
import com.entity.view.DaibanshenqingView;


/**
 * 代办申请
 * 
 * @author 
 * @email 
 * @date 2023-02-28 16:44:52
 */
public interface DaibanshenqingDao extends BaseMapper<DaibanshenqingEntity> {
	
	List<DaibanshenqingVO> selectListVO(@Param("ew") Wrapper<DaibanshenqingEntity> wrapper);
	
	DaibanshenqingVO selectVO(@Param("ew") Wrapper<DaibanshenqingEntity> wrapper);
	
	List<DaibanshenqingView> selectListView(@Param("ew") Wrapper<DaibanshenqingEntity> wrapper);

	List<DaibanshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<DaibanshenqingEntity> wrapper);
	
	DaibanshenqingView selectView(@Param("ew") Wrapper<DaibanshenqingEntity> wrapper);
	

}
