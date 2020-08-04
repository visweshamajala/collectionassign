package collectionsassignment.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import collectionsassignment.bean.Employee;

public class Dao implements Idao{
//	Set<Employee> employees = new HashSet<Employee>();
	List <Employee> empl = new ArrayList<Employee>();
	@Override
	public void createEmployee(Employee employee) {
		empl.add(employee);
		System.out.println("account successfully created");
		
	}
	public List <Employee> getEmployees(){
		return empl;
	}
	
//	@Override
//	public List <Employee> getEmployees() {
//		List<Employee> list = new ArrayList<Employee>(employees); 
//       
//		// TODO Auto-generated method stub
//		return  list;
//	}

}
