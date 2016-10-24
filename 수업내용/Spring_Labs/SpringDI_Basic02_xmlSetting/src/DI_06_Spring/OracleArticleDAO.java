package DI_06_Spring;

public class OracleArticleDAO implements ArticleDAO {

	@Override
	public void insert(Article article) {
		System.out.println("Oracle INSERT");
		
	}

}
