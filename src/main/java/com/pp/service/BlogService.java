package com.pp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pp.dao.BlogMapper;
import com.pp.entity.Blog;

@Service("blogService")
public class BlogService {

	@Autowired
	private BlogMapper bm;
	
	public Blog getBlogByKey(int id) {
		
		return bm.selectByPrimaryKey(id);
	}
}
