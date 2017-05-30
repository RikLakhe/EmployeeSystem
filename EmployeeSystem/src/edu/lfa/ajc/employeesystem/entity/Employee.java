package edu.lfa.ajc.employeesystem.entity;

import java.util.List;

public class Employee {
	
	private int empID,empPNum,empSer;
	private String empFName,empLName,empAdd,empPosi;
	private boolean empStat;
	private List<Salary> salaries;
	public Employee() {
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public int getEmpPNum() {
		return empPNum;
	}
	public void setEmpPNum(int empPNum) {
		this.empPNum = empPNum;
	}
	public int getEmpSer() {
		return empSer;
	}
	public void setEmpSer(int empSer) {
		this.empSer = empSer;
	}
	public String getEmpFName() {
		return empFName;
	}
	public void setEmpFName(String empFName) {
		this.empFName = empFName;
	}
	public String getEmpLName() {
		return empLName;
	}
	public void setEmpLName(String empLName) {
		this.empLName = empLName;
	}
	public String getEmpAdd() {
		return empAdd;
	}
	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}
	public String getEmpPosi() {
		return empPosi;
	}
	public void setEmpPosi(String empPosi) {
		this.empPosi = empPosi;
	}
	public boolean isEmpStat() {
		return empStat;
	}
	public void setEmpStat(boolean empStat) {
		this.empStat = empStat;
	}
	public List<Salary> getSalaries() {
		return salaries;
	}
	public void setSalaries(List<Salary> salaries) {
		this.salaries = salaries;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
