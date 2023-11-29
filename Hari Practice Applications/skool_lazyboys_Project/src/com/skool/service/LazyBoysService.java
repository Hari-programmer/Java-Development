package com.skool.service;

import java.sql.SQLException;

import com.skool.dao.LazyBoysDao;
import com.skool.dto.LazyBoys;

public class LazyBoysService {
	    
	 
	 public double percentage(LazyBoys lazyBoys) {
		 double total =lazyBoys.getEnglish()+lazyBoys.getMaths()+lazyBoys.getScience();
		return (total/300.0)*100.0;
	 }
	 
	 public String grade(LazyBoys lazyBoys ) {
		 
		 double result=percentage(lazyBoys);
		 if(result>75) {
			 return "A+";
		 }else if(result>=60&& result<=75) {
			 return "A";		
			 }else if(result>=50&& result <=60) {
				 return "B";
			 }else if(result>=40&& result<=50) {
				 return "C";
			 }else {
				 return "Fail";
			 }
		 
	 }
public double total(LazyBoys lazyBoys) {  				// TO ADD THE MARK TO STORE THE METHOD 
	return lazyBoys.getEnglish()+lazyBoys.getMaths()+lazyBoys.getScience();
}

public LazyBoys save(LazyBoys lazyBoys) throws SQLException {
	double result =total(lazyBoys);
	double percentage =percentage(lazyBoys);
	String grade=grade(lazyBoys);
	
	//LazyBoys l2=lazyBoys;  				 			// this is  for user understanding  reference 
	
	
	lazyBoys.setResult(result);
	lazyBoys.setPercentage(percentage);
	lazyBoys.setGrade(grade);
	
	
	LazyBoysDao dao=new LazyBoysDao();
	
	return dao.save(lazyBoys);
}



}
