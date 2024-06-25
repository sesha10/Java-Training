package com.techmojo.app;

import java.util.ArrayList;

public class ArrayListDemo_01 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("ABC");
		names.add("DEF");
		names.add("XYZ");
		names.add("JKL");
		int numNames = names.size();
		System.out.println("Num of names added : " + numNames);
		for (int i = 0; i < numNames; i++) {
			System.out.println(names.get(i));			
		}
		
		for (String name : names) {
			System.out.println(name);
		}
	}

}
