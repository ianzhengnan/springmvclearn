package com.ian.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

//import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.ian.springmvc.model.Book;

@Controller
@RequestMapping("/json")
public class BookController {

	@RequestMapping(value="/testRequestBody")
	public void setJson(@RequestBody Book book, HttpServletResponse response) throws Exception{
		
		book.setAuthor("郑楠");
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().println(JSONObject.toJSONString(book));
	}
	
	@RequestMapping(value="/getRequestBody")
	@ResponseBody
	public Object getJson(){
		List<Book> books = new ArrayList<Book>();
		books.add(new Book(1,"Spring MVC 企业应用实战", "肖文吉"));
		books.add(new Book(2,"疯狂JAVA讲义", "李刚"));
		return books;
	}
	
}
