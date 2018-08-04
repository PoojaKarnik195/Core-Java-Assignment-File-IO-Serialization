package com.capgemini.employee;

import java.io.Serializable;

/**
 * @author Pooja Karnik Program to perform serialization and deserialization on
 *         employee class
 *
 */
//employee class contains the employee fields along with getters, setters and toString methods
public class Employee implements Serializable {

	// creating toString method to print employee id, name and salary
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", salary=" + salary + "]";
	}

	private static final long serialVersionUID = -7950124817348919469L;
	private int id;
	private String empName;
	private float salary;

	// creating getter and setter methods for employee id, name and salary
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	// employee constructor with 3 parameters created
	Employee(int id, String empName, float salary) {
		this.id = id;
		this.empName = empName;
		this.salary = salary;
	}
}
