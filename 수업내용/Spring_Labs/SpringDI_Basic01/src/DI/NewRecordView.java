package DI;

public class NewRecordView {
	//점수 출력(NewRecord 객체)
	private NewRecord record;
	public NewRecordView(int kor , int eng , int math){
		record = new NewRecord(kor, eng, math);
	}
	public void print(){
		System.out.println(record.total() + " / " + record.avg());
	}
}
