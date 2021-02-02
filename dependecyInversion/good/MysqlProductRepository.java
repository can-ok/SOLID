package solidDependencyI.good;

import java.util.Arrays;
import java.util.List;

public class MysqlProductRepository implements ProductRepository {

	@Override
	public List<String> getAllProducts() {
		
		List<String> products=Arrays.asList("Product1","Product2");
		return products;
	}

	
}
