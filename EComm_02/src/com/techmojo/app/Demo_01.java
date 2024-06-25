package com.techmojo.app;

import com.techmojo.service.Shopping;

public class Demo_01 {

	public static void main(String[] args) {
		Shopping shopping = new Shopping();
		double myAccountBal = 2000;
		double prodCost = 3000;
		
		try {
			myAccountBal = shopping.buyProduct(myAccountBal, prodCost);			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(myAccountBal);
	}

}
