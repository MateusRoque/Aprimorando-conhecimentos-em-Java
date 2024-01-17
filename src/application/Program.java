package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		System.out.println("Enter product data:");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
//		
//		System.out.print("Quantity: ");
//		int quantity = sc.nextInt();
		
		Product pdc = new Product(name, price);
		
		System.out.println(pdc.toString());
		
		System.out.println("Enter the number of products to be added from stock: ");
		int quantity = sc.nextInt();
		pdc.addProducts(quantity);
		 
		System.out.println(pdc.toString());
		
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		pdc.removeProducts(quantity);
		
		System.out.println(pdc.toString());
		
		sc.close();
	}

}
