package com.entity.model;

import com.entity.JifenzengjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 积分增加
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-02-28 16:44:52
 */
public class JifenzengjiaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 积分
	 */
	
	private Integer jifen;
		
	/**
	 * 增加时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date zengjiashijian;
		
	/**
	 * 增加事由
	 */
	
	private String zengjiashiyou;
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：积分
	 */
	 
	public void setJifen(Integer jifen) {
		this.jifen = jifen;
	}
	
	/**
	 * 获取：积分
	 */
	public Integer getJifen() {
		return jifen;
	}
				
	
	/**
	 * 设置：增加时间
	 */
	 
	public void setZengjiashijian(Date zengjiashijian) {
		this.zengjiashijian = zengjiashijian;
	}
	
	/**
	 * 获取：增加时间
	 */
	public Date getZengjiashijian() {
		return zengjiashijian;
	}
				
	
	/**
	 * 设置：增加事由
	 */
	 
	public void setZengjiashiyou(String zengjiashiyou) {
		this.zengjiashiyou = zengjiashiyou;
	}
	
	/**
	 * 获取：增加事由
	 */
	public String getZengjiashiyou() {
		return zengjiashiyou;
	}
			
}
