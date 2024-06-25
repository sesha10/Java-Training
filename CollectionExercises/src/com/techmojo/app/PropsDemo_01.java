package com.techmojo.app;

import java.util.Properties;

public class PropsDemo_01 {

	public static void main(String[] args) {
		Properties props = new Properties();
		props.setProperty("Name", "Yoda");
		props.setProperty("Email", "yoda@jedi");
		
		System.out.println(props);
		System.out.println(props.getProperty("Name"));
	}

}
