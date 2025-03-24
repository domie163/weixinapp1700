package com.entity.view;

import com.entity.DaikuanzhongleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 贷款种类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-28 16:44:52
 */
@TableName("daikuanzhonglei")
public class DaikuanzhongleiView  extends DaikuanzhongleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DaikuanzhongleiView(){
	}
 
 	public DaikuanzhongleiView(DaikuanzhongleiEntity daikuanzhongleiEntity){
 	try {
			BeanUtils.copyProperties(this, daikuanzhongleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
