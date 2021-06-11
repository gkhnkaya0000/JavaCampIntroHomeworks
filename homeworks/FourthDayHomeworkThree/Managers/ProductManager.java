package Managers;
import Interfaces.ProductService;
import Entities.Product;



public class ProductManager implements ProductService {

	@Override
	public void add(Product product) {
		System.out.println(product.getProductName()+ " " +  "added");
		
	}

	@Override
	public void delete(Product product) {
		System.out.println(product.getProductName()+" " +  "deleted");
		
	}

	@Override
	public void update(Product product) {
		System.out.println(product.getProductName()+" " +  "updated");
		
	}

	
		
		
}


