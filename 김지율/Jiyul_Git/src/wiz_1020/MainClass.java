/*
@date    : 2016.10.20 오후 스터디
@author  : 김지율
@Comment : [스프링컨테이너 생명주기]
		       생성 -> 설정 -> 사용 -> 종료
*/

package wiz_1020;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(); //생성
		
		ctx.load("classpath:wiz_1020/applicationCTX.xml"); //설정
		
		ctx.refresh(); //파라미터 없는 디폴트 생성자 사용해서 ctx 만들고, load로 설정해준 경우(생성을 따로 했으면)에는 
					   //refresh 메소드로 설정 완벽하게 될 수 있도록...!
		
		Student student = ctx.getBean("student", Student.class); //사용
		System.out.println("이름 : " + student.getName());
		System.out.println("나이 : " + student.getAge());
		
		ctx.close(); //종료
	}

}
