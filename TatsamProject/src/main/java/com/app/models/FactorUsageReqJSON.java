package com.app.models;

//used for parsing JSON request.
import com.app.pojos.FactorUsageReq;

public class FactorUsageReqJSON {

	private FactorUsageReq factorUsageReq;

	public FactorUsageReqJSON() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FactorUsageReqJSON(FactorUsageReq factorUsageReq) {
		super();
		this.factorUsageReq = factorUsageReq;
	}

	public FactorUsageReq getFactorUsageReq() {
		return factorUsageReq;
	}

	public void setFactorUsageReq(FactorUsageReq factorUsageReq) {
		this.factorUsageReq = factorUsageReq;
	}

	@Override
	public String toString() {
		return "FactorUsageReqJSON [factorUsageReq=" + factorUsageReq + "]";
	}
	
}
