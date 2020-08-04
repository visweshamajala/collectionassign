package collectionsassignment.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import collectionsassignment.bean.Address;
import collectionsassignment.bean.Employee;
import collectionsassignment.dao.Dao;
import collectionsassignment.dao.Idao;


public class Service implements Iservice {
	Idao idao =new Dao();
	@Override
	public  boolean validateid(String employeeId) {
		String regex = "^[0-9]{5}_[A-Z]{2}$";
		return employeeId.matches(regex);
		
	}

	@Override
	public boolean validatefname(String firstName) {
		return firstName.matches("^[A-Za-z]{3,}$");
		
	}

	@Override
	public boolean validatelname(String lastName) {
		return lastName.matches("^[A-Za-z]{3,}$");
	}

	@Override
	public boolean validatesalary(double salary) {
		return salary>20000&&salary<500000;
	}

	@Override
	public boolean validatedoj(LocalDate dateOfjoining) {
		int x = dateOfjoining.compareTo(LocalDate.now());
		return (x>=0);
		
		
	}

	@Override
	public void createEmployee(Employee employee) {
	idao.createEmployee(employee);
		
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return idao.getEmployees();
	}

	

}
