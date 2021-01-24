package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.FactorUserUsage;
import com.app.pojos.Pk;

public interface FactorUsageRepo extends JpaRepository<FactorUserUsage, Pk>{

}
