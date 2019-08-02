package com.capgemini.takehome.Bean;

public class Product {
	
private long Productid;
private String ProductName;
private String ProductCategory;
private String Description;
private int ProductPrice;

public Product(long productid, String productName, String productCategory, String description, int productPrice) {
	super();
	Productid = productid;
	ProductName = productName;
	ProductCategory = productCategory;
	Description = description;
	ProductPrice = productPrice;
	
}
@Override
public String toString() {
	return "\nProductid=" + Productid + ", \nProductName=" + ProductName + ",\n ProductCategory=" + ProductCategory
			+ ", \nDescription=" + Description + ", \nProductPrice=" + ProductPrice + 
			 "";
}
public long getProductid() {
	return Productid;
}
public void setProductid(long productid) {
	Productid = productid;
}
public String getProductName() {
	return ProductName;
}
public void setProductName(String productName) {
	ProductName = productName;
}
public String getProductCategory() {
	return ProductCategory;
}
public void setProductCategory(String productCategory) {
	ProductCategory = productCategory;
}
public String getDescription() {
	return Description;
}
public void setDescription(String description) {
	Description = description;
}
public int getProductPrice() {
	return ProductPrice;
}
public void setProductPrice(int productPrice) {
	ProductPrice = productPrice;
}

}
