package com.pp.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pp.entity.Author;
import com.pp.service.AuthorService;

@Controller
@RequestMapping("author")
public class AuthorAction {

	@Resource(name="authorService")
	private AuthorService as;
	
	@RequestMapping("/reg")
	public String reg() {
		
		System.out.println("reg");
		
		return "/WEB-INF/jsp/regAuthor.jsp";
	}
	
	@RequestMapping("/regAuthor")
	public String regAuthor(@ModelAttribute @Validated Author author, BindingResult result) {
		
		System.out.println(author.getUsername());
		
		if(result.hasErrors()) {
			System.out.println(false);
			return "/WEB-INF/jsp/regAuthor.jsp";
		}		
		
		return "/WEB-INF/jsp/index.jsp";
	}
	
}
