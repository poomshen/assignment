package ex03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

//import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
public class Program {

	public static void main(String[] args) {
		
		/*
		MonitorViewer viewer = new MonitorViewer();
		viewer.setRecorder(new Recorder());
		*/
		
		ApplicationContext context = new GenericXmlApplicationContext("classpath:ex03/ApplicationContext.xml");
		MonitorViewer viewer=context.getBean("monitorViewer",MonitorViewer.class);
	
		
	}

}
