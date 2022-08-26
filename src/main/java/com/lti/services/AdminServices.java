package com.lti.services;

import java.util.List;

import com.lti.entity.Admin;
import com.lti.entity.Claim;
import com.lti.entity.MotorInsurance;

public interface AdminServices {

	public boolean authenticate(String username,String password);
	public Claim approveClaim(int claimNo);
	public void/*Insurance*/ approveInsurance();
	public Admin createAdmin(Admin admin);
	public List<Claim> getClaimList();
	public List<MotorInsurance> getInsuranceList();
	
}
