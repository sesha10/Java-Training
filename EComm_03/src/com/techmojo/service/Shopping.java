package com.techmojo.service;

import org.apache.log4j.Logger;

import com.techmojo.exception.InsufficientFundException;

public class Shopping {
	Logger logger = Logger.getLogger(Shopping.class);
	public double buyProduct(double balance, double prodCost) throws InsufficientFundException {
		logger.debug("Inside the func");
		double updateBal;
		try {
			if (balance < prodCost) {
				logger.warn("Balance is lower than cost");
				InsufficientFundException ae = new InsufficientFundException("Balance insufficient");
				throw ae;
			}
			updateBal = balance - prodCost;			
			logger.debug("Balance updated");
		}
		finally {
			System.out.println("Continue to interact with bank");
		}
		logger.debug("Returning updated balance");
		return updateBal;
	}
}
