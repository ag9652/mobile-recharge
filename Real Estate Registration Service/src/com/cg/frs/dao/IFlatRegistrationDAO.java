package com.cg.frs.dao;

import java.util.ArrayList;

import com.cg.dto.FlatRegistrationDTO;
import com.cg.frs.dto.FlatOwner;
import com.cg.frs.dto.RegistrationDetails;

public interface IFlatRegistrationDAO {
	FlatRegistrationDTO registerDTO(RegistrationDetails a);
	ArrayList<FlatOwner> getAllOwnerIds();

}
