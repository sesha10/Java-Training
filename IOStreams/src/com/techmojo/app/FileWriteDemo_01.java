package com.techmojo.app;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteDemo_01 {

	public static void main(String[] args) {
		String name = "Java Program";
		System.out.println("Welcome");
		try {
			System.out.println("Hello there!");
			FileOutputStream fo = new FileOutputStream("file1.txt");
			fo.write(name.getBytes());
			fo.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Complete");
	}
}
