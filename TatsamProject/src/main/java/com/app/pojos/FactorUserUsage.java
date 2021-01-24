package com.app.pojos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class FactorUserUsage implements Serializable{


	private static final long serialVersionUID = 1L;

	//composite key called id. Uses combination of user and factor id.
	@EmbeddedId
    private Pk id;
	
    private int factor_priority;

	public FactorUserUsage(Pk id, int factor_priority) {
		super();
		this.id = id;
		this.factor_priority = factor_priority;
	}

	public FactorUserUsage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pk getId() {
		return id;
	}

	public void setId(Pk id) {
		this.id = id;
	}

	public int getFactor_priority() {
		return factor_priority;
	}

	public void setFactor_priority(int factor_priority) {
		this.factor_priority = factor_priority;
	}

//	@Override
//	public String toString() {
//		return "FactorUserUsage [id=" + id + ", factor_priority=" + factor_priority + "]";
//	}
    
    
}
