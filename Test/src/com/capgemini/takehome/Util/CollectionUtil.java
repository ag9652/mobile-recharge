package com.capgemini.takehome.Util;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.takehome.Bean.Product;

public class CollectionUtil {
HashMap<Integer , Product> Products= new HashMap<Integer,Product>();

public Map<Integer, Product> CollectionsUtil()
{
	Product p1= new Product(1001,"iPhone","Electronics","Smart phone", 35000);
	Product p2= new Product(1002,"LEDTV","Electronics","Television", 45000);
	Product p3= new Product(1003,"Teddy","Toys","Decorative", 800);
	Product p4= new Product(1004,"Telescope","Toys","To observe far objects", 5000);

	Products.put(1001, p1);
	Products.put(1002, p2);
	Products.put(1003, p3);
	Products.put(1004, p4);
	
return Products;
	
}
}
