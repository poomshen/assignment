package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


/*
<a href="search/internal.do?query=kglim&p=100">internal.do</a>

Default :<a href="search/external.do?query=kglim">external.do</a>

Default2 :<a href="search/external.do?p=100">external.do</a>

required :<a href="search/external.do">external.do</a> 
*/

@Controller
public class SearchController {

	@RequestMapping("/search/internal.do") //?query=kglim&p=100"
	public ModelAndView SearchInternal(@RequestParam("query") String query,
									   @RequestParam("p") int pagenumber)
	{
		System.out.println("paramter value(query) : " + query);
		System.out.println("paramter value(p) : " + pagenumber);
		return new ModelAndView("search/internal");
	}
	
	//문제점 
	//1. parameter 값이 없는 경우..
	//2. parameter 값이 없는 경우 기본값 가지면..
	//옵션 : required=false
	//옵션 : defaultValue="1"
	
	
	// search/external.do?query=kglim   >  Test_1
	
	// search/external.do?p=100         >  Test_2
	
	// search/external.do               >  Test_3
	
	//만약  required=true 값인 경우 ?query=aa 오지않으면
	//error :  Required String parameter 'query' is not present
	/*
	실습 -1
	@RequestMapping("/search/external.do")
	public ModelAndView searchExternal(
			@RequestParam(value="query" , required=false) String query,
			@RequestParam(value="p" , defaultValue="1") int pagenumber
			)
	{
		System.out.println("paramter value option(query) : " + query);
		System.out.println("paramter value option(p) : " + pagenumber);
		return new ModelAndView("search/external");
	}
	
	*/
	/*
	실습 -2
	@RequestMapping("/search/external.do")
	public ModelAndView searchExternal(
			@RequestParam(value="query" ,defaultValue="title") String query,
			@RequestParam(value="p" , required=false , defaultValue="10") int pagenumber
			)
	{
		System.out.println("paramter value option(query) : " + query);
		System.out.println("paramter value option(p) : " + pagenumber);
		return new ModelAndView("search/external");
	}
	
	*/
	//제일 간단한 방법 
	//규칙 : paramter 이름 == 함수 paramter 이름을 동일하게
	//search/external.do?query=kglim&q=100
	@RequestMapping("/search/external.do")
	public ModelAndView searchExternal(String query , String p)
	{
		System.out.println("paramter value option(query) : " + query);
		System.out.println("paramter value option(p) : " + p);
		return new ModelAndView("search/external");
	}
}
