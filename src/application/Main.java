package application;

import java.util.Scanner;

import model.entities.Triangle;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Triangle x;
		x = new Triangle();
		x.a = 3.00;
		x.b = 4.00;
		x.c = 5.00;
	
		
		System.out.println("A área do triângulo é: " + x.area());
		
		sc.close();
	}

}
