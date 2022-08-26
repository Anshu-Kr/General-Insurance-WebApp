package com.lti.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.entity.Claim;

@Repository
public interface ClaimRepository extends JpaRepository<Claim, Integer>{

}
