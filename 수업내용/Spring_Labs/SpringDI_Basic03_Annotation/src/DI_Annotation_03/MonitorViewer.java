package DI_Annotation_03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MonitorViewer {
	private Recorder recorder;

	public Recorder getRecorder() {
		return recorder;
	}
	
	//IOC 컨테이너에 맞는 Type 객체 있으면 injection
	//없으면 안하겠다
	@Autowired(required=false) // Default > required=true
	public void setRecorder(Recorder xxxx) {
		this.recorder = xxxx;
	}
	
	

}
