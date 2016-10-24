package kr.or.kosta;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;




public class HelloController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		   System.out.println("HelloController 요청 실행");
		  
		   //데이터 담고 , view 지정
		   ModelAndView mav = new ModelAndView();
		   mav.addObject("name","kglim");
		   mav.setViewName("hello");
		
		return mav;
	}

}
