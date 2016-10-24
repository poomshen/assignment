package DI_Annotation_01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

//import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
public class Program {

	public static void main(String[] args) {
		
		/*
		MonitorViewer viewer = new MonitorViewer();
		viewer.setRecorder(new Recorder());
		*/
		ApplicationContext context = 
				new  GenericXmlApplicationContext("classpath:DI_Annotation_01/ApplicationContext.xml");
	    MonitorViewer viewer=context.getBean("monitorViewer", MonitorViewer.class);
	    //System.out.println(viewer.getRecorder());
		viewer.RecorderPrint();		
	}

}
