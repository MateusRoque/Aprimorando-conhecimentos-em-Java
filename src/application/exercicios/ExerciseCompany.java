package application.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Person;
import model.entities.PhysicalPerson;
import model.entities.legalPerson;

public class ExerciseCompany {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of tax payers: ");
		int numberPayers = sc.nextInt();
		
		List<Person> list = new ArrayList<Person>();

		for(int i = 0; i < numberPayers; i++) {
			System.out.println("Tax payers #" + (i+1) + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char option = sc.next().charAt(0);
			
			
			if(option == 'i') {
				System.out.print("Name: ");
				String name = sc.next();
				
				System.out.print("Anual Income: ");
				Double anualIncome = sc.nextDouble();
				
				System.out.print("Health expenditures: ");
				Double healthCare = sc.nextDouble();
				
				list.add(new PhysicalPerson(name, anualIncome, healthCare));
			} else {
				System.out.print("Name: ");
				String name = sc.next();
				
				System.out.print("Anual Income: ");
				Double anualIncome = sc.nextDouble();
				
				System.out.print("Number of employees: ");
				Integer numberEmployees = sc.nextInt();
				
				list.add(new legalPerson(name, anualIncome, numberEmployees));
			}
		}
		
		System.out.println("TAXES PAID:");
		
		Double sumTaxes = 0.0;
		
		for(Person ps : list) {
			sumTaxes += ps.taxes();
			System.out.println(ps.toString());
			
		}
		
		System.out.println("TOTAL TAXES: $" + sumTaxes);
		sc.close();
	}
}















