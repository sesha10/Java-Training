package com.techmojo.app;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.techmojo.beans.Student;

public class SerializeDemo_01 {

	public static void main(String[] args) {
		Student student = new Student(101, "yoda", "yoda@jedi.com");
		System.out.println("Started");
		try {
			FileOutputStream fo = new FileOutputStream("student.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fo);
			oos.writeObject(student);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Done");
	}

}
