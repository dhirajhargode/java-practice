package p01;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import dto.Category;
import dto.Product;

public class Main {

	public static void main(String[] args) {
		SessionFactory sf = 
				new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Category c10 = new Category(10,"elec");
		Category c20 = new Category(20,"appli");
		Product p1 = new Product(1,"fan");
		Product p2 = new Product(2,"cooler");
		Product p3 = new Product(3,"tubelight");

		c10.getProducts().add(p1);
		c10.getProducts().add(p2);
		
		c20.getProducts().add(p2);
		c20.getProducts().add(p3);
		
		p1.getCategories().add(c10);
		
		p2.getCategories().add(c10);
		p2.getCategories().add(c20);
		
		p3.getCategories().add(c20);
		
		s.save(c10);
		s.save(c20);
		s.save(p1);
		s.save(p2);
		s.save(p3);
		
		t.commit();
		s.close();
		sf.close();
		
	}

}
