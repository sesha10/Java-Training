package com.techmojo.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadDemo_01 {

	public static void main(String[] args) {
		System.out.println("Welcome");
		try {
			System.out.println("Hello there!");
			FileInputStream fo = new FileInputStream("file1.txt");
			System.out.println(new String(fo.readAllBytes()));
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
