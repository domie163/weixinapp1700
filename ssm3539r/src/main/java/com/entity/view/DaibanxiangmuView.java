package com.entity.view;

import com.entity.DaibanxiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 代办项目
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-28 16:44:52
 */
@TableName("daibanxiangmu")
public class DaibanxiangmuView  extends DaibanxiangmuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DaibanxiangmuView(){
	}
 
 	public DaibanxiangmuView(DaibanxiangmuEntity daibanxiangmuEntity){
 	try {
			BeanUtils.copyProperties(this, daibanxiangmuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
