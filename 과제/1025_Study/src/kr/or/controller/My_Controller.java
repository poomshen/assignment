package kr.or.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.or.dao.MemberDao;
import kr.or.vo.Member;

@Controller
public class My_Controller {
	
	@Autowired
	private MemberDao memberDao;

	@RequestMapping("/enter.do")
	public ModelAndView method(Member member) throws ClassNotFoundException, SQLException{
	System.out.println("@@@@ 여기가 DB에 회원가입 저장하는 함수 만들어야할 자리! @@@@");
		
		memberDao.insert(member);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("test");
		
		return mv;
	}
}
