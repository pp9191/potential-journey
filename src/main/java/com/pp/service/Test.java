package com.pp.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;
import com.pp.entity.Author;
import com.pp.entity.Blog;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		getAuthor(ac);
	}

	private static void getAuthor(ApplicationContext ac) {
		AuthorService as = (AuthorService) ac.getBean("authorService");
		
		Author author = new Author("xiaoming", "xiaoming"); 
		as.regAuthor(author);
		author = new Author("xiaohong", "xiaoming"); 
		as.regAuthor(author);
		
		List<Author> alist = as.getAllAuthor();
		
		System.out.println(JSON.toJSONString(alist));
	}

	private static void getBlog(ApplicationContext ac) {
		BlogService bs = (BlogService) ac.getBean("blogService");		
		Blog b = bs.getBlogByKey(1);
		Author a = b.getAuthor();
		System.out.println(b.getContent());
		System.out.println(a.getUsername());
	}

}
