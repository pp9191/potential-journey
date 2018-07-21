package com.pp.dao;

import com.pp.entity.Author;
import com.pp.entity.Blog;

public interface BlogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Blog record);

    int insertSelective(Blog record);

    Blog selectByPrimaryKey(Integer id);
    
    Author selectAuthorByKey(Integer authorid);

    int updateByPrimaryKeySelective(Blog record);

    int updateByPrimaryKey(Blog record);
}