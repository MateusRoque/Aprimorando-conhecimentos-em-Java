package entities;

public abstract class Person {
	String name;
	int age;
	double height;
	protected Double annualIncome;
	
	public Person(String name, int age, double heigh) {
		this.name = name;
		this.age = age;
		this.height = heigh;
	}
	
	public Person(String name, Double annualIncome) {
		this.name = name;
		this.annualIncome = annualIncome;
	}
	
	public abstract Double taxes();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
}
