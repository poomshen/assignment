package DI3;

import java.util.Scanner;

public class NewRecordView  implements RecordView{
	//점수 출력(NewRecord 객체)
	private NewRecord record;
	
	//생성자를 객체 주입
	/*	public NewRecordView(int kor , int eng , int math){
		record = new NewRecord(kor, eng, math);
	}*/
	
	//setter 를 통해서 객체 주입
    //요녀석을 인터페이스 적용한 코드로 바꾸어 보세요	
	public void setRecord(Record record) {
		this.record = (NewRecord)record;
	}

	@Override
	public void print(){
		System.out.println(record.total() + " / " + record.avg());
		System.out.println(record.toString());
	}

	@Override
	public void input() {
		//입력
		Scanner scan = new Scanner(System.in);
		System.out.println("kor:");
		record.setKor(scan.nextInt());
		
		System.out.println("eng");
		record.setEng(scan.nextInt());
		
		System.out.println("math");
		record.setMath(scan.nextInt());
		
	}
}
