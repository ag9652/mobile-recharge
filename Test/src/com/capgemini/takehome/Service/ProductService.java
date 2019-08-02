package com.capgemini.takehome.Service;

import com.capgemini.takehome.Bean.Product;
import com.capgemini.takehome.DAO.ProductDAO;

public class ProductService implements IProductService {
	ProductDAO d =new ProductDAO();
	public Product getProductDetails(int a1)
	{
		Product p2=d.getProductDetails(a1);
		return p2;
	}
	public int getQuantity(int q1,int a1)
	{
		int p3=d.getQuantity(q1,a1);
		return p3;
		
	}
	public boolean geterror(int a12)
	{

		boolean p3=d.geterror(a12);
		return p3;
		
	}
}
