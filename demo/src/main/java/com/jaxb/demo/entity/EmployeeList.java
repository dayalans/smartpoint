package com.jaxb.demo.entity;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="employeeList")
public class EmployeeList {
	private ArrayList<Employee> listEmployee;
	 @XmlElement(name = "employee")
	public ArrayList<Employee> getListEmployee() {
		return listEmployee;
	}

	public void setListEmployee(ArrayList<Employee> listEmployee) {
		this.listEmployee = listEmployee;
	}
	
	

}
