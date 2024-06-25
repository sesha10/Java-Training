package com.techmojo.app;

import com.techmojo.beans.ContEmployee;
import com.techmojo.beans.Employee;
import com.techmojo.beans.RegEmployee;

public class EmployeeApp_01 {

	public static void main(String[] args) {
		Employee employee1 = new Employee(101, "Kenobi", "kenobi@jedi.com");
		System.out.println(employee1);
		
		RegEmployee regEmployee = new RegEmployee(101, "Yoda", "yoda@jedi.com", 10000);
		System.out.println(regEmployee);
		
		ContEmployee contEmployee = new ContEmployee(102, "ashoka", "ashoka@force.com", 1000);
		System.out.println(contEmployee);
		
	}
}
