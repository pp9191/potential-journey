package com.pp.action;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.pp.entity.Author;
import com.pp.service.AuthorService;

@Controller
@RequestMapping("author")
public class AuthorAction {

	@Resource(name="authorService")
	private AuthorService as;
	
	@RequestMapping("/log")
	public ModelAndView log() {
		
		System.out.println("log");
		ModelAndView mv =new ModelAndView("/WEB-INF/jsp/log.jsp");
		mv.addObject("author", new Author());
		
		return mv;
	}
	
	@RequestMapping("/logAuthor")
	public String logAuthor(@ModelAttribute @Validated Author author, BindingResult result, HttpSession session) {
		
		System.out.println(author.getUsername() + "|" + author.getPassword());
		
		if(!result.hasErrors()) {
			Author au = as.getAuthor(author);
			if(au != null) {
				session.setAttribute("author", au);
				return "/WEB-INF/jsp/index.jsp";			
			}else {
				FieldError error = new FieldError("auhtor", "username", "用户名或密码错误");
				result.addError(error);
			}
		}
		System.out.println(false);
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
	public String show(HttpSession session) {
		
		System.out.println("show");
		if(session.getAttribute("author")!=null) {		
			return "/WEB-INF/jsp/showAuthor.jsp";
		}
		return "/WEB-INF/jsp/index.jsp";
	}
	
	@RequestMapping("/getAuthorPageList")
	public void getAuthorPageList(@RequestParam int rows, @RequestParam int page, HttpServletResponse resp) {
		//rows:pageSize,page:pageIndex		
		System.out.println(rows + "||" + page);
		
		Map<String,Object> map = new HashMap<>();
		int total = as.getAllCount();
		map.put("total", total);//总条数
		map.put("page", page);//当前页
		
		if(page > 0 && page <= (total - 1)/rows + 1) {
			int start = rows * (page-1);
			int end = rows * page >= total ? total : rows * page;
			
			List<Author> list = as.getAllAuthor(start, end);
			map.put("rows", list);//数据
			map.put("records", list.size());//数据条数
		}
		String jsonStr = JSON.toJSONStringWithDateFormat(map, "yyyy-MM-dd");
		System.out.println(jsonStr);
		try {
			resp.getWriter().write(jsonStr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping("/regAuthor")
	public String regAuthor(@ModelAttribute @Validated Author author, BindingResult result, HttpSession session) {
		
		System.out.println(JSON.toJSONString(author));
		
		if(!result.hasErrors()) {
			if(as.regAuthor(author) > 0) {
				//session.setAttribute("author", author);
				return "/WEB-INF/jsp/index.jsp";			
			}
		}
		System.out.println(false);
		return "/WEB-INF/jsp/regAuthor.jsp";
	}
}
