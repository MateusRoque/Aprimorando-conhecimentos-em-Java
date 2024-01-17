package application.exercicios;

import java.util.Locale;
import java.util.Scanner;

import model.entities.CurrencyConverter;

public class ExerciseDolar {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double dollar = sc.nextDouble();
		
		System.out.println("How many dollar will be bought? ");
		double boughtDolar = sc.nextDouble();
		
		System.out.println("Amount to be paid in reais = " + CurrencyConverter.valueDollar(dollar, boughtDolar)); 		
		
		
		
		
		sc.close();
	}
}
