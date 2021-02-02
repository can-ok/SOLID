package solidDependencyI.good;

import java.util.List;

public class ProductCatalogService {
	
	public void listAllProducts() {
		
		ProductRepository productRepository=ProductFactory.createSQLRepository();
		
		List<String> allProducts=productRepository.getAllProducts();
		
		for(String name:allProducts) {
			System.out.println(name);
		}
	}

}
