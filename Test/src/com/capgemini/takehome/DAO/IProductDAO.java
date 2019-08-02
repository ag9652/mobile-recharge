package com.capgemini.takehome.DAO;

import com.capgemini.takehome.Bean.Product;

public interface IProductDAO {
	public int getQuantity(int q1, int a1);
	public Product getProductDetails(int a1);
	public boolean geterror(int a12);


}
