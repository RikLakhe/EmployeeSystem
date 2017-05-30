package edu.lfa.ajc.employeesystem.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.lfa.ajc.employeesystem.dao.EmployeeDAO;
import edu.lfa.ajc.employeesystem.entity.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{
	Scanner input = new Scanner(System.in);
	private List<Employee> empl =new ArrayList<>();
	@Override
	public boolean insert(Employee e) {
		empl.add(e);
		
		return true;
	}

	@Override
	public boolean update(int id) {
		
		return false;
	}

	@Override
	public boolean delete(int id) {
		for(Employee ev : empl){
			if(ev.getEmpID()== id){
				empl.remove(empl.indexOf(ev));
				return true;
			}
		}
		return false;
	}

	@Override
	public Employee getById(int id) {
		for(Employee ev : empl){
			if(ev.getEmpID()==id){
				return ev;
				
			}
		}
		return null;
	}

	@Override
	public List<Employee> getAll() {
		return empl;
	}

}
