package ex03_teamQuiz1019;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

//import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
public class Program {

	public static void main(String[] args) {
		
		/*
		MonitorViewer viewer = new MonitorViewer();
		viewer.setRecorder(new Recorder());
		*/
		
		
	    //System.out.println(viewer.getRecorder());
		//viewer.RecorderPrint();
		
		/* (2단계 => ex03.Recorder@1a3869f4)
		ApplicationContext context = new GenericXmlApplicationContext("classpath:ex03/ApplicationContext.xml");
		
		MonitorViewer viewer = context.getBean("monitorViewer", MonitorViewer.class);
		System.out.println(viewer.getRecorder());
		*/
		
		/* (3단계 => ex03.Recorder@6121c9d6) 
		ApplicationContext context = new GenericXmlApplicationContext("classpath:ex03/ApplicationContext.xml");
		
		MonitorViewer viewer = context.getBean("monitorViewer", MonitorViewer.class);
		System.out.println(viewer.getRecorder());
		*/
		
		/* (4단계) */
		ApplicationContext context = new GenericXmlApplicationContext("classpath:ex03_teamQuiz1019/ApplicationContext.xml");
		
		MonitorViewer viewer = context.getBean("monitorViewer", MonitorViewer.class);
		/*viewer.RecorderMethod();
		viewer.RecorderPrint();*/
		
		
	
	}

}
