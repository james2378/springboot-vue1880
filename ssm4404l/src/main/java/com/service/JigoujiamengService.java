package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JigoujiamengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JigoujiamengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JigoujiamengView;


/**
 * 机构加盟
 *
 * @author 
 * @email 
 * @date 2021-04-14 10:06:46
 */
public interface JigoujiamengService extends IService<JigoujiamengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JigoujiamengVO> selectListVO(Wrapper<JigoujiamengEntity> wrapper);
   	
   	JigoujiamengVO selectVO(@Param("ew") Wrapper<JigoujiamengEntity> wrapper);
   	
   	List<JigoujiamengView> selectListView(Wrapper<JigoujiamengEntity> wrapper);
   	
   	JigoujiamengView selectView(@Param("ew") Wrapper<JigoujiamengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JigoujiamengEntity> wrapper);
   	
}

