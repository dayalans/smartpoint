package com.jaxb.demo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaxb.demo.entity.Employee;
import com.jaxb.demo.entity.EmployeeList;
import com.jaxb.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	private static final String EMPLOYEE_XML = "employee.xml";
	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees() {
		
		ArrayList<Employee> employeeList=employeeRepository.findAllByOrderByEmployeeSalaryDesc();
		EmployeeList empList=new EmployeeList();
		empList.setListEmployee(employeeList);
		 JAXBContext context;
		try {
			context = JAXBContext.newInstance(EmployeeList.class);
			 Marshaller m = context.createMarshaller();
		        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

		        // Write to System.out
		        m.marshal(empList, System.out);

		        // Write to File
		        m.marshal(empList, new File(EMPLOYEE_XML));
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       
		
		return null;
		
	}
	
	

}
