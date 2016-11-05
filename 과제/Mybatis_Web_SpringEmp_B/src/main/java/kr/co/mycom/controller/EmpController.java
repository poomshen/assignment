package kr.co.mycom.controller;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.mycom.model.empDAO;
import kr.co.mycom.model.empDTO;




@Controller

public class EmpController {


	 @Autowired

	 private SqlSession sqlsession;

	 

	@RequestMapping("/index.htm")
		public String index(){
			
		System.out.println("index!!!!!!!!");
			//이전
			//return "index.jsp";
			//Tiles 적용
			return "home.index";
		}
	 //요청 Url 맞는 method 구현 하고 처리

	 @RequestMapping("/writeform.htm")

	 public String writeForm(){

	  return "emp.writeform";

	  

	 }
	 @RequestMapping("/write.htm")
	 public String write(empDTO dto){
		 

	  empDAO empDao = sqlsession.getMapper(empDAO.class);

	  empDao.insertEmp(dto);

	  return "redirect:/list.htm";  

	 }

	 

	 @RequestMapping("/register.htm")//등록하기emp 

	 public String register(empDTO dto){

	

	  empDAO empDao = sqlsession.getMapper(empDAO.class);



	  empDao.insertEmp(dto);

	  return "redirect:/list.htm";  

	 }

	 

	 @RequestMapping("/list.htm")

	 public String list(Model model){


	  empDAO empDao = sqlsession.getMapper(empDAO.class);

	

	  List<empDTO> list = empDao.getEmpList();

	  

	  model.addAttribute("list",list);

	   return "emp.list";

	  

	 }

	 

	 @RequestMapping("/read.htm")

	 public String read(int empno , Model model){

		 System.out.println("empno : "+empno);
	  

	  empDAO empDao = sqlsession.getMapper(empDAO.class);

	  //상세조회

	  empDTO dto =empDao.getEmp(empno);

	  //model 필요한 것 담고

	  model.addAttribute("emp", dto);

	
	  return "emp.read"; //read.jsp

	 }

	 @RequestMapping("/updateform.htm")

	 public String updateForm(int empno, Model model){

	

	  empDAO empDao = sqlsession.getMapper(empDAO.class);

	  empDTO dto =empDao.getEmp(empno);

	  //model 담기

	  model.addAttribute("b", dto);
	  return "emp.updateform"; //updateform.jsp

	 }

	 @RequestMapping("/update.htm")

	 public String update(empDTO dto){


	  empDAO empDao = sqlsession.getMapper(empDAO.class);

	  int result = empDao.updateEmp(dto);

	  //결과 받기

	  String view = "";

	  if(result == 0){

	   view = "fail"; //fail.jsp

	  }else{

	   view = "redirect:list.htm";

	  }


	  return view;

	 }

	 @RequestMapping("/delete.htm")

	 public String delete(int empno){

	  empDAO empDao = sqlsession.getMapper(empDAO.class);

	  int result =empDao.deleteEmp(empno);

	  

	  String view = "";

	  

	  if(result == 0){

	   view = "emp.fail"; //fail.jsp

	  }else{

	   view = "redirect:list.htm";

	  }

	  

	  return view;

	 }

	@RequestMapping("/search.htm")
	public String searchList(Model model){
		 empDAO empDao = sqlsession.getMapper(empDAO.class);

		 List<empDTO> list = empDao.getEmpList();
		
		 model.addAttribute("list",list);
		return "emp.SearchList";
	}
	
	@RequestMapping("/searchs.htm")
	public String searchList(String ename,String deptno,String mgr, Model model){
	
		empDAO empDao = sqlsession.getMapper(empDAO.class);
		
		Map<String, String> ch = new HashMap<String, String>();
		ch.put("ename", ename);
		ch.put("deptno", deptno);
		ch.put("mgr", mgr);
		List<empDTO> list = empDao.selectSearch(ch);
		
		model.addAttribute("list",list);
		
		return "emp.SearchList";
	}
	
	
	@RequestMapping("/choosesearchform.htm")
	
	public String arraydeleteform(Model model){
		
		  empDAO empDao = sqlsession.getMapper(empDAO.class);

			

		  List<empDTO> list = empDao.getEmpList();

		  

		  model.addAttribute("list",list);
		  
		  
		return "emp.chooseseaechform";
	}
	
	
	@RequestMapping("/choosesearch.htm")
	public String choosesearch(String choose, String search, Model model){
		System.out.println("choose : " + choose);
		System.out.println("search : " + search);
		
		empDAO empDao = sqlsession.getMapper(empDAO.class);
		
		Map<String, String> ch = new HashMap<String, String>();
		ch.put("choose", choose);
		ch.put("search", search);
		
		List<empDTO> list = empDao.choosesearch(ch);
		
		model.addAttribute("list",list);
		
		return "emp.chooseseaechform";
	}
	
	
	@RequestMapping("/calendar.htm")
	public String calendar(){
		
		return "emp.calendar";
	}
 

}























