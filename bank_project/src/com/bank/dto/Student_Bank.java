package com.bank.dto;

public class Student_Bank {
	private int sno;
	private String holderName ;
	private int accNo;
	private double balance;
	private int penalty;
	private String penaltyStatus;
	private double taotalbal;
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getPenalty() {
		return penalty;
	}
	public void setPenalty(int penalty) {
		this.penalty = penalty;
	}
	public String getPenaltyStatus() {
		return penaltyStatus;
	}
	public void setPenaltyStatus(String penaltyStatus) {
		this.penaltyStatus = penaltyStatus;
	}
	public double getTaotalbal() {
		return taotalbal;
	}
	public void setTaotalbal(double taotalbal) {
		this.taotalbal = taotalbal;
	}
	
	@Override
	public String toString() {
		return "Student_Bank [sno=" + sno + ", holderName=" + holderName + ", accNo=" + accNo + ", balance=" + balance
				+ ", penalty=" + penalty + ", penaltyStatus=" + penaltyStatus + ", taotalbal=" + taotalbal + "]";
	}
	
	
	
	
	
	

}
