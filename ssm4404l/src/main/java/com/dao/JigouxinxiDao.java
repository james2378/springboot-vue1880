package com.dao;

import com.entity.JigouxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JigouxinxiVO;
import com.entity.view.JigouxinxiView;


/**
 * 机构信息
 * 
 * @author 
 * @email 
 * @date 2021-04-14 10:06:46
 */
public interface JigouxinxiDao extends BaseMapper<JigouxinxiEntity> {
	
	List<JigouxinxiVO> selectListVO(@Param("ew") Wrapper<JigouxinxiEntity> wrapper);
	
	JigouxinxiVO selectVO(@Param("ew") Wrapper<JigouxinxiEntity> wrapper);
	
	List<JigouxinxiView> selectListView(@Param("ew") Wrapper<JigouxinxiEntity> wrapper);

	List<JigouxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JigouxinxiEntity> wrapper);
	
	JigouxinxiView selectView(@Param("ew") Wrapper<JigouxinxiEntity> wrapper);
	
}
