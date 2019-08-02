package com.cg.frs.service;

import java.util.ArrayList;

import com.cg.dto.FlatRegistrationDTO;
import com.cg.frs.dao.FlatRegistrationDAOImpl;
import com.cg.frs.dao.IFlatRegistrationDAO;
import com.cg.frs.dto.FlatOwner;
import com.cg.frs.dto.RegistrationDetails;

public class FlatRegistrationServiceImpl implements IFlatRegistrationService {
	private IFlatRegistrationDAO d = new FlatRegistrationDAOImpl() ;
		
		

	@Override
	public ArrayList<FlatOwner> getAllOwnerIds() {
		
		return d.getAllOwnerIds();
	}

	@Override
	public FlatRegistrationDTO registerFlat(RegistrationDetails a) {
		d.registerDTO(a);
		return null;
	}
	

}
