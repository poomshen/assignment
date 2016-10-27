package ncontroller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import dao.NewMemberDao;
import vo.Member;

@Controller
public class MembersController {
	
	private NewMemberDao memberDao;
	@Autowired
	public void setMemberDao(NewMemberDao newMemberDao) {
		this.memberDao = newMemberDao;
	}

	@RequestMapping(value="joinus/join.htm",method=RequestMethod.GET)
	public String insertMember(){
		return "join.jsp";
	}
	
	@RequestMapping(value="joinus/join.htm",method=RequestMethod.POST)
	public String insertMember(Member member) throws ClassNotFoundException, SQLException{
		System.out.println("여기 탄다");
		if(memberDao.insert(member)){
			System.out.println("회원가입 성공");
		}
		return "redirect:login.htm";
	}
	
	
	@RequestMapping(value="joinus/login.htm" , method=RequestMethod.GET)
	public String longinMember(){
		return "login.jsp";
	}
	
	@RequestMapping(value="joinus/login.htm" , method=RequestMethod.POST)
	public String longinMember(Member member) throws ClassNotFoundException, SQLException{
		
		Member members = memberDao.getMember(member.getUid());
		if(members != null){
			System.out.println(member.getUid());
			System.out.println("로그인 성공");
		}else{
			System.out.println("로그인 실패");
		}
		return "redirect:login.htm";
	}
}
