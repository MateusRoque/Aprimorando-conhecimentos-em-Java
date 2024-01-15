package entities;

public class PhysicalPerson extends Person{
	private Double healthCare;
	private Double tax;
	
	public PhysicalPerson(String name, Double annualIncome, Double healthCare) {
		super(name, annualIncome);
		this.healthCare = healthCare;
	}

	public Double getHealthCare() {
		return healthCare;
	}

	public void setHealthCare(Double healthCare) {
		this.healthCare = healthCare;
	}
	
	@Override
	public Double taxes() {
		if(this.annualIncome < 20000.00) {
			return tax = (this.annualIncome * 0.15) - (this.healthCare * 0.50);
		} else {
			return tax = (this.annualIncome * 0.25) - (this.healthCare * 0.50);
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + ": $" + this.tax;
	}
}
