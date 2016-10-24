package DI_Annotation_05_Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//ConfigContext 자바 파일을 > Spring 설정 파일로 사용
//ApplicationContext.xml 대체 

@Configuration
public class ConfigContext {
	//xml 파일에서 bean 을 만들어서 IOC 컨테이너에 load
	//<bean id="user" class="DI_Anno...User">
	@Bean
	public User user(){
		return new User();
	}
	
	@Bean
	public User2 user2(){
		return new User2();
	}
}
