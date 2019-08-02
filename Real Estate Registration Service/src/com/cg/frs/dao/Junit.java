package com.cg.frs.dao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.cg.frs.dto.FlatOwner;



public class Junit {
	FlatOwner l=new FlatOwner(1,"Vaishali","9023002122");
	FlatRegistrationDAOImpl d=new FlatRegistrationDAOImpl();
	

	@Test
public	void getOwnerId()
	{
		//long OwnerId= d.getOwnerId(l);
		//System.out.println(OwnerId);
		assertEquals(1,l );
	}

	
}
