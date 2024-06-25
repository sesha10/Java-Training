package com.techmojo.service;

public class Shopping {
	public double buyProduct(double balance, double prodCost) {
		double updateBal;
		try {
			if (balance < prodCost) {
				ArithmeticException ae = new ArithmeticException("Balance insufficient");
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
