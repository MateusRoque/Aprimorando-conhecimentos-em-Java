package model.entities;

public class CurrencyConverter {
	public static double IOF = 0.06;
	
	public static double valueDollar(double dollar, double amount) {
		return  (dollar * amount) * (1.0 + IOF);
	}; 
}
