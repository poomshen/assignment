package com.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CookieController {

	//코드에서 HttpServletResponse , HttpServletRequest 필요하다면
	//함수의 paramter 구현하시고 사용
	//make(HttpServletResponse response)
	
	@RequestMapping("/cookie/make.do")
	public String make(HttpServletResponse response){
		response.addCookie(new Cookie("auth", "1004"));
		return "cookie/CookieMake"; //cookie/CookieMake.jsp
	}	
	
	@RequestMapping("/cookie/view.do")
	public String view(@CookieValue(value="auth",defaultValue="0") String authcookie){
		System.out.println("클라이언트에서 Read 쿠키값 : " + authcookie);
		return "cookie/CookieView";
	}
	
}
