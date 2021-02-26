package entities;

public class Product {

	String name;
	double price;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static String staticUpperCaseName(Product p) {
		String nameUpper = p.getName().toUpperCase();
		return nameUpper;
	}

	public String nonStaticUpperCaseName() {
		return name.toUpperCase();
	}
	
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
	
}