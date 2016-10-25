package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.NewArticleCommand;
import com.model.SearchType;

/*
@ModelAttribute 사용법 정리
1. public String submit(@ModelAttribute("Articledata")NewArticleCommand command){}
   -> @ModelAttribute 생략 : NewArticleCommand newArticleCommand = new NewArticleCommand();
   -> @ModelAttribute("Articledata") : NewArticleCommand Articledata = new NewArticleCommand();


2. @ModelAttribute : 함수를 객체화 시킬수 있다 (함수 위에 선언)
   
   @Controller
   class Test{
   
    @ModelAttribute("obj")
   	public List<SearchType> method(){}
   }
   
   obj 객체가 만들어지고 [View] 단에서 obj 라는 객체이름으로 사용가능
   
   이런 방법을 언제 , 어떻게 쓰면 좋을까
   >> 공통사용 메뉴구성 , 미리  UI 구성 (코드형 데이터)
*/


@Controller
public class CodeSearchController {

	@ModelAttribute("SearchTypelist")
	public List<SearchType> SearchTypeList(){
		List<SearchType> options = new ArrayList<SearchType>();
		options.add(new SearchType(1, "전체"));
		options.add(new SearchType(2, "LOL"));
		options.add(new SearchType(3, "STAR"));
		options.add(new SearchType(4, "WAR"));
		options.add(new SearchType(5, "CITY"));
		System.out.println("SearchTypeList 함수 실행");
		return options;
	}
	
	@ModelAttribute("querylist")
	public String[] getQueryList(){
		System.out.println("getQueryList 함수 실행");
		return  new String[]{"게임","star","city","world"};
	}
	
	@RequestMapping("/search/main.do")
	public String main(){
		return "search/main";
		
		///WEB-INF/view/ + search/main + .jsp
	}
}
