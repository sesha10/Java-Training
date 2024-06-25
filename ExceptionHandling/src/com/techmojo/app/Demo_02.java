package com.techmojo.app;

public class Demo_02 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
			System.out.println(arr[i]);
		}
		System.out.println("End");
		System.out.println(arr[8]);

	}
}
