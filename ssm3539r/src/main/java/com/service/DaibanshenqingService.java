package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DaibanshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DaibanshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DaibanshenqingView;


/**
 * 代办申请
 *
 * @author 
 * @email 
 * @date 2023-02-28 16:44:52
 */
public interface DaibanshenqingService extends IService<DaibanshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DaibanshenqingVO> selectListVO(Wrapper<DaibanshenqingEntity> wrapper);
   	
   	DaibanshenqingVO selectVO(@Param("ew") Wrapper<DaibanshenqingEntity> wrapper);
   	
   	List<DaibanshenqingView> selectListView(Wrapper<DaibanshenqingEntity> wrapper);
   	
   	DaibanshenqingView selectView(@Param("ew") Wrapper<DaibanshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DaibanshenqingEntity> wrapper);
   	

}

