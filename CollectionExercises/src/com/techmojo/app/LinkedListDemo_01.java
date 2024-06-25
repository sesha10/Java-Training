package com.techmojo.app;

import java.util.LinkedList;

public class LinkedListDemo_01 {

	public static void main(String[] args) {
		LinkedList<String> linkList = new LinkedList<String>();
		
		linkList.add("ABC");
		linkList.add("DEF");
		linkList.add("XYZ");
		linkList.add("JKL");
		linkList.addFirst("Hello");
		
		for (String node : linkList) {
			System.out.println(node);
		}
		System.out.println("================================================");
		System.out.println(linkList.getFirst()); // Get First element
		System.out.println(linkList.getLast()); // Get Last element
		linkList.removeFirst();
		linkList.offerFirst("Headsup");
		linkList.offerLast("Bye");
		System.out.println("================================================");

		for (String node : linkList) {
			System.out.println(node);
		}
		System.out.println("-------------------------------------------------");
		Object[] arr = linkList.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-------------------------------------------------");

		linkList.removeAll(linkList);
		System.out.println(linkList.size());
	}

}
