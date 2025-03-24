package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DaibanxiangmuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DaibanxiangmuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DaibanxiangmuView;


/**
 * 代办项目
 *
 * @author 
 * @email 
 * @date 2023-02-28 16:44:52
 */
public interface DaibanxiangmuService extends IService<DaibanxiangmuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DaibanxiangmuVO> selectListVO(Wrapper<DaibanxiangmuEntity> wrapper);
   	
   	DaibanxiangmuVO selectVO(@Param("ew") Wrapper<DaibanxiangmuEntity> wrapper);
   	
   	List<DaibanxiangmuView> selectListView(Wrapper<DaibanxiangmuEntity> wrapper);
   	
   	DaibanxiangmuView selectView(@Param("ew") Wrapper<DaibanxiangmuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DaibanxiangmuEntity> wrapper);
   	

}

