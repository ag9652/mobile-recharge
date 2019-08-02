package com.capgemini.takehome.DAO;

import java.util.Map;

import com.capgemini.takehome.Bean.Product;
import com.capgemini.takehome.Util.CollectionUtil;

public class ProductDAO implements IProductDAO{
CollectionUtil c= new CollectionUtil();
int a1,k1;
Map<Integer, Product> w1=c.CollectionsUtil();

	public int getQuantity(int q1, int a1)
	{
		// TODO Auto-generated method stub
		Product pr1=(Product)w1.get(a1);
		int dep1 = pr1.getProductPrice();
		k1=dep1*q1;
		return k1;
	}

	public Product getProductDetails(int a13) 
	{
		// TODO Auto-generated method stub
		return (Product) w1.get(a13);
	}
	public boolean geterror(Long a12)
	{
		if(w1.containsKey(a12))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public boolean geterror(int a12) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
