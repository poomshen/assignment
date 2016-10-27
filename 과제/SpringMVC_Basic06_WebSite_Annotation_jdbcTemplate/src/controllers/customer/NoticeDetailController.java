package controllers.customer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import dao.NoticeDao2;
import vo.Notice;

public class NoticeDetailController implements Controller {
	//<a href="noticeDetail.htm?seq=${n.seq}">${n.title}</a> 요청 동작
	//DAO > Notice getNotice(String seq)
	
	private NoticeDao2 noticedao;
	public void setNoticedao(NoticeDao2 noticedao) {
		this.noticedao = noticedao;
	}
	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		String seq = request.getParameter("seq");
		Notice notice = noticedao.getNotice(seq);
		
		//SpringMVC
		ModelAndView mv = new ModelAndView();
		mv.addObject("notice", notice);
		mv.setViewName("noticeDetail.jsp");
		
		
		
		return mv;
	}

}
