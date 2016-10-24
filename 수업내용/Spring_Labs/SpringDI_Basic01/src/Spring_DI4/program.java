package Spring_DI4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class program {

	public static void main(String[] args) {
		
		/*
		
		NewRecord record = new NewRecord();
		NewRecordView view = new NewRecordView();
		view.setRecord(record);//객체 주입
		
		view.input();
		view.print();
		
		Spring FrameWork : 2객체를 만들고 setter 주입
		*/
		
		
		//Spring 고유한 영역(Memory) : Spring 관리
		//IOC 컨테이너

		ApplicationContext context = 
				new ClassPathXmlApplicationContext("DIConfig.xml");
		//컨테이너가  생성되고 xml에서 read 객체 생성하고 조립
		
		//컨테이너 안에서  필요한 객체를 꺼내 쓰시면 됩니다
		//IOC 컨테이너 안에서 객체 찿아오기
		RecordView view = (NewRecordView)context.getBean("view");
		view.input();
		view.print();

	}

}
