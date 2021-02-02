package solidDependencyI.good;

public class ProductFactory {
	
	public static ProductRepository createSQLRepository() {
		return new MysqlProductRepository();
	}

}
