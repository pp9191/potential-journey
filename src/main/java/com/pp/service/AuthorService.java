package com.pp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pp.dao.AuthorMapper;
import com.pp.entity.Author;

@Service("authorService")
public class AuthorService {

	@Autowired
	private AuthorMapper am;
	
	public Author getAuthorByKey(int id) {
		
		return am.selectByPrimaryKey(id);
	}
	
	public List<Author> getAllAuthor(){
		
		return am.selectAll();
	}
	
	public int regAuthor(Author author) {
		
		return am.insertSelective(author);
	}
}
