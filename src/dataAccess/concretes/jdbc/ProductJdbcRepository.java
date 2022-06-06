package dataAccess.concretes.jdbc;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.ProductRepository;
import entitities.concretes.Product;

public class ProductJdbcRepository implements ProductRepository {

	List<Product> list = new ArrayList<Product>();
	
	@Override
	public void add(Product product) {
	  	
	     list.add(product);
	     
	     System.out.println("JDBC ADDING:");	
	}

	@Override
	public void delete(Product product) {
		list.remove(product);
	    System.out.println("JDBC DELETING:");
	    
	}

	@Override
	public void update(Product product) {
		Product productUpdate = getById(product.getId());
		productUpdate.setName(product.getName());
		productUpdate.setUnitPrice(product.getUnitPrice());
		productUpdate.setDescription(product.getDescription());
		productUpdate.setCategoryId(product.getCategoryId());
		System.out.println("jdbc UPDATNG:");			
	}

	@Override
	public List<Product> getAll() {
		
		
		return list;
	}

	@Override
	public Product getById(int id) {
		
		Product productGetIdFind= null;
		
		for (Product product : list) {
			
			if(product.getId() ==id) {
				
				productGetIdFind = product;
			}
			
		}
		
		return productGetIdFind;
	}
}
