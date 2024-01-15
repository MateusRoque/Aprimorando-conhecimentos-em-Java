package entities;

public class legalPerson extends Person{
	private Integer numberEmployees;
	private Double tax;

	public legalPerson(String name, Double annualIncome, Integer numberEmployees) {
		super(name, annualIncome);
		this.numberEmployees = numberEmployees;
	}

	public Integer getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(Integer numberEmployees) {
		this.numberEmployees = numberEmployees;
	}

	@Override
	public Double taxes() {
		if(this.numberEmployees > 10) {
			return tax = this.annualIncome * 0.14;
		} else {
			return tax = this.annualIncome * 0.16;
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + ": $" + this.tax;
	}
	
}
