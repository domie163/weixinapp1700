package com.entity.vo;

import com.entity.DaikuanshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 贷款申请
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-02-28 16:44:52
 */
public class DaikuanshenqingVO  implements Serializable {
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
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 用户手机
	 */
	
	private String yonghushouji;
		
	/**
	 * 身份证
	 */
	
	private String shenfenzheng;
		
	/**
	 * 贷款金额
	 */
	
	private Float daikuanjine;
		
	/**
	 * 贷款时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date daikuanshijian;
		
	/**
	 * 贷款说明
	 */
	
	private String daikuanshuoming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
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
	 * 设置：用户手机
	 */
	 
	public void setYonghushouji(String yonghushouji) {
		this.yonghushouji = yonghushouji;
	}
	
	/**
	 * 获取：用户手机
	 */
	public String getYonghushouji() {
		return yonghushouji;
	}
				
	
	/**
	 * 设置：身份证
	 */
	 
	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}
	
	/**
	 * 获取：身份证
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
	}
				
	
	/**
	 * 设置：贷款金额
	 */
	 
	public void setDaikuanjine(Float daikuanjine) {
		this.daikuanjine = daikuanjine;
	}
	
	/**
	 * 获取：贷款金额
	 */
	public Float getDaikuanjine() {
		return daikuanjine;
	}
				
	
	/**
	 * 设置：贷款时间
	 */
	 
	public void setDaikuanshijian(Date daikuanshijian) {
		this.daikuanshijian = daikuanshijian;
	}
	
	/**
	 * 获取：贷款时间
	 */
	public Date getDaikuanshijian() {
		return daikuanshijian;
	}
				
	
	/**
	 * 设置：贷款说明
	 */
	 
	public void setDaikuanshuoming(String daikuanshuoming) {
		this.daikuanshuoming = daikuanshuoming;
	}
	
	/**
	 * 获取：贷款说明
	 */
	public String getDaikuanshuoming() {
		return daikuanshuoming;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
