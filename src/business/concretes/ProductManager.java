package business.concretes;

import java.util.List;

import business.abstracts.ProductService;
import dataAccess.abstracts.ProductRepository;
import entitities.concretes.Product;

public class ProductManager implements ProductService {
	ProductRepository productRepository;

	public ProductManager(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	@Override
	public void add(Product product) {
		if (!chechIfSameNameExits(product.getName()) && !checkIfZeroPerUnit(product)
				&& checkIfSameCategory(product.getCategoryId()) < 5) {
			productRepository.add(product);

		} else {
			System.out.println("Please try again");
		}
	}


	@Override
	public void delete(Product product) {
		productRepository.delete(product);
		
	}

	@Override
	public void update(Product product) {
		productRepository.update(product);
	}

	@Override
	public List<Product> getAll() {
		

		return productRepository.getAll();
	}

	@Override
	public Product getById(int id) {
		
		return productRepository.getById(id);
	}

	private boolean chechIfSameNameExits(String name) {
		
		boolean exits=false;
		
		for (Product product : productRepository.getAll()) {
			
			if(product.getName()== name) {
				
				exits=true;
			}
			
		}
		return exits;
	}
	
	private boolean checkIfZeroPerUnit(Product product) {
		
		boolean small=false;
		
		if(product.getUnitPrice()<=0) {
			
			small =true;
		}
		return small;
		
	}

	private Integer checkIfSameCategory(int catgoryId) {
		
		int count=0;
		
		for (Product item : productRepository.getAll()) {
			
			if(item.getCategoryId()==catgoryId) {
				
				count++;
			}
			
		}
		return count;
		
		
	}
}
