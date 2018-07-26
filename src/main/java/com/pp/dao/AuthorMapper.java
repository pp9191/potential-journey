package com.pp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pp.entity.Author;

public interface AuthorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Author record);

    int insertSelective(Author record);

    Author selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Author record);

    int updateByPrimaryKey(Author record);

	List<Author> selectAll();

	Author selectAuthor(@Param("username") String name, @Param("password") String password);
}