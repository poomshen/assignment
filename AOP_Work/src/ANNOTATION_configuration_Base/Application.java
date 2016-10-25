package ANNOTATION_configuration_Base;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class Application {

	@Bean
	public AspectAdvice aspectAdvice(){
		return new AspectAdvice();
	}
	
	@Bean
	public MainFunction mainFunction(){
		return new MainFunction();
	}
	
}
