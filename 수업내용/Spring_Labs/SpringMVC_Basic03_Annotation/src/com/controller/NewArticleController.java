package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.NewArticleCommand;
import com.service.ArticleService;

@Controller
@RequestMapping("/article/newArticle.do")
public class NewArticleController {
	
	//글쓰기(Form 화면 :GET) , 글쓰기 완료(입력 server 전송:POST)
	
	//화면만 처리
	@RequestMapping(method=RequestMethod.GET)
	public String form(){
		System.out.println("GET 방식에 대한 요청 처리 함수");
		return "article/newArticleForm"; // 
		
		//return 은 view를 구성하는 값
		//return 값 : /WEB-INF/view/ + article/newArticleForm + .jsp
		//client 에게 newArticleForm.jsp 보여 주어라 
		//return String 이면 : view 구성 
	}
	
	private ArticleService articleService;
	@Autowired //by type
	public void setArticleService(ArticleService articleService) {
		this.articleService = articleService;
	}
	//1.form 태그 : title , content > request.getParameter("title")
	//2.ArticleService 서비스 객체의 > writeArticle 함수 실행
	//3.결과 보여주기
	@RequestMapping(method=RequestMethod.POST)
	// 자동 : public String submit(NewArticleCommand command){
	public String submit(@ModelAttribute("Articledata")NewArticleCommand command){	
	//기존(Model2 Mvc) 방식
		//NewArticleCommand command = new NewArticleCommand();
		//command.setTitle(request.getParamter("title"));
		
		System.out.println("submit");
		System.out.println("전송방식 : post");
		System.out.println("command : " + command.toString());
		
		//service 객체를 통해서 DB Insert 작업
		System.out.println("service : " + articleService.toString());
		articleService.writeArticle(command);
		
		return "article/newArticleSubmitted"; //view 이름
	
	}
	
}


/*
문제점_1
-요청이 POST 방식일 경우
-<Form method="post">
-Form 태그 submit 전송버튼 클릭시 
-질문 : action 은 어떻게 처리 될까요
-답안 : 현재 Url 가지는 주소를 action 사용 
        http://localhost:8090/SrpingMVC_Basic03_Annotation/article/newArticle.do
 
문제점_2
-public String submit(NewArticleCommand command){}
-NewArticleCommand type으로 paramter 를 받고 있다
-기존 (Model2 Mvc)
-NewArticleCommand command = new NewArticleCommand();
-command.setTitle(request.getParamter("title")); 

-내부적으로 어떤 코드가 실행됬을까
- 1. NewArticleCommand 자동 [New 객체생성]
- 2. 생성된 객체에 setter 를 통해서 사용자의 입력값 자동 주입
- 3. 성립 : <input name="값" 이 DTO 클래의  memberfield 동일해야 한다
 
정리 : SpringMVC 에서는 일반적으로 DTO 객체를  parameter 사용
       
 
문제점_3
-return "article/newArticleSubmitted"; 
-newArticleSubmitted.jsp 화면출력

-ModelAndView 객체를 사용했다고 한다면
-ModelAndView mv = new ModelAndView();
-mv.addObject("newArticleCommand",command)
-mv.setViewName("article/newArticleSubmitted") 
-return mv

-key point
why > public String submit(NewArticleCommand command)
NewArticleCommand 클래스 [자동 빈 등록]
-내부적으로 자동화
-<bean id="" class="com.model.NewArticleCommand"></bean>
-bean 의 id 값은 자동으로 : newArticleCommand
--<bean id="newArticleCommand" class="com.model.NewArticleCommand"></bean>

result : mv.addObject("newArticleCommand",command)
         <bean id="newArticleCommand"
 
 
 ***** method parameter 사용되는 객체는 자동으로 빈객체 등록 *****
 ***** id="" 값도 자동 설정된다
 
 -나는 [자동으로  만들어지는 객체] [빈이름 (id) 사용하지 않을 거야]
 -@ModelAttribute("Articledata")NewArticleCommand command 할수 있어요
 -그럼 내부적으로
 -NewArticleCommand Articledata = new NewArticleCommand() 생성 효과
 
 
 
 
*/

