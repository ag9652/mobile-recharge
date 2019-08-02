package com.capgemini.takehome.Ui;

import java.util.Scanner;
import java.util.regex.Pattern;

import com.capgemini.takehome.Bean.Product;
import com.capgemini.takehome.Service.ProductService;


public class Client {
	ProductService s = new ProductService();
	   Scanner sc = new Scanner(System.in);
	   
	   
	   void stmt()
	   {
		   System.out.println("1.Generate bill by entering product code and Quantity");
		   System.out.println("2.Exit");
	   }   
	   void choice()
	   {
	  
	 do {
		  stmt();
			Scanner sc = new Scanner(System.in);
			int n=sc.nextInt();
	
			int a1 = 0;
			switch(n)
			{
			case 1:
				System.out.println("*********Enter product details*********");
				System.out.println("Enter the product code");
				a1=sc.nextInt();		
				boolean b11=s.geterror(a1);
				 if(b11= true)
				 {
						 Product p1=s.getProductDetails(a1);
						 System.out.println("product details");
						 //System.out.println(p1);
						 System.out.println("enter the quantity");
						 int q1=sc.nextInt();
						 System.out.println(p1);
						 System.out.println("quantity"+q1);
						 int p2=s.getQuantity(q1, a1);
						 System.out.println("Line total (Rs)"+p2);
				 }
				 else
				 {
					 System.out.println("sorry ! The product code<<product code>>is not available");
					 
				 }
				 break;
			case 2:
				System.out.println("Thank you, Have a nice Day");
				choice();
				break;
			}
	  }while(true);
	 	
}
	 
	   public static void main(String[] args) {
		Client a=new Client();
		a.choice();
	}
}
