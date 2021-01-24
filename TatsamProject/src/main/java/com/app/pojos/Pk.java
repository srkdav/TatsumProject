package com.app.pojos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class Pk implements Serializable{

	private static final long serialVersionUID = 1L;

	@ManyToOne
    @JoinColumn(name = "id")
	private User user;
	
	@Column(nullable = false, updatable = false)
	private int factor_id;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getFactor_id() {
		return factor_id;
	}

	public void setFactor_id(int factor_id) {
		this.factor_id = factor_id;
	}

	@Override
	public String toString() {
		return "Pk [user=" + user + ", factor_id=" + factor_id + "]";
	}

	public Pk(User user, int factor_id) {
		super();
		this.user = user;
		this.factor_id = factor_id;
	}

	public Pk() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}