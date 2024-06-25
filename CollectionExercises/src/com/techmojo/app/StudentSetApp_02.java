package com.techmojo.app;

import java.util.HashSet;

import com.techmojo.beans.Student;

public class StudentSetApp_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Student> students = new HashSet<Student>();
		students.add(new Student(101, "yoda", "yoda@jedi"));
		students.add(new Student(101, "yoda", "yoda@jedi"));
		students.add(new Student(103, "kenobi", "kenobi@jedi"));
		students.add(new Student(102, "anakin", "anakin@jedi"));
		students.add(new Student(104, "jolee", "jolee@jedi"));
		students.add(new Student(101, "revan", "revan@jedi"));
		students.add(new Student(106, "malak", "malak@jedi"));
		
		System.out.println(students.size());
		
		System.out.println("Existing");
		for (Student student : students) {
			System.out.println(student);
		}
	}

}
