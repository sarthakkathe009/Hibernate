package service;

import entities.Product;

public interface ProductService {
	public Product getProductById(int id);
	public void addProduct(Product product);
	public void deleteProduct(Product product);
	public void updateProduct(Product product);
	
}
