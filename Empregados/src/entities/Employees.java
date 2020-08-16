package entities;

public class Employees {
	private Integer id;
	private  String name;
	private double salary;
	
	
	
	
	public Employees() {
		
	}




	public Employees(Integer id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}




	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
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




	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
	public void PercentageSlary(double percentage) {
		salary = salary + salary + percentage / 100.0;
	}
	
	

}
