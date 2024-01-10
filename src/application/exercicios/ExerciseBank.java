package application.exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class ExerciseBank {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double depositOrWithdraw;
		double initialDeposit;
		System.out.println("Enter account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter account holder: ");
		String userName = sc.nextLine();
		
		
		System.out.println("Is there an initial deposit (y/n)? ");
		String depositResponse = sc.nextLine();
		
		BankAccount bk;
		
		if(depositResponse.equals("y")) {
			System.out.println("Enter initial deposit value: ");
			initialDeposit = sc.nextDouble();
			
			bk =  new BankAccount(accountNumber, userName, initialDeposit);
			
		} else {
			bk = new BankAccount(accountNumber, userName);
		}
		
		System.out.println("Account data:");
		System.out.println(bk.toString());
		System.out.println("Enter a deposit value: ");
		depositOrWithdraw = sc.nextDouble();
		
		bk.addDeposit(depositOrWithdraw);
		System.out.println("Updated account data:");
		System.out.println(bk.toString());

		System.out.println("Enter a withdraw value: ");
		depositOrWithdraw = sc.nextDouble();
		
		bk.withdraw(depositOrWithdraw);
		System.out.println("Updated account data:");
		System.out.println(bk.toString());
		
		
		
		sc.close();
		
	}

}
