package com.techmojo.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import com.techmojo.beans.Student;

public class StudentOperations {
	public void processStudent(String st1, String st2) {
		try {
			FileOutputStream fo = new FileOutputStream(st2);
			BufferedReader br = new BufferedReader(new FileReader(st1));
			String line;
		    while ((line = br.readLine()) != null) {
		       // process the line.
		    	String[] st = line.split(",");
		    	int sid = Integer.parseInt(st[0]);
		    	int s1 = Integer.parseInt(st[3].trim());
		    	int s2 = Integer.parseInt(st[4].trim());
		    	int s3 = Integer.parseInt(st[5].trim());
		    	
		    	Student student = new Student(sid, st[1], st[2], s1, s2, s3);
		    	fo.write(student.toCsv().getBytes());
		    	fo.write(10);
		    }
		    br.close();
		    fo.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
