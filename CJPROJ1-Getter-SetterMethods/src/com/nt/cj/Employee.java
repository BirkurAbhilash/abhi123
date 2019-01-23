package com.nt.cj;
public class Employee 
{
	private int employeeID;
	private EmployeeDetails ed;
	private BankDetails bd;	
	
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public EmployeeDetails getEd() {
		return ed;
	}
	public void setEd(EmployeeDetails ed) {
		this.ed = ed;
	}
	public BankDetails getBd() {
		return bd;
	}
	public void setBd(BankDetails bd) {
		this.bd = bd;
	}
	
	
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", ed=" + ed + ", bd=" + bd + "]";
	}
}

