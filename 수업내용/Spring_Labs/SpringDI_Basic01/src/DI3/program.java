package DI3;

public class program {

	public static void main(String[] args) {
		NewRecord record = new NewRecord();
		NewRecordView view = new NewRecordView();
		view.setRecord(record);//객체 주입
		
		view.input();
		view.print();

	}

}
