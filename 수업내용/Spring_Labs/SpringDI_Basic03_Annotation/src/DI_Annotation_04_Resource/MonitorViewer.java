package DI_Annotation_04_Resource;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MonitorViewer {
	private Recorder recorder;

	public Recorder getRecorder() {
		return recorder;
	}
	@Resource(name="recorder3") // by name(id) 주입
	public void setRecorder(Recorder recorder) {
		this.recorder = recorder;
	}
	
	

}
