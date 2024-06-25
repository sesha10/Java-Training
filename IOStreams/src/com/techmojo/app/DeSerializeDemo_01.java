package com.techmojo.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.techmojo.beans.Student;

public class DeSerializeDemo_01 {

	public static void main(String[] args) {
		try {
			FileInputStream fi = new FileInputStream("student.dat");
			ObjectInputStream ois = new ObjectInputStream(fi);
			Student student = (Student)ois.readObject();
			System.out.println("Deserialised");
			System.out.println(student);
			ois.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done");
	}

}
