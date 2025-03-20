package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JigoujiamengDao;
import com.entity.JigoujiamengEntity;
import com.service.JigoujiamengService;
import com.entity.vo.JigoujiamengVO;
import com.entity.view.JigoujiamengView;

@Service("jigoujiamengService")
public class JigoujiamengServiceImpl extends ServiceImpl<JigoujiamengDao, JigoujiamengEntity> implements JigoujiamengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JigoujiamengEntity> page = this.selectPage(
                new Query<JigoujiamengEntity>(params).getPage(),
                new EntityWrapper<JigoujiamengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JigoujiamengEntity> wrapper) {
		  Page<JigoujiamengView> page =new Query<JigoujiamengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JigoujiamengVO> selectListVO(Wrapper<JigoujiamengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JigoujiamengVO selectVO(Wrapper<JigoujiamengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JigoujiamengView> selectListView(Wrapper<JigoujiamengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JigoujiamengView selectView(Wrapper<JigoujiamengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
