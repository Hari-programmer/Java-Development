package com.bank.service;

import java.sql.SQLException;

import com.bank.dao.Student_Bank_Dao;
import com.bank.dto.Student_Bank;

public class Studen_Bank_Service {
	
	Student_Bank_Dao dao=new Student_Bank_Dao();
	
	
	public int panalty(Student_Bank bank) {
		
		if(bank.getBalance()>=1000) {
			return 20;
		}else {
		return -15;
		}
	}
	
	public String panaltyStatus(Student_Bank bank) {
		if(bank.getBalance()>=1000) {
			return "no";
		}else {
	        return "yes";
	        		
		}	
	}
	
	public double totalbal(Student_Bank bank) {
		
		return bank.getBalance()+panalty(bank);     //it is use to code optimization 
		
		//int pan=panalty(bank);
		//double bal =bank.getBalance()+pan;       // either this way or top of the way
		//return bal;
		
		
	}
	public Student_Bank save(Student_Bank bank) throws SQLException {
		
		/*int pan=panalty(bank);
		
		String panst=panaltyStatus(bank);         // this is code optimization  to retrieve data   
		double bal=totalbal(bank);
		*/
		
		bank.setPenalty(panalty(bank));
		bank.setPenaltyStatus(panaltyStatus(bank));
		bank.setTaotalbal(totalbal(bank));
	
		return  dao.save(bank);
		
	}

}
