import java.awt.font.FontRenderContext;

import business.abstracts.ProductService;
import business.concretes.ProductManager;
import dataAccess.concretes.hibernate.ProductHibernateRepository;
import dataAccess.concretes.jdbc.ProductJdbcRepository;
import entitities.concretes.Product;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product(1, "FaberCastell", 50, "Kalem", 486);
		
		Product product2 = new Product(2, "JBL", 500, "Kulaklýk", 487);
		
		Product product3 = new Product(3,"Apple",10000,"Telefon",488);
		
		Product product4 = new Product(4,"STM32",1250,"Kart",489);

		Product product5 = new Product(5,"Xiaomi",650,"Batarya",490);

		Product product6 = new Product(6,"LG",5250,"Televizyon",491);

		Product product7 = new Product(7,"Samsung",5800,"Televizyon",492);
		
		Product product8 = new Product(2, "JBL", 500, "Kulaklýk", 487);
		
		Product product9 = new Product(4,"STM32",1250,"Kart",489);
		
		Product product11= new Product(8,"STM32",5000,"Kart",494);
		
		Product product12 = new Product(9,"FATÝH",58,"Kalem",486);

	     ProductService services= new ProductManager(new  ProductHibernateRepository() );
			services.add(product1);
			services.add(product2);
			services.add(product3);
			services.add(product4);
			services.add(product5);
			services.add(product6);
			services.add(product7);
			services.add(product8);
			services.add(product9);
			
			
			
			for (Product item: services.getAll()) {
				System.out.println(item.getName());
			}
			
			Product product10 = new Product(5, "NIKE", 550, "Yaðmurluk", 493);
			services.update(product10);
			
			for (Product productss : services.getAll()) {
				System.out.println("===================================");
				System.out.println(productss.getName());
				
			}
		}

	}
