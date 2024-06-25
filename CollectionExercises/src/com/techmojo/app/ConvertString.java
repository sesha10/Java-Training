package com.techmojo.app;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertString {

	public static void main(String[] args) {
		String date = "20/06/2024";
		try {
			Date dt = new SimpleDateFormat("dd/MM/yyyy").parse(date);
			System.out.println(dt);
			String dtnew = DateFormat.getDateInstance().format(dt);
			String dt_new = DateFormat.getDateInstance(3).format(dt);
			System.out.println(dtnew);
			System.out.println(dt_new);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
	}

}
