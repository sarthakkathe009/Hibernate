package client;

import entities.Product;
//import exceptions.ProductNotFoundException;
import service.ProductService;
import service.ProductServiceImpl;

public class ProductDriver {

	public static void main(String[] args) {
		ProductService service=new ProductServiceImpl();
		try
		{
			Product p1=new Product();
			p1.setProductName("Book");
			p1.setQuantity(200);
			p1.setRate(450);
			service.addProduct(p1);			
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}

}

// Path of Packages
// Entities -> Dao -> Service -> Client