package com.techmojo.app;

import java.util.TreeMap;
import java.util.TreeSet;

import com.techmojo.beans.Student;
import com.techmojo.beans.StudentIdComparator;

public class StudentSetApp_01 {

	public static void main(String[] args) {
		TreeSet<Student> students = new TreeSet<Student>(new StudentIdComparator());
		students.add(new Student(101, "yoda", "yoda@jedi"));
		students.add(new Student(106, "yoda", "yoda@jedi"));
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
		
		System.out.println("========================================================");
		System.out.println("With maps");
		
		TreeMap<Integer, Student> tmap = new TreeMap<Integer, Student>();
		for (Student student : students) {
			tmap.put(student.getId(), student);
		}
		
		for (Integer sid : tmap.keySet()) {
			System.out.println(sid + " " + tmap.get(sid));
		}
	}

}
