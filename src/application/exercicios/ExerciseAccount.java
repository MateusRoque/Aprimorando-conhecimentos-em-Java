package application.exercicios;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.AccountException;

public class ExerciseAccount {

	public static void main(String[] args) throws AccountException{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
			
			System.out.println("Enter account data:");
			System.out.print("Number: ");
			Integer num = sc.nextInt();
			
			System.out.print("Holder: ");
			String holder = sc.next();
			
			System.out.print("Initial balance: ");
			Double balance = sc.nextDouble();
			
			System.out.print("Withdraw limit: ");
			Double withDrawLimit = sc.nextDouble();
			
			Account acc = new Account(num, holder, balance, withDrawLimit);
			
			System.out.print("Enter amount for withdraw: ");
			Double amount = sc.nextDouble();
			
			acc.withdraw(amount);
			System.out.println("New balance: " + acc.getBalance());
			
		} catch(AccountException e){
			System.out.println("Erro: " + e.getMessage());
		}
		sc.close();
	}

}
