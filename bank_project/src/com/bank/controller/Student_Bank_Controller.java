package com.bank.controller;

import java.sql.SQLException;

import com.bank.dto.Student_Bank;
import com.bank.service.Studen_Bank_Service;


public class Student_Bank_Controller {
	
	public static void main(String [] args) throws SQLException {
	
	Student_Bank bank=new Student_Bank();
	
	bank.setSno(1);
	bank.setHolderName("Hari");
	bank.setAccNo(6463536);
	bank.setBalance(2000.0);
	
	
	
	Studen_Bank_Service service=new Studen_Bank_Service();
	
	System.out.println(service.save(bank));
	
	
}
	}
