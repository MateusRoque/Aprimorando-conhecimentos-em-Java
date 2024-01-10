package entities;

public class BankAccount {
	private int accountNumber;
	private String userName;
	private double balance;
	
	public BankAccount(int accountNumber, String userName) {
		this.accountNumber = accountNumber;
		this.userName = userName;
	}
	
	public BankAccount(int accountNumber, String userName, double balance) {
		this.accountNumber = accountNumber;
		this.userName = userName;
		this.balance = balance;
	}
	
	public void addDeposit(double valueDeposit) {
		 balance += valueDeposit;
	}
	
	public void withdraw(double valueWithdraw) {
		balance -= (valueWithdraw + 5.00);
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String toString() {
	return "Account " + getAccountNumber() + ", Holder: " + getUserName() + ", Balance: R$" + getBalance();

	}
}
