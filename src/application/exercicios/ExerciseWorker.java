package application.exercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
 import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class ExerciseWorker {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter department's name:");
		String dpName = sc.next();
		
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String name = sc.next();
		sc.nextLine();
		
		System.out.print("Level: ");
		String level = sc.next();
		sc.nextLine();
		
		System.out.print("Base Salary: ");
		Double baseSalary = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(dpName));
		
		for(int i = 0; i < n; i++) {
			System.out.println("Enter contract #" + (i+1) + " data:");
			System.out.print("Date (DD/MM/YYYY):");
			Date date = sdf.parse(sc.next());
;
			sc.nextLine();
			
			System.out.print("Value per hour:");
			Double valuePerHour = sc.nextDouble();
			sc.nextLine();
			
			System.out.print("Duration (hours):");
			Integer duration = sc.nextInt();
			
			HourContract hourContract = new HourContract(date, valuePerHour, duration);
			worker.addContract(hourContract);

		}

		System.out.println("Enter month and year to calculate income (MM/YYYY):");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0,2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Deparment: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%2%2f", worker.income(year, month)));

		
		sc.close();
	}

}
