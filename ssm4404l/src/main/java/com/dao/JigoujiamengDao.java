package com.dao;

import com.entity.JigoujiamengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JigoujiamengVO;
import com.entity.view.JigoujiamengView;


/**
 * 机构加盟
 * 
 * @author 
 * @email 
 * @date 2021-04-14 10:06:46
 */
public interface JigoujiamengDao extends BaseMapper<JigoujiamengEntity> {
	
	List<JigoujiamengVO> selectListVO(@Param("ew") Wrapper<JigoujiamengEntity> wrapper);
	
	JigoujiamengVO selectVO(@Param("ew") Wrapper<JigoujiamengEntity> wrapper);
	
	List<JigoujiamengView> selectListView(@Param("ew") Wrapper<JigoujiamengEntity> wrapper);

	List<JigoujiamengView> selectListView(Pagination page,@Param("ew") Wrapper<JigoujiamengEntity> wrapper);
	
	JigoujiamengView selectView(@Param("ew") Wrapper<JigoujiamengEntity> wrapper);
	
}
