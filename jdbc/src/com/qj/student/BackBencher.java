package com.qj.student;

public class BackBencher {
	private  int no;
	private  String name;
	private  String purpose; 
	private int age;
	private String sex;
	private  String city;
	private int contactno;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getContactno() {
		return contactno;
	}
	public void setContactno(int contactno) {
		this.contactno = contactno;
	}
	@Override
	public String toString() {
		return "BackBencher [no=" + no + ", name=" + name + ", purpose=" + purpose + ", age=" + age + ", sex=" + sex
				+ ", city=" + city + ", contactno=" + contactno + "]";
	}

	
	
	
	

}
