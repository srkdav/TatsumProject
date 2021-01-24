package com.app.dao;

import javax.persistence.EntityManager;
import org.hibernate.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.FactorUserUsage;
import com.app.pojos.User;


@Repository
@Transactional
public class UserCustomRepoImpl implements UserCustomRepo {
	
@Autowired
private EntityManager entityManager;


	@Override
	public User getUserbyId(int id) {

		//user object is returned as per user id.
		User user = entityManager.unwrap(Session.class).load(User.class, id);
		return user;
	}
	

	@Override
	public void saveEntries(FactorUserUsage factorUserUsage) {
		//factor_user_usage table contains the factor id,factor priority and user id. Acts as information table
		String jpql = "Insert into factor_user_usage (factor_id,factor_priority,id) values(?,?,?)";
		entityManager.createNativeQuery(jpql).setParameter(1,factorUserUsage.getId().getFactor_id()).setParameter(2,factorUserUsage.getFactor_priority()).setParameter(3, factorUserUsage.getId().getUser().getId()).executeUpdate();
	}
}
