package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussdaikuanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussdaikuanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussdaikuanxinxiView;


/**
 * 贷款信息评论表
 *
 * @author 
 * @email 
 * @date 2023-02-28 16:44:53
 */
public interface DiscussdaikuanxinxiService extends IService<DiscussdaikuanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussdaikuanxinxiVO> selectListVO(Wrapper<DiscussdaikuanxinxiEntity> wrapper);
   	
   	DiscussdaikuanxinxiVO selectVO(@Param("ew") Wrapper<DiscussdaikuanxinxiEntity> wrapper);
   	
   	List<DiscussdaikuanxinxiView> selectListView(Wrapper<DiscussdaikuanxinxiEntity> wrapper);
   	
   	DiscussdaikuanxinxiView selectView(@Param("ew") Wrapper<DiscussdaikuanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussdaikuanxinxiEntity> wrapper);
   	

}

