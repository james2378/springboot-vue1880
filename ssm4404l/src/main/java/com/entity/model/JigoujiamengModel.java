package com.entity.model;

import com.entity.JigoujiamengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 机构加盟
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-14 10:06:46
 */
public class JigoujiamengModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
