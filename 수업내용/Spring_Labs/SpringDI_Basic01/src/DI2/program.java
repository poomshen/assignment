package DI2;

public class program {

	public static void main(String[] args) {
		NewRecord record = new NewRecord(100, 20, 50);
		NewRecordView view = new NewRecordView();
		view.setRecord(record);//객체 주입
		view.print();

	}

}
