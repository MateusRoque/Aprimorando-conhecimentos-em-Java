package application.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employees;
import entities.OutSourcedEmployee;

public class ExerciseEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		Integer num = sc.nextInt();
		
		List<Employees> listEmp = new ArrayList<Employees>();
		
		for (Integer i = 0; i < num; i++) {
			System.out.println("Employee #" + (i+1) + " data:");
			
			System.out.print("Outsourced (y/n): ");
			char option = sc.next().charAt(0);
			
			if(option == 'n') {
				System.out.print("Name: ");
				String name = sc.next();
				
				System.out.print("Hours: ");
				Integer hours = sc.nextInt();
				
				System.out.print("Value per hour: ");
				Double valuePerHour = sc.nextDouble();
				
				listEmp.add(new Employees(name, hours, valuePerHour));
				
			} else if(option == 'y'){
				System.out.print("Name: ");
				String name = sc.next();
				
				System.out.print("Hours: ");
				Integer hours = sc.nextInt();
				
				System.out.print("Value per hour: ");
				Double valuePerHour = sc.nextDouble();
				
				System.out.println("Additional charge: ");
				Double additionalCharge = sc.nextDouble();
				
				listEmp.add(new OutSourcedEmployee(name, hours, valuePerHour, additionalCharge));
			}
		}
		
		System.out.println("PAYMENTS:");
		for (Employees emp : listEmp) {
			System.out.print(emp.getName() + " -> " + emp.payment());
		}
		sc.close();
	}

}























