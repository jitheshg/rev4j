package com.jg.rev4j.vo;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private String firstName;
	private String lastName;
	private String empId;
	
	private List<Department> departments;
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the empId
	 */
	public String getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	/**
	 * @return the departments
	 */
	public List<Department> getDepartments() {
		if (departments == null) {
			setDepartments(new ArrayList<Department>());
		}
		return departments;
	}
	/**
	 * @param departments the departments to set
	 */
	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}
	
	
}
