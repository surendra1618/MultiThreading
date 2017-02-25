package com.cubic.loancalculator;

public class Loan {
	private double AmountEligible;
	private double interest;
	
	public double getAmountEligible(Student s) {
		if(s.getGrade().equals(Student.Grade.A)){return AmountEligible=25000;}
		else{return AmountEligible=10000;}
		}
	
	public double getInterest(double loanAmountReq) {
		if(loanAmountReq>=20000){
		return interest=8;
	}else{return interest=10;}
	}
}
