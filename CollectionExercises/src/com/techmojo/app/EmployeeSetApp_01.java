package com.techmojo.app;

import java.util.TreeSet;

import com.techmojo.beans.Employee;

public class EmployeeSetApp_01 {

	public static void main(String[] args) {
		TreeSet<Employee> employees = new TreeSet<Employee>();
		employees.add(new Employee(101, "yoda", "yoda@jedi"));
		employees.add(new Employee(103, "kenobi", "kenobi@jedi"));
		employees.add(new Employee(102, "anakin", "anakin@jedi"));
		employees.add(new Employee(104, "jolee", "jolee@jedi"));
		employees.add(new Employee(101, "revan", "revan@jedi"));
		employees.add(new Employee(106, "malak", "malak@jedi"));
		
		System.out.println(employees.size());
		
		System.out.println("Existing");
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

}
