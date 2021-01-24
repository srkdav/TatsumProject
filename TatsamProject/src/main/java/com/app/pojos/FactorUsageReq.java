package com.app.pojos;

public class FactorUsageReq {
	private int factor_id;
	private int user_id;
	private int factor_score;
	
	@Override
	public String toString() {
		return "FactorUsageReq [factor_id=" + factor_id + ", user_id=" + user_id + ", factor_score=" + factor_score
				+ "]";
	}

	public int getFactor_id() {
		return factor_id;
	}

	public void setFactor_id(int factor_id) {
		this.factor_id = factor_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getFactor_score() {
		return factor_score;
	}

	public void setFactor_score(int factor_score) {
		this.factor_score = factor_score;
	}

	public FactorUsageReq(int factor_id, int user_id, int factor_score) {
		super();
		this.factor_id = factor_id;
		this.user_id = user_id;
		this.factor_score = factor_score;
	}

	public FactorUsageReq() {
		super();
		// TODO Auto-generated constructor stub
	}

}
