package collectionsassignment.bean;

import java.time.LocalDate;
import java.util.Set;

public class Employee {
private String employeeId;
private String firstName;
private String lastName;
private double salary; 
private LocalDate dateOfjoining;
private Department department;
private Set<Address> Address;
public String getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(String employeeId) {
	this.employeeId = employeeId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public LocalDate getDateOfjoining() {
	return dateOfjoining;
}
public void setDateOfjoining(LocalDate dateOfjoining) {
	this.dateOfjoining = dateOfjoining;
}
public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}
public Set<Address> getAddress() {
	return Address;
}
public void setAddress(Set<Address> address) {
	Address = address;
}
@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", salary="
			+ salary + ", dateOfjoining=" + dateOfjoining + ", department=" + department + ", Address=" + Address + "]";
}
public Employee(String employeeId, String firstName, String lastName, double salary, LocalDate dateOfjoining,
		Department department, Set<collectionsassignment.bean.Address> address) {
	super();
	this.employeeId = employeeId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.salary = salary;
	this.dateOfjoining = dateOfjoining;
	this.department = department;
	Address = address;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}


}
