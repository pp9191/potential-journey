package com.pp.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pp.entity.Blog;
import com.pp.service.BlogService;

@Controller
//@RequestMapping("")
public class HelloAction {

	@RequestMapping("/baidu")
	public String hello(){
		
		System.out.println("Hello World!");
		
		return "redirect:https://www.baidu.com";
	}
	
	@RequestMapping("/index")
	public String index() {

		System.out.println("index.jsp");
		
		return "WEB-INF/jsp/index.jsp";
	}
}
