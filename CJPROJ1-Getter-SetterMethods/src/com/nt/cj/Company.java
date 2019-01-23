package com.nt.cj;

public class Company {

	public static void main(String[] args) {
		Employee emp  = new Employee();
		emp.setEmployeeID(101);
		//createin employeeDetails object and storing values
		EmployeeDetails eDetails = new EmployeeDetails();
		eDetails.setEid(1001);
		eDetails.setName("abhilash");
		eDetails.setDesg("software");
		emp.setEd(eDetails);
      		
		//createing Bank Details object and storing values
		BankDetails bDetails  = new BankDetails();
		bDetails.setAccNo(141414);
		bDetails.setName("abhialsh");
		bDetails.setBalance(22000);
		emp.setBd(bDetails);
		
		//displayin the objects
		System.out.println("Employee EmployeeId:   "+emp.getEmployeeID());
		System.out.println("Employee EmployeeDetails   :"+emp.getEd().getEid());
		System.out.println("Employee EmployeeDetails   :"+emp.getEd().getName());
		System.out.println("Employee EmployeeDetails    :"+emp.getEd().getDesg());
		System.out.println("Employee BankDetails:    "+emp.getBd().getAccNo());
		System.out.println("Employee BankDetails:    "+emp.getBd().getName());
		System.out.println("Employee BankDetails:    "+emp.getBd().getBalance());

	}

}
