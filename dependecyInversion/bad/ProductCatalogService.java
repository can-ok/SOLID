package solidDependencyI.bad;

import java.util.List;

public class ProductCatalogService {
	
	public void listAllProducts() {
		
		ProductRepository productRepo=new ProductRepository();
		
		List<String> allProducts=productRepo.getAllProducts();
		
		for(String name:allProducts)
			System.out.println(name);
	}

}
