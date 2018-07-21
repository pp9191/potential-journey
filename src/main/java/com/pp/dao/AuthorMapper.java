package com.pp.dao;

import java.util.List;

import com.pp.entity.Author;

public interface AuthorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Author record);

    int insertSelective(Author record);

    Author selectByPrimaryKey(Integer id);
    
    List<Author> selectAll();

    int updateByPrimaryKeySelective(Author record);

    int updateByPrimaryKey(Author record);
}