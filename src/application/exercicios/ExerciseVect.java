package application.exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class ExerciseVect {
	// ALTURAS **********************************
//	public static void main(String[] args) {
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Quantas pessas serão digitadas? ");
//		int n = sc.nextInt();
//		
//		Person[] pers = new Person[n];
//		
//		for(int i = 0; i < pers.length; i++) {
//			System.out.println("Dados da "+ i+1 +"ª pessoa:");
//			
//			System.out.println("Nome: ");
//			String name = sc.nextLine();
//			
//			sc.nextLine();
//			System.out.println("Idade: ");
//			int age = sc.nextInt();
//			
//			System.out.println("Altura: ");
//			double height = sc.nextDouble();
//			pers[i] = new Person(name, age, height);
//		}
//		
//		double sum = 0;
//		for(int i = 0; i < pers.length; i++) {
//			sum += pers[i].getHeight();
//			
//		}
//		
//		System.out.println(sum);
//		sc.close();
//	}
	
	// NEGATIVOS ****************************
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números serão digitados? ");
		int n = sc.nextInt();
		
		int[] arrayNum = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Digite um número");
			int numInput = sc.nextInt();
			
			arrayNum[i] = numInput;
			
		}
		
		System.out.println("Números Negativos: ");
		
		for(int i = 0; i < arrayNum.length; i++) {
			if(arrayNum[i] < 0) {
				System.out.println(arrayNum[i]);
			}
		}
		
		
		sc.close();
	}
}
































