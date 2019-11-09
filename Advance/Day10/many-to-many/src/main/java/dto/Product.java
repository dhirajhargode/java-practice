package dto;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	@Column(name="product_id")
	private int productId;
	@Column(name="product_name")
	private String productName;
	@ManyToMany(mappedBy="products")
	private Set<Category> categories = new HashSet<Category>();
	public Product() {
		super();
	}
	public Product(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Set<Category> getCategories() {
		return categories;
	}
	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}
	@Override
	public String toString() {
		return productId + " " + productName;
	}
	
	
	
}
