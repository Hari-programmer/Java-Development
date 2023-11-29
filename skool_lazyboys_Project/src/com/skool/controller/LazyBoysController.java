package com.skool.controller;

import java.sql.SQLException;

import com.skool.dao.LazyBoysDao;
import com.skool.dto.LazyBoys;
import com.skool.service.LazyBoysService;

public class LazyBoysController {

	public static void main(String[] args) throws SQLException {
		
		
		LazyBoys lazyBoys= new LazyBoys();
		
		lazyBoys.setId(3);
		lazyBoys.setName("venkey");
		lazyBoys.setEnglish(99);
		lazyBoys.setMaths(99);
		lazyBoys.setScience(95);
		
		
		LazyBoysService service=new  LazyBoysService();
		
		System.out.print(service.save(lazyBoys));

	}

}
