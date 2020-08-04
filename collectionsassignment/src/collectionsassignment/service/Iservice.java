package collectionsassignment.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import collectionsassignment.bean.Address;
import collectionsassignment.bean.Employee;

public interface Iservice {
public boolean validateid(String employeeId);
public boolean validatefname(String firstName);
public boolean validatelname(String lastName);
public boolean validatesalary(double salary);
public boolean validatedoj(LocalDate dateOfjoining);
public void createEmployee(Employee employee);
public List<Employee> getEmployees();

}
