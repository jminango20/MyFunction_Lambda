package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import model.services.ProductService;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> list = new ArrayList<Product>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		ProductService ps = new ProductService();
		//double sum = ps.filteredSum(list, p -> p.getName().charAt(0)=='M');
		double sum = ps.filteredSum(list, p -> p.getPrice() < 100.00);

		
		System.out.println("Sum = " + String.format("%.2f", sum));
		
	}

}
