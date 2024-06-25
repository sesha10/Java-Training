package com.techmojo.app;

import org.apache.log4j.Logger;

import com.techmojo.exception.InsufficientFundException;
import com.techmojo.service.Shopping;

public class Demo_01 {
	static Logger logger = Logger.getLogger(Demo_01.class);
	public static void main(String[] args) {
		Shopping shopping = new Shopping();
		double myAccountBal = 2000;
		double prodCost = 3000;
		
		try {
			logger.warn("Calling buyProduct with args bal and cost");
			myAccountBal = shopping.buyProduct(myAccountBal, prodCost);		
			logger.warn("buyProduct executed and done");
		}
		catch (InsufficientFundException e) {
			logger.error(e);
		}
		System.out.println(myAccountBal);
	}

}
