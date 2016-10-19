package ex03;

import org.springframework.beans.factory.annotation.Autowired;

public class MonitorViewer {
/*	//1단계(xml 설정통해서 생성과 주입)
	private Recorder recorder;

	public Recorder getRecorder() {
		return recorder;
	}
	
	public void setRecorder(Recorder recorder) {
		this.recorder = recorder;
	}*/
	
	//2단계 : (memberfield를 통한 자동 주입) 구현
/*	private Recorder recorder;
	
	@Autowired
	public Recorder getRecorder() {
		System.out.println("우리조장 만만세 ^^");
		return recorder;
	}
*/
	 
	//3단계(setter 를 통한 자동 주입): 가장 많이 쓰이는 방법***구현
/*	private Recorder recorder;
	
	@Autowired
	public void setRecorder(Recorder recorder) {
		System.out.println("우리조장 만만세 ^^ setter로함");
		this.recorder = recorder;
	}*/
	
	
	//4단계 : setter 계열의 함수가 아닌 일반 함수 injection 가능할까 함수 명
	//RecorderMethod(Recorder rec)  /   RecorderPrint()
	//출력값 RecorderMethod-> System.out.println("우리조장 만만세 ^^");
	//출력값 RecorderPrint -> System.out.println("이성준 짱멋있어");
	private Recorder recorder;
	
	@Autowired
	public Recorder RecorderMethod(Recorder rec){
		System.out.println("우리조장 만만세 ^^ 함수만들어서 함");
		this.recorder = rec;
		return recorder;
	}
	
	public void RecorderPrint(){
		
		System.out.println("이성준 짱멋있어 함수만들어서 함");
	}
	
	
}
