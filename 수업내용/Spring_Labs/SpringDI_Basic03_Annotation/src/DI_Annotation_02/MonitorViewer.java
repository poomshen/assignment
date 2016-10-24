package DI_Annotation_02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MonitorViewer {
	private Recorder recorder;

	public Recorder getRecorder() {
		return recorder;
	}
	@Autowired
	@Qualifier("corder")  //<qualifier value="corder" />
	public void setRecorder(Recorder recorder) {
		this.recorder = recorder;
	}
	
	@Autowired
	@Qualifier("corder2")
	public void SetMyRecorder(Recorder rec){
		System.out.println("rec:" + rec.toString());
	}

}
