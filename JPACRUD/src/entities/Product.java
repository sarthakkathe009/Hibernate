package entities;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
@SuppressWarnings("all")
public class Product implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int productId;
	private String productName;
	private float rate;
	private int quantity;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getProductId() {
		return productId;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", rate=" + rate + ", quantity="
				+ quantity + "]";
	}
	
	
	
}
