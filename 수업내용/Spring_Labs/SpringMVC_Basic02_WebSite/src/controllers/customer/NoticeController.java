package controllers.customer;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import vo.Notice;
import dao.NoticeDao;

//게시물 목록보기
//행위당 한개 

public class NoticeController implements Controller {

	private NoticeDao noticedao;
	public void setNoticedao(NoticeDao noticedao) {
		this.noticedao = noticedao;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//게시물 목록 보기
		//noticedao.getNotices(page, field, query)
		
		//검색 처리를 위한 코드
		String _page = request.getParameter("pg");
		String _field = request.getParameter("f");
		String _query = request.getParameter("q");
		
		System.out.println(_page + "/ " + _field + "/ " + _query);

		//게시판 검색을 위한 기본 설정
		int page = 1;
		String field = "TITLE";
		String query ="%%";
		
		//위 두 조건 조합
		if(_page != null && !_page.equals("")){
			page = Integer.parseInt(_page);
		}
		if(_field != null && !_field.equals("")){
			field = _field;
		}
		if(_query != null && !_query.equals("")){
			query = _query;
		}
		
		List<Notice> list = noticedao.getNotices(page, field, query);
		
		//SpringMVC (데이터 담기 , View 지정)
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", list); //request.setAttribute("list", list);
		mv.setViewName("notice.jsp");
		
		//내부적으로 forward
		//요청 주소
		//customer/notice.htm => 요청했던 주소는 변경 없어요
		//클라이언트  브라우져에 출력되는 내용은 > notice.jsp 내용
		
		
		
		return mv;
	}

}
