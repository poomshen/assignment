package kr.co.mycom.model;

import java.util.HashMap;

import java.util.List;
import java.util.Map;




public interface empDAO {

 //메서드 정의

 //CRUD 기반

 int insertEmp(empDTO dto);

 int updateEmp(empDTO dto);

 int deleteEmp(int empno);

 
 

 List<empDTO> getEmpList();

 empDTO getEmp(int num);
 
 List<empDTO> selectSearch(Map<String,String> map);
 List<empDTO> selectSearch2(Map<String, String> map);
 
 
 
 
 
 List<empDTO> choosesearch(Map<String, String> choosesearch);

 

}