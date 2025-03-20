package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JigouxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JigouxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JigouxinxiView;


/**
 * 机构信息
 *
 * @author 
 * @email 
 * @date 2021-04-14 10:06:46
 */
public interface JigouxinxiService extends IService<JigouxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JigouxinxiVO> selectListVO(Wrapper<JigouxinxiEntity> wrapper);
   	
   	JigouxinxiVO selectVO(@Param("ew") Wrapper<JigouxinxiEntity> wrapper);
   	
   	List<JigouxinxiView> selectListView(Wrapper<JigouxinxiEntity> wrapper);
   	
   	JigouxinxiView selectView(@Param("ew") Wrapper<JigouxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JigouxinxiEntity> wrapper);
   	
}

