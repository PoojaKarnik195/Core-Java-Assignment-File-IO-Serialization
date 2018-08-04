package com.capgemini.myclass;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Pooja Karnik Program to perform serialization and deserialization on
 *         employee class
 *
 */
//MyClass class contains the employee fields along with getters, setters and toString methods
public class MyClass implements Serializable {

	private static final long serialVersionUID = -1388699691194419344L;
	int id;
	String EmployeeName;
	double salary;

	// employee constructor with 3 parameters created
	public MyClass(int id, String EmployeeName, double salary) {
		this.id = id;
		this.EmployeeName = EmployeeName;
		this.salary = salary;
	}

	// creating getter and setter methods for employee id, name and salary
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// creating toString method to print employee id, name and salary
	@Override
	public String toString() {
		return "MyClass [id=" + id + ", EmployeeName=" + EmployeeName + ", salary=" + salary + "]";
	}
}