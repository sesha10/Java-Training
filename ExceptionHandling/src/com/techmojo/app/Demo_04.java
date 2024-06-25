package com.techmojo.app;

public class Demo_04 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
			System.out.println(arr[i]);
		}
		try {
			System.out.println(arr[8]);			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("End");

	}
}
