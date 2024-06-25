package com.techmojo.service;

public class Shopping {
	public double buyProduct(double balance, double prodCost) throws Exception {
		double updateBal;
		try {
			if (balance < prodCost) {
				Exception ae = new Exception("Balance insufficient");
				throw ae;
			}
			updateBal = balance - prodCost;			
		}
		finally {
			System.out.println("Continue to interact with bank");
		}
		return updateBal;
	}
}
