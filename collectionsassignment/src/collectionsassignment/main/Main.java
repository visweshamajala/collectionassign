package collectionsassignment.main;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import collectionsassignment.bean.Address;
import collectionsassignment.bean.Department;
import collectionsassignment.bean.Employee;
import collectionsassignment.dao.Dao;
import collectionsassignment.dao.Idao;
import collectionsassignment.service.Iservice;
import collectionsassignment.service.Service;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Iservice i = new Service();
	//Employee e =new Employee();
	Employee e =null;
	Idao id=new Dao();
	
	Department d=new Department();
	Set<Address> a=new HashSet<Address>();
	
	while(true) {
	System.out.println("1. To create an Employee");
	System.out.println("2. Sort By Employee ID");
	System.out.println("3. Sort By First Name");
	System.out.println("4. Sort By Last Name");
	System.out.println("5. Sort By Salary");
	System.out.println("6. Sort By Address");
	System.out.println("7. Sort By Department");
	System.out.println("8. Exit");
	
	switch(sc.nextInt()) {
	case 1:
		e=new Employee();
		System.out.println("enter employee id");
		String employeeId = sc.next();
		if(i.validateid(employeeId)) {
			e.setEmployeeId(employeeId);
			
			
		}
		else {
			System.out.println("please enter proper id");
			break;
		}
		System.out.println("enter firstname");
		String firstName=sc.next();
		if(i.validatefname(firstName)) {
			e.setFirstName(firstName);
			
		}else {
			System.out.println("please enter proper firstname");
			break;
		}
		System.out.println("enter lastname");
		String lastName=sc.next();
		if(i.validatelname(lastName)) {
			e.setLastName(lastName);
			
		}else {
			System.out.println("please enter proper lastname");
			break;
		}
		System.out.println("enter salary amt");
		double salary=sc.nextDouble();
		if(i.validatesalary(salary)) {
			e.setSalary(salary);
		}
		else {
			System.out.println("enter proper salary amt");
			break;
		}
		System.out.println("enter date of joining 'yyyy-MM-dd' ");
	  String dateOfjoining=sc.next();
	  LocalDate z=LocalDate.parse(dateOfjoining);
	  if(i.validatedoj(z)) {
		  e.setDateOfjoining(z);
	  }
	  else {
		  System.out.println("please enter valid date format");
	  }
	  System.out.println("enter dapartment id");
	  String deptId=sc.next();
	  d.setDeptId(deptId);
	  System.out.println("enter dapartment name");
	  String deptName=sc.next();
	  d.setDeptName(deptName);
	  System.out.println("enter location");
	  String location =sc.next();
	  d.setLocation(location);
	  e.setDepartment(d);
	  System.out.println("enter no. of addresses employee have");
	  
	  System.out.println("Enter the no. of address");
		int n = sc.nextInt();
		
		for(int b=0;b<n;b++) {
			Address address = new Address();
			System.out.println("Enter address Id : ");
			address.setAddressId(sc.nextInt());
			System.out.println("Enter address line1 : ");
			address.setAddressLine1(sc.next());
			System.out.println("Enter city : ");
			address.setCity(sc.next());
			System.out.println("Enter state : ");
			address.setState(sc.next());
			a.add(address);
		}
		e.setAddress(a);
		
		i.createEmployee(e);
		e=null;         
	    break;
	
	case 2 : 
		System.out.println("Sort By EmployeeId in ascending order :");
		Comparator<Employee> sortById = new Comparator<Employee>() {
			
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getEmployeeId().compareTo(o2.getEmployeeId());
			}
		};
	
        
		Collections.sort(i.getEmployees(),sortById);
		for(Employee emp : i.getEmployees())
			System.out.println(emp);
		break;
	
		
	case 3:System.out.println("sort by firstname");
	Comparator<Employee> fnamesort = new Comparator<Employee>() {
		
		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			
			return o1.getFirstName().compareTo(o2.getFirstName());
		}
		};
		Collections.sort(i.getEmployees(),fnamesort);
		for(Employee emp:i.getEmployees()) 
			System.out.println(emp);
			break;
	case 4:System.out.println("sort by lastname");
	Comparator<Employee> lnamesort = new Comparator<Employee>() {
		
		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			
			return o1.getLastName().compareTo(o2.getLastName());
		}
		};
		Collections.sort(i.getEmployees(),lnamesort);
		for(Employee emp:i.getEmployees()) 
			System.out.println(emp);
	case 5 : 
		System.out.println("Sort By Salary in descending order : ");
		Comparator<Employee> salsort = new Comparator<Employee>() {
			public int compare(Employee o1, Employee o2) {
				if(o1.getSalary()<o2.getSalary())
					return 1;
				else if(o1.getSalary()>o2.getSalary())
					return -1;
				else
					return 0;
			}
		};
		Collections.sort(i.getEmployees(), salsort);
		for(Employee emp : i.getEmployees())
			System.out.println(emp);
		break;
	case 6:System.out.println("sort by address");

case 7 :
		System.out.println("Sort By Dept Id");
		Comparator<Employee> sortByDeptId = new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getDepartment().getDeptId().compareTo(o2.getDepartment().getDeptId());
			}
		};
		Collections.sort(i.getEmployees(), sortByDeptId);
		for(Employee emp : i.getEmployees())
			System.out.println(emp);
		
		System.out.println("Sort By Dept name");
		Comparator<Employee> sortByDeptName = new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getDepartment().getDeptName().compareToIgnoreCase(o2.getDepartment().getDeptName());
			}
		};
		Collections.sort(i.getEmployees(), sortByDeptName);
		for(Employee emp : i.getEmployees())
			System.out.println(emp);
		break;

		
		
	}
	
	
	
	}
	
	
	
	
	
	}
}







