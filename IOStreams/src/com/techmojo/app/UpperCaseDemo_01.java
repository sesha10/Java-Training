package com.techmojo.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UpperCaseDemo_01 {

	public static void main(String[] args) {
		System.out.println("Welcome");
		try {
			System.out.println("Hello there!");
			FileInputStream fi = new FileInputStream("file1.txt");
			String int_st = new String(fi.readAllBytes());
			fi.close();
			
			int_st = int_st.toUpperCase();
			
			FileOutputStream fo = new FileOutputStream("file2.txt");
			fo.write(int_st.getBytes());
			fo.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Completed");
	}
}
