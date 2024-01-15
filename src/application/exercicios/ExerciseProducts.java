package application.exercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class ExerciseProducts {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		List<Product> list = new ArrayList<>(); 
		
		System.out.print("Enter the number of products: ");
		int numberOfProducts = sc.nextInt();
		
		for(int i = 0; i < numberOfProducts; i++) {
			System.out.println("PRODUCT #" + (i+1) + " data:");
			System.out.print("Common, used or imported (c/u/i)?");
			String option = sc.next();
			
			switch (option) {
			case "i": {
				System.out.print("Name:");
				String name = sc.next();
				
				System.out.print("Price:");
				Double price = sc.nextDouble();
				
				System.out.print("Customs fee:");
				Double customsFee = sc.nextDouble();
				
				list.add(new ImportedProduct(name, price, customsFee));
				
				break;
			}
			case "c": {
				System.out.print("Name:");
				String name = sc.next();
				sc.nextLine();
				System.out.print("Price:");
				Double price = sc.nextDouble();
				
				list.add(new Product(name, price));

				break;
			}
			case "u": {
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				
				System.out.print("Name:");
				String name = sc.next();
				
				System.out.print("Name:");
				Double price = sc.nextDouble();
				
				System.out.print("Manufacture date (DD/MM/YYYY):");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				
				list.add(new UsedProduct(name, price, date));

				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + option);
			}
		}
		
		System.out.println();
		System.out.println("Price tags:");
		for (Product product : list) {
			System.out.println(product.priceTag());
		}
		
		sc.close();
	}
}
