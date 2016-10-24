package DI_Annotation_01;

import org.springframework.beans.factory.annotation.Autowired;

public class MonitorViewer {
	/*
	1단계(xml 설정통해서 생성과 주입)
	private Recorder recorder;

	public Recorder getRecorder() {
		return recorder;
	}
	public void setRecorder(Recorder recorder) {
		this.recorder = recorder;
	}
	*/
	
	//2단계 : (memberfield를 통한 자동 주입)
	/*
	@Autowired
	private Recorder recorder;

	public Recorder getRecorder() {
		return recorder;
	}
	*/	
	//3단계(setter 를 통한 자동 주입) : [[가장많이 쓰이는 방법]]
	/*
	private Recorder recorder;

	public Recorder getRecorder() {
		return recorder;
	}
	@Autowired
	public void setRecorder(Recorder recorder) {
		this.recorder = recorder;
		System.out.println("setter 주입 성공^^");
	}
	*/
	//4단계 : setter 계열의 함수가 아닌 일반함수 injection 가능할까
	private Recorder recorder;
	
	@Autowired
	public void RecorderMethod(Recorder rec){
		this.recorder = rec;
		System.out.println("일반  method injection ^^");
	}
	public void RecorderPrint(){
		System.out.println("일반 method 를 통한 주입 : " + this.recorder);
	}
}
