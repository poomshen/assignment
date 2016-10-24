package DI_06_Spring;

public class WriteArticleService {
	//요청을 판단 (요청에 따른 DAO 또는 DTO 생성 처리)
	
	private ArticleDAO articledao;
	public WriteArticleService(ArticleDAO articledao){
		this.articledao = articledao;
		System.out.println("WriteArticleService 생성자 호출");
	}
	
	//사용자 요청 글쓰기 서비스
	public void Write(Article article){
		articledao.insert(article);
	}
}
