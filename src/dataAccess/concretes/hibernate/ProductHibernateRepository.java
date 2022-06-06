package dataAccess.concretes.hibernate;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.ProductRepository;
import entitities.concretes.Product;

public class ProductHibernateRepository implements ProductRepository {
	
List<Product> list = new ArrayList<Product>();
	
	@Override
	public void add(Product product) {
	  	
	     list.add(product);
	     
	     System.out.println("HÝBERNATE ADDING:");	
	}

	@Override
	public void delete(Product product) {
		list.remove(product);
	    System.out.println("HÝBERNATE DELETING:");
	    
	}

	@Override
	public void update(Product product) {
		Product productUpdate = getById(product.getId());
		productUpdate.setName(product.getName());
		productUpdate.setUnitPrice(product.getUnitPrice());
		productUpdate.setDescription(product.getDescription());
		productUpdate.setCategoryId(product.getCategoryId());
		System.out.println("HÝBERNATE UPDATNG:");			
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
