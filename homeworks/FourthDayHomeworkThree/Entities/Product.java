package Entities;

public class Product {
	private int id;
	private double price;
	private String productName;
	
	public Product() {}

	public Product(int id, double price, String productName) {
		super();
		this.id = id;
		this.price = price;
		this.productName = productName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	
}
