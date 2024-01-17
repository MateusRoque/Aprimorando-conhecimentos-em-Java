package application;

import model.entities.Account;
import model.entities.BusinessAccount;
import model.entities.SavingsAccount;

public class ProgramExtends {

	public static void main(String[] args) {
		Account acc = new Account(1001, "Mateus", 0.0);
		BusinessAccount bac = new BusinessAccount(1002, "Alfredo", 0.0, 500.0);
		
		// UPCASTING
		
		Account acc1 = bac;
		System.out.println(acc1.getHolder());
		Account acc2 = new BusinessAccount(1003, "Jose", 1300.0, 400.0);
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 100.0);
		
		// DOWNCASTING
		BusinessAccount bac4 = (BusinessAccount) acc2;
		//BusinessAccount bac5 = (BusinessAccount) acc3; //SavingsAccount não é uma BusinessAccount, ela é uma Account
		
		
	}

}
