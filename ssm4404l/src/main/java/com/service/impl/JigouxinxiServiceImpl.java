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


import com.dao.JigouxinxiDao;
import com.entity.JigouxinxiEntity;
import com.service.JigouxinxiService;
import com.entity.vo.JigouxinxiVO;
import com.entity.view.JigouxinxiView;

@Service("jigouxinxiService")
public class JigouxinxiServiceImpl extends ServiceImpl<JigouxinxiDao, JigouxinxiEntity> implements JigouxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JigouxinxiEntity> page = this.selectPage(
                new Query<JigouxinxiEntity>(params).getPage(),
                new EntityWrapper<JigouxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JigouxinxiEntity> wrapper) {
		  Page<JigouxinxiView> page =new Query<JigouxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JigouxinxiVO> selectListVO(Wrapper<JigouxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JigouxinxiVO selectVO(Wrapper<JigouxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JigouxinxiView> selectListView(Wrapper<JigouxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JigouxinxiView selectView(Wrapper<JigouxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
