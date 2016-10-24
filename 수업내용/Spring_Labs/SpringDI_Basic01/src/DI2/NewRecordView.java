package DI2;

public class NewRecordView {
	//점수 출력(NewRecord 객체)
	private NewRecord record;
	
	//생성자를 객체 주입
	/*	public NewRecordView(int kor , int eng , int math){
		record = new NewRecord(kor, eng, math);
	}*/
	
	//setter 를 통해서 객체 주입
	
	public void setRecord(NewRecord record) {
		this.record = record;
	}

	public void print(){
		System.out.println(record.total() + " / " + record.avg());
	}
}
