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
 * 机构信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-14 10:06:46
 */
@TableName("jigouxinxi")
public class JigouxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JigouxinxiEntity() {
		
	}
	
	public JigouxinxiEntity(T t) {
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
	 * 机构名称
	 */
					
	private String jigoumingcheng;
	
	/**
	 * 机构规模
	 */
					
	private String jigouguimo;
	
	/**
	 * 机构图片
	 */
					
	private String jigoutupian;
	
	/**
	 * 加盟费
	 */
					
	private Integer jiamengfei;
	
	/**
	 * 清单
	 */
					
	private String qingdan;
	
	/**
	 * 联系人
	 */
					
	private String lianxiren;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 机构介绍
	 */
					
	private String jigoujieshao;
	
	
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
	 * 设置：机构名称
	 */
	public void setJigoumingcheng(String jigoumingcheng) {
		this.jigoumingcheng = jigoumingcheng;
	}
	/**
	 * 获取：机构名称
	 */
	public String getJigoumingcheng() {
		return jigoumingcheng;
	}
	/**
	 * 设置：机构规模
	 */
	public void setJigouguimo(String jigouguimo) {
		this.jigouguimo = jigouguimo;
	}
	/**
	 * 获取：机构规模
	 */
	public String getJigouguimo() {
		return jigouguimo;
	}
	/**
	 * 设置：机构图片
	 */
	public void setJigoutupian(String jigoutupian) {
		this.jigoutupian = jigoutupian;
	}
	/**
	 * 获取：机构图片
	 */
	public String getJigoutupian() {
		return jigoutupian;
	}
	/**
	 * 设置：加盟费
	 */
	public void setJiamengfei(Integer jiamengfei) {
		this.jiamengfei = jiamengfei;
	}
	/**
	 * 获取：加盟费
	 */
	public Integer getJiamengfei() {
		return jiamengfei;
	}
	/**
	 * 设置：清单
	 */
	public void setQingdan(String qingdan) {
		this.qingdan = qingdan;
	}
	/**
	 * 获取：清单
	 */
	public String getQingdan() {
		return qingdan;
	}
	/**
	 * 设置：联系人
	 */
	public void setLianxiren(String lianxiren) {
		this.lianxiren = lianxiren;
	}
	/**
	 * 获取：联系人
	 */
	public String getLianxiren() {
		return lianxiren;
	}
	/**
	 * 设置：联系电话
	 */
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
	/**
	 * 设置：机构介绍
	 */
	public void setJigoujieshao(String jigoujieshao) {
		this.jigoujieshao = jigoujieshao;
	}
	/**
	 * 获取：机构介绍
	 */
	public String getJigoujieshao() {
		return jigoujieshao;
	}

}
