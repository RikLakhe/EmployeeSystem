package edu.lfa.ajc.employeesystem.entity;

public class Salary {
	private int id;
	private Employee employee;
	private int amount;
	private int salaryDate;
	private boolean status;
	public Salary() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getSalaryDate() {
		return salaryDate;
	}
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public void setSalaryDate(int i) {
		this.salaryDate = i;
		
	}
	
	
	
	
}
