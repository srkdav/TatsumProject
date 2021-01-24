package com.app.models;


import com.app.pojos.Factor;
import com.app.pojos.FactorUserUsage;
import com.app.pojos.User;


public class FactorRequest {

	private User user;
	private Factor factor;
	private FactorUserUsage factorUserUsage;
	@Override
	public String toString() {
		return "FactorRequest [user=" + user + ", factor=" + factor + ", factorUserUsage=" + factorUserUsage + "]";
	}
	public FactorRequest(FactorUserUsage factorUserUsage) {
		super();
		this.factorUserUsage = factorUserUsage;
	}
	public FactorUserUsage getFactorUserUsage() {
		return factorUserUsage;
	}
	public void setFactorUserUsage(FactorUserUsage factorUserUsage) {
		this.factorUserUsage = factorUserUsage;
	}
	public FactorRequest(User user) {
		super();
		this.user = user;
	}
	public FactorRequest(Factor factor) {
		super();
		this.factor = factor;
	}

	public FactorRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Factor getFactor() {
		return factor;
	}

	public void setFactor(Factor factor) {
		this.factor = factor;
	}


	

}
