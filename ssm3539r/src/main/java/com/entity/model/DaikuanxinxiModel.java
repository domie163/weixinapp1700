package com.entity.model;

import com.entity.DaikuanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 贷款信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-02-28 16:44:52
 */
public class DaikuanxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 贷款种类
	 */
	
	private String daikuanzhonglei;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 可贷金额
	 */
	
	private Integer kedaijine;
		
	/**
	 * 贷款条件
	 */
	
	private String daikuantiaojian;
		
	/**
	 * 还款期限
	 */
	
	private String haikuanqixian;
		
	/**
	 * 详细介绍
	 */
	
	private String xiangxijieshao;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
				
	
	/**
	 * 设置：贷款种类
	 */
	 
	public void setDaikuanzhonglei(String daikuanzhonglei) {
		this.daikuanzhonglei = daikuanzhonglei;
	}
	
	/**
	 * 获取：贷款种类
	 */
	public String getDaikuanzhonglei() {
		return daikuanzhonglei;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：可贷金额
	 */
	 
	public void setKedaijine(Integer kedaijine) {
		this.kedaijine = kedaijine;
	}
	
	/**
	 * 获取：可贷金额
	 */
	public Integer getKedaijine() {
		return kedaijine;
	}
				
	
	/**
	 * 设置：贷款条件
	 */
	 
	public void setDaikuantiaojian(String daikuantiaojian) {
		this.daikuantiaojian = daikuantiaojian;
	}
	
	/**
	 * 获取：贷款条件
	 */
	public String getDaikuantiaojian() {
		return daikuantiaojian;
	}
				
	
	/**
	 * 设置：还款期限
	 */
	 
	public void setHaikuanqixian(String haikuanqixian) {
		this.haikuanqixian = haikuanqixian;
	}
	
	/**
	 * 获取：还款期限
	 */
	public String getHaikuanqixian() {
		return haikuanqixian;
	}
				
	
	/**
	 * 设置：详细介绍
	 */
	 
	public void setXiangxijieshao(String xiangxijieshao) {
		this.xiangxijieshao = xiangxijieshao;
	}
	
	/**
	 * 获取：详细介绍
	 */
	public String getXiangxijieshao() {
		return xiangxijieshao;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
			
}
