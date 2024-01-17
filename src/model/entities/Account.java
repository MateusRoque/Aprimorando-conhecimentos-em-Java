package model.entities;

import model.exceptions.AccountException;

public class Account {
	private Integer number;
	private String holder;
	protected Double balance;
	protected Double withDrawLimit; 
	
	public Account() {}

	public Account(Integer number, String holder, Double balance, Double withDrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount) throws AccountException {
		if(balance == 0.0) {
			throw new AccountException("conta sem saldo.");
		} else if (amount > withDrawLimit) {
			throw new AccountException("valor de saque maior que o valor do limite.");
		}
		balance -= amount + 5.0;
	}
}
