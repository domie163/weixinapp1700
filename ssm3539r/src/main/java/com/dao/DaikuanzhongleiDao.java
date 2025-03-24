package com.dao;

import com.entity.DaikuanzhongleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DaikuanzhongleiVO;
import com.entity.view.DaikuanzhongleiView;


/**
 * 贷款种类
 * 
 * @author 
 * @email 
 * @date 2023-02-28 16:44:52
 */
public interface DaikuanzhongleiDao extends BaseMapper<DaikuanzhongleiEntity> {
	
	List<DaikuanzhongleiVO> selectListVO(@Param("ew") Wrapper<DaikuanzhongleiEntity> wrapper);
	
	DaikuanzhongleiVO selectVO(@Param("ew") Wrapper<DaikuanzhongleiEntity> wrapper);
	
	List<DaikuanzhongleiView> selectListView(@Param("ew") Wrapper<DaikuanzhongleiEntity> wrapper);

	List<DaikuanzhongleiView> selectListView(Pagination page,@Param("ew") Wrapper<DaikuanzhongleiEntity> wrapper);
	
	DaikuanzhongleiView selectView(@Param("ew") Wrapper<DaikuanzhongleiEntity> wrapper);
	

}
