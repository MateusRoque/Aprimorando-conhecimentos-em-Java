package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.enums.OrderStatus;

public class TryCatchPratica {
	public static void main(String[] args) {
		method1();
	}
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Method 2");
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace();
			sc.next();
		}
		catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		System.out.println("End of program");
		System.out.println("End Method 2");
		sc.close();
	}
	
	public static void method1() {
		System.out.println("Method1 start");
		method2();
		System.out.println("Method1 end");
	}
}

