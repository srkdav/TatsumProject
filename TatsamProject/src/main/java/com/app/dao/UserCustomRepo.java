package com.app.dao;

import com.app.pojos.FactorUserUsage;
import com.app.pojos.User;

public interface UserCustomRepo {

	//get user object by user id.
	public User getUserbyId(int id);
	
	//save all entries.
	public void saveEntries(FactorUserUsage factorUserUsage);
}
