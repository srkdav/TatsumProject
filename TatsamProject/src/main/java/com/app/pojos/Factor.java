package com.app.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity	
public class Factor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int factor_id;
	private String factor_name;
	public Factor() {
		super();
		// TODO Auto-generated constructor stub
	}
public Factor(int factor_id, String factor_name) {
	super();
	this.factor_id = factor_id;
	this.factor_name = factor_name;
}
@Override
public String toString() {
	return "Factor [factor_id=" + factor_id + ", factor_name=" + factor_name + "]";
}
public int getFactor_id() {
	return factor_id;
}
public void setFactor_id(int factor_id) {
	this.factor_id = factor_id;
}
public String getFactor_name() {
	return factor_name;
}
public void setFactor_name(String factor_name) {
	this.factor_name = factor_name;
}
	

}
