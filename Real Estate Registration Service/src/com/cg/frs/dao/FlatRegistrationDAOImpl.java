package com.cg.frs.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cg.dto.FlatRegistrationDTO;
import com.cg.frs.dto.FlatOwner;
import com.cg.frs.dto.RegistrationDetails;

public class FlatRegistrationDAOImpl implements IFlatRegistrationDAO{
	static Map<Integer, FlatOwner> owners = new HashMap<>();
	Map<Integer, RegistrationDetails>flatDetails = new HashMap<>();
	private static List<RegistrationDetails> l = new ArrayList<RegistrationDetails>();
	private static ArrayList<FlatOwner> al = new ArrayList<FlatOwner>();
	
	static{
		
		owners.put(1,new FlatOwner(1,"vaishali","9023002122"));
		owners.put(2,new FlatOwner(2,"Meghna","964221234"));
		owners.put(3,new FlatOwner(3,"Manish","5453221234"));
		
		
		
	}
	@Override
	public ArrayList<FlatOwner> getAllOwnerIds() {
		for(Map.Entry<Integer, FlatOwner> entry:owners.entrySet())
		{
		al.add(entry.getValue());	
	}
		return  al;
	}

	@Override
	public FlatRegistrationDTO registerDTO(RegistrationDetails a) {
		flatDetails.put(a.getFlatRegistrationNumber(), a);
		for(Map.Entry<Integer, RegistrationDetails> entry:flatDetails.entrySet())
		{
		l.add(entry.getValue());
		
	}
		System.out.println("Flat successfully registered. Registration id:<"+a.getFlatRegistrationNumber()+">");
		System.out.println(l);
		
		return null;
	}
	

}
