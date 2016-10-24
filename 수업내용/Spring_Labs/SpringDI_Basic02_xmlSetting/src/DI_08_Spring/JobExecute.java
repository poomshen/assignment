package DI_08_Spring;

public class JobExecute {
	
	public JobExecute(String first , int second){
		System.out.println("문자 , int 출력");
	}
	public JobExecute(String first , long second){
		System.out.println("문자 , long 출력");
	}
	public JobExecute(String first , String second){
		System.out.println("문자 , 문자 출력");
	}
	
	private ArticleDao articledao;

	public void setArticledao(ArticleDao articledao) {
		this.articledao = articledao;
		System.out.println("ArticleDao : " + this.articledao.toString());
	}
	
	private int data;

	public void setData(int data) {
		this.data = data;
		System.out.println("data value : " + this.data);
	}
	
	
}
