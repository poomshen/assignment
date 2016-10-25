package com.service;

import com.model.NewArticleCommand;
/*@Service
  한다면 servelt.xml 에서 별도의 bean 만드는 작업 생략 가능
  단 : <context:component-scan base-package="com.controller" />
 
*/
public class ArticleService {
	public ArticleService(){
		System.out.println("ArticleService 생성자 호출");
	}
	
	//Controller -> Service -> dao (dto)
    public void writeArticle(NewArticleCommand command){
    	//DAO 객체 생성
    	//DAO 객체 함수 호출(DB insert()) 완료
    	System.out.println("신규 글쓰기 작업 완료" + command.toString());
    }
}
