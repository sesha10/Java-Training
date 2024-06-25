package com.techmojo.app;

public class Demo_03 {

	public static void main(String[] args) {
		int a=5;
		int b=3;
		try {
			int c=a/b;			
			System.out.println(c);
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		
		System.out.println("End");

	}

}
