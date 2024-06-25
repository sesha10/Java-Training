package com.techmojo.app;

public class SplitString {

	public static void main(String[] args) {
		String sent = "ABC, DEF, XYZ";
		
		String[] x = sent.split(", ");
		
		for (String st : x) {
			System.out.println(st);
		}
	}

}
