package DI_06_Spring;

//공통 DAO
//표준 함수 이름 return 정의
//Mysql , Oracle , Mssql 사용하는 공통
public interface ArticleDAO {
	void insert(Article article);
}
