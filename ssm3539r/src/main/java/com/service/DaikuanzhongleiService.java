package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DaikuanzhongleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DaikuanzhongleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DaikuanzhongleiView;


/**
 * 贷款种类
 *
 * @author 
 * @email 
 * @date 2023-02-28 16:44:52
 */
public interface DaikuanzhongleiService extends IService<DaikuanzhongleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DaikuanzhongleiVO> selectListVO(Wrapper<DaikuanzhongleiEntity> wrapper);
   	
   	DaikuanzhongleiVO selectVO(@Param("ew") Wrapper<DaikuanzhongleiEntity> wrapper);
   	
   	List<DaikuanzhongleiView> selectListView(Wrapper<DaikuanzhongleiEntity> wrapper);
   	
   	DaikuanzhongleiView selectView(@Param("ew") Wrapper<DaikuanzhongleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DaikuanzhongleiEntity> wrapper);
   	

}

