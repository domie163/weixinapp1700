package com.entity.view;

import com.entity.DiscussdaikuanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 贷款信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-28 16:44:53
 */
@TableName("discussdaikuanxinxi")
public class DiscussdaikuanxinxiView  extends DiscussdaikuanxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussdaikuanxinxiView(){
	}
 
 	public DiscussdaikuanxinxiView(DiscussdaikuanxinxiEntity discussdaikuanxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussdaikuanxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
