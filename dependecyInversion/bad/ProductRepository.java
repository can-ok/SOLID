package solidDependencyI.bad;

import java.util.Arrays;
import java.util.List;

public class ProductRepository {
	
	public List<String> getAllProducts(){
		
		return Arrays.asList("product1","product2");
	}

}
