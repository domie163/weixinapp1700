package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 积分增加
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-02-28 16:44:52
 */
@TableName("jifenzengjia")
public class JifenzengjiaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JifenzengjiaEntity() {
		
	}
	
	public JifenzengjiaEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
