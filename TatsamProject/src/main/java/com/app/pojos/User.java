package com.app.pojos;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity	
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@OneToMany(mappedBy="id.user")
//	@JoinColumn(name="UserFactorFK",referencedColumnName = "id")
	private Set<FactorUserUsage> factors;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String name, Set<FactorUserUsage> factors) {
		super();
		this.id = id;
		this.name = name;
		this.factors = factors;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<FactorUserUsage> getFactors() {
		return factors;
	}

	public void setFactors(Set<FactorUserUsage> factors) {
		this.factors = factors;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", factors=" + factors + "]";
	}
		

}
