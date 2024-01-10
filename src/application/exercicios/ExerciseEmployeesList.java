package application.exercicios;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Employees;

public class ExerciseEmployeesList {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many employees will be registeres?");
		int n = sc.nextInt();
		
		ArrayList<Employees> list = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Employee #"+ (i+1));
			
			System.out.print("ID: ");
			int id = sc.nextInt();
			
			while(hasId(list, id)) {
				System.out.println("This id is already taken.");
				id = sc.nextInt();
			}
			
			System.out.print("NAME: ");
			String name = sc.nextLine();
			
			sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			System.out.println("=================");
			
			list.add(new Employees(id, name, salary));
		}
		
		System.out.println("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if(emp == null) {
			System.out.println("Id does not exists");
		} else {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.promotionSalary(percentage);
		}
		
		System.out.println("List of employees: ");
		for(Employees x : list) {
			System.out.println(x.toString());
		}
			
		sc.close();
		
	}
	
	public static boolean hasId(ArrayList<Employees> list, int id) {
		Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
