package com.techmojo.app;

import com.techmojo.beans.Student;

public class StudentApp_01 {

	public static void main(String[] args) {
		Student student1 = new Student(101, "ABC", 90, 90, 92);
		Student student2 = new Student();
		
		student2.setId(102);
		student2.setName("XYZ");
		student2.setSub1(80);
		student2.setSub2(81);
		student2.setSub3(82);
		
		System.out.println("Name : " + student1.getName() +
				", Total : " + student1.getTotal() +
				", Average : " + student1.getAverage());
		
		System.out.println("Name : " + student2.getName() +
				", Total : " + student2.getTotal() +
				", Average : " + student2.getAverage());

	}

}
