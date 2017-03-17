package com.cubic.training37;

public class Account {
	String cust_name;
	int acc_no;

	public Account(String cust_name, int acc_no) {

		this.cust_name = cust_name;
		this.acc_no = acc_no;
		System.out.println( "Customer Name       :"+cust_name);
		System.out.println("Account Number       :"+ acc_no);
	}

}
