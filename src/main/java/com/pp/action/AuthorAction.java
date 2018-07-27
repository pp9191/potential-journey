package com.pp.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pp.entity.Author;
import com.pp.service.AuthorService;

@Controller
@RequestMapping("author")
public class AuthorAction {

	@Resource(name="authorService")
	private AuthorService as;
	
	@RequestMapping("/log")
	public String log() {
		
		System.out.println("log");
		
		return "/WEB-INF/jsp/log.jsp";
	}
	
	@RequestMapping("/reg")
	public ModelAndView reg() {
		
		System.out.println("reg");
		ModelAndView mv =new ModelAndView("/WEB-INF/jsp/regAuthor.jsp");
		mv.addObject("author", new Author());
		
		return mv;
	}
	
	@RequestMapping("/show")
	public String show() {
		
		System.out.println("reg");
		
		return "/WEB-INF/jsp/showAuthor.jsp";
	}
	
	@RequestMapping("/regAuthor")
	public String regAuthor(@ModelAttribute @Validated Author author, BindingResult result) {
		
		System.out.println(author.getUsername());
		
		if(!result.hasErrors()) {
			if(as.regAuthor(author) > 0) {
				return "/WEB-INF/jsp/index.jsp";			
			}
		}
		System.out.println(false);
		return "/WEB-INF/jsp/regAuthor.jsp";
	}
}
