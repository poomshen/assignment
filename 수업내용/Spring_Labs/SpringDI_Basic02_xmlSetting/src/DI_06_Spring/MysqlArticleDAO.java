package DI_06_Spring;

public class MysqlArticleDAO implements ArticleDAO {

	@Override
	public void insert(Article article) {
		System.out.println("Mysql INSERT");
		
	}

}
