package com.techmojo;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techmojo.entity.Employee;
import com.techmojo.exception.InvalidEmployeeIdException;
import com.techmojo.service.EmployeeService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring.xml");
        EmployeeService employeeService = ctxt.getBean(EmployeeService.class);
//        Employee employee1 = new Employee("Yoda", "yoda@jedi.com", "Grandmaster");
//        Employee employee2 = new Employee("Windu", "windu@jedi.com", "Master");
//        Employee employee3 = new Employee("Kenobi", "kenobi@jedi.com", "Master");
//        Employee employee4 = new Employee("Anakin", "anakin@jedi.com", "Knight");
//        System.out.println("Before saving: " + employee1);
//        Employee savedEmployee = employeeService.recruit(employee1);
//        System.out.println("After saving: " + savedEmployee);
//        employeeService.recruit(employee2);
//        employeeService.recruit(employee3);
//        employeeService.recruit(employee4);
        
        try {
			Employee e1 = employeeService.searchEmployee(4);
			System.out.println(e1);
			e1.setDesignation("Master");
			employeeService.promote(e1);
			List<Employee> employees = employeeService.listOfEmployees();
			for (Employee employee : employees) {
				System.out.println(employee);
			}
			Employee e2 = employeeService.searchEmployee(101);
			System.out.println(e2);
		} catch (InvalidEmployeeIdException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
        System.out.println("End of App");
    }
}
