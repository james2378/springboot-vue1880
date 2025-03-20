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
 * 机构加盟
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-14 10:06:46
 */
@TableName("jigoujiameng")
public class JigoujiamengEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JigoujiamengEntity() {
		
	}
	
	public JigoujiamengEntity(T t) {
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
	 * 加盟费
	 */
					
	private Integer jiamengfei;
	
	/**
	 * 加盟内容
	 */
					
	private String jiamengneirong;
	
	/**
	 * 加盟日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date jiamengriqi;
	
	/**
	 * 工号
	 */
					
	private String gonghao;
	
	/**
	 * 教师姓名
	 */
					
	private String jiaoshixingming;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	
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
	 * 设置：加盟内容
	 */
	public void setJiamengneirong(String jiamengneirong) {
		this.jiamengneirong = jiamengneirong;
	}
	/**
	 * 获取：加盟内容
	 */
	public String getJiamengneirong() {
		return jiamengneirong;
	}
	/**
	 * 设置：加盟日期
	 */
	public void setJiamengriqi(Date jiamengriqi) {
		this.jiamengriqi = jiamengriqi;
	}
	/**
	 * 获取：加盟日期
	 */
	public Date getJiamengriqi() {
		return jiamengriqi;
	}
	/**
	 * 设置：工号
	 */
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
	/**
	 * 设置：教师姓名
	 */
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}
