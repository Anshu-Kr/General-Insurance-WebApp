package com.lti.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.entity.MotorInsurance;

@Repository
public interface MotorInsuranceRepository extends JpaRepository<MotorInsurance, Integer>{
	
}
