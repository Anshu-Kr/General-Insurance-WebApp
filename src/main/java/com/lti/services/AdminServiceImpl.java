package com.lti.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.AdminRepository;
import com.lti.dao.ClaimRepository;
import com.lti.dao.MotorInsuranceRepository;
import com.lti.entity.Admin;
import com.lti.entity.Claim;
import com.lti.entity.MotorInsurance;
import com.lti.exception.AdminNotFoundException;

@Service
public class AdminServiceImpl implements AdminServices {

	@Autowired
	private AdminRepository adminRepo;
	@Autowired
	private ClaimRepository claimRepo;
	@Autowired
	private MotorInsuranceRepository motorRepo;
	
	@Override
	public boolean authenticate(String username,String password) {
		// TODO Auto-generated method stub
		//System.out.println("username:"+username+" password:"+password);
		Admin ad=adminRepo.getById(username);
		//System.out.println("admin_username:"+ad.getAdmin_username());
		if(password.equals(ad.getAdmin_password())) {
			//System.out.println("password is true");
			return true;
		}
		//System.out.println("password is false");
		return false;
	}

	@Override
	public Claim approveClaim(int claimNo) {
		// TODO Auto-generated method stub
		Claim c=claimRepo.getById(claimNo);
		return c;
	}

	@Override
	public void approveInsurance() {
		// TODO Auto-generated method stub
	}

	@Override
	public List<Claim> getClaimList() {
		// TODO Auto-generated method stub
		return claimRepo.findAll();
	}

	@Override
	public List<MotorInsurance> getInsuranceList() {
		// TODO Auto-generated method stub
		return motorRepo.findAll();
	}

	
	@Override
	public Admin createAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminRepo.save(admin);
	}

}
