package com.capgemini.xyz.service;

import com.capgemini.xyz.bean.Customer;
import com.capgemini.xyz.bean.Loan;

public interface IloanService {
	public Customer validateCustomer(Customer customer);
	public long insertCust(Customer cust); 
	public double calculateEMI(double amount, int duration);
	public Loan applyLoan(Loan loan);


}