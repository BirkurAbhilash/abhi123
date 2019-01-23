package com.nt.cj;

class BankDetails
{
	private int accNo;
	private String name;
	private int balance;
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	@Override
	public String toString() {
		return "BankDetails [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	}
