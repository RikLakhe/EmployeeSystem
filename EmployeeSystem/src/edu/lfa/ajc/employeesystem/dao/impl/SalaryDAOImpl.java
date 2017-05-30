package edu.lfa.ajc.employeesystem.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.lfa.ajc.employeesystem.dao.SalaryDAO;
import edu.lfa.ajc.employeesystem.entity.Employee;
import edu.lfa.ajc.employeesystem.entity.Salary;

public class SalaryDAOImpl implements SalaryDAO{
	List<Salary> sal = new ArrayList<>();
	List<Employee> empl = new ArrayList<>();
	Scanner input = new Scanner(System.in);
	@Override
	public boolean insert(Salary t) {
		sal.add(t);
		return false;
	}
	@Override
	public boolean update(int id) {
		for(Salary sal: sal){
			if (id==sal.getEmployee().getEmpID()){
				System.out.println("1. Id: "+sal.getEmployee().getEmpID());
				System.out.println("2. First name: "+sal.getEmployee().getEmpFName());
				System.out.println("3. Last name:"+sal.getEmployee().getEmpLName());
				System.out.println("4. Phone Number:"+sal.getEmployee().getEmpPNum());
				System.out.println("5. Position:"+sal.getEmployee().getEmpPosi());
				System.out.println("6. Service:"+sal.getEmployee().getEmpSer());
				System.out.println("7. Amount:"+sal.getAmount());
				System.out.println("8. Date:" +sal.getSalaryDate());
				System.out.println("Update which data [1,2,3,4,5,6,7]");
				switch(input.nextInt()){
				case 1:
					System.out.println("New data :");
					sal.getEmployee().setEmpID(input.nextInt());
					break;
				case 2:
					System.out.println("New data :");
					sal.getEmployee().setEmpFName(input.next());
					break;
				case 3:
					System.out.println("New data :");
					sal.getEmployee().setEmpLName(input.next());
					break;
				case 4:
					System.out.println("New data :");
					sal.getEmployee().setEmpPNum(input.nextInt());
					break;
				case 5:
					System.out.println("New data :");
					sal.getEmployee().setEmpPosi(input.next());
					break;
				case 6:
					System.out.println("New data :");
					sal.getEmployee().setEmpSer(input.nextInt());
					break;
				case 7:
					System.out.println("New data :");
					sal.setAmount(input.nextInt());;
				case 8:
					System.out.println("New data :");
					sal.setSalaryDate(input.nextInt());
				default:
					System.out.println("Error!!!");
					break;
				
				}return true;
				
			}
		}
		return false;
	}
	@Override
	public boolean delete(int id) {
		for(Salary sal : sal){
			if(sal.getId()==id){
				empl.remove(empl.indexOf(sal));
				return true;
			}
		}
		return false;
	}
	@Override
	public Salary getById(int id) {
		for(Salary sal : sal){
			if(sal.getId()==id){
				return sal;
				
			}
		}
		return null;
	}
	@Override
	public List<Salary> getAll() {
		return sal;
	}
	
}
