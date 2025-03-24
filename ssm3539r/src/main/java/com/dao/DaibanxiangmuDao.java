package com.dao;

import com.entity.DaibanxiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DaibanxiangmuVO;
import com.entity.view.DaibanxiangmuView;


/**
 * 代办项目
 * 
 * @author 
 * @email 
 * @date 2023-02-28 16:44:52
 */
public interface DaibanxiangmuDao extends BaseMapper<DaibanxiangmuEntity> {
	
	List<DaibanxiangmuVO> selectListVO(@Param("ew") Wrapper<DaibanxiangmuEntity> wrapper);
	
	DaibanxiangmuVO selectVO(@Param("ew") Wrapper<DaibanxiangmuEntity> wrapper);
	
	List<DaibanxiangmuView> selectListView(@Param("ew") Wrapper<DaibanxiangmuEntity> wrapper);

	List<DaibanxiangmuView> selectListView(Pagination page,@Param("ew") Wrapper<DaibanxiangmuEntity> wrapper);
	
	DaibanxiangmuView selectView(@Param("ew") Wrapper<DaibanxiangmuEntity> wrapper);
	

}
