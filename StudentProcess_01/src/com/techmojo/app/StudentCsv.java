package com.techmojo.app;

import com.techmojo.service.StudentOperations;

public class StudentCsv {

	public static void main(String[] args) {
		// Take details from csvfile and add sum marks and name in another csv file. Total marks to be calc in student class
		// Failed records in another file
		StudentOperations studOps = new StudentOperations();
		System.out.println("Starting process");
		studOps.processStudent("file1.txt", "file2.txt");
		System.out.println("Completed process");
	}

}
