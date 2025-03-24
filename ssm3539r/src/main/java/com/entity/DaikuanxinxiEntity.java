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
 * 贷款信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-02-28 16:44:52
 */
@TableName("daikuanxinxi")
public class DaikuanxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DaikuanxinxiEntity() {
		
	}
	
	public DaikuanxinxiEntity(T t) {
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
	 * 贷款名称
	 */
					
	private String daikuanmingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date faburiqi;
	
	
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
	 * 设置：贷款名称
	 */
	public void setDaikuanmingcheng(String daikuanmingcheng) {
		this.daikuanmingcheng = daikuanmingcheng;
	}
	/**
	 * 获取：贷款名称
	 */
	public String getDaikuanmingcheng() {
		return daikuanmingcheng;
	}
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
