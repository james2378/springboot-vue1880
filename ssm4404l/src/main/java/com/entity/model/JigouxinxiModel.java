package com.entity.model;

import com.entity.JigouxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 机构信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-14 10:06:46
 */
public class JigouxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
