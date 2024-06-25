package com.techmojo.beans;

public class ContEmployee extends Employee {
	double payPerHr;

	public ContEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContEmployee(int id, String name, String email, double payPerHr) {
		super(id, name, email);
		this.payPerHr = payPerHr;
	}

	public double getPayPerHr() {
		return payPerHr;
	}

	public void setPayPerHr(double payPerHr) {
		this.payPerHr = payPerHr;
	}

	@Override
	public String toString() {
		return "ContEmployee ["+ super.toString() + ", payPerHr=" + payPerHr + "]";
	}
	
	
}
