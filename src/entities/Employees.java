package entities;

public class Employees {
	private int id;
	private String name;
	private double salary;
	private Integer hours;
	private Double valuePerHour;
	
	public Employees(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	public Employees(String name, Integer hours, double valuePerHour) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}

	public Double payment() {
		return valuePerHour * hours;
	}
	public Integer getHours() {
		return hours;
	}


	public void setHours(Integer hours) {
		this.hours = hours;
	}


	public double getValuePerHour() {
		return valuePerHour;
	}


	public void setValuePerHour(double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public void promotionSalary(double percentage) {
		this.salary += this.salary * percentage / 100;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}	
	
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
}
