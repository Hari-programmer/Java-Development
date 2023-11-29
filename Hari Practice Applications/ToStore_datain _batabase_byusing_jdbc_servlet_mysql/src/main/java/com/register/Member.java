package com.register;

public class Member {
	private String  name;
	private  String pass;
	private  String email;
	private  String phone;
	
	

	public Member() {
		super();
	}


	public Member(String name, String pass, String email, String phone) {
		super();
		this.name = name;
		this.pass = pass;
		this.email = email;
		this.phone = phone;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	


}
