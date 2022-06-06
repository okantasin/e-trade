package business.abstracts;

import java.util.List;

import entitities.concretes.Product;

public interface ProductService {
	void add(Product product);
	void delete(Product product);
	void update(Product product);
	List<Product> getAll();
	Product getById(int id);
	
}
