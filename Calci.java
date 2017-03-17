package com.cubic.assignment.demo;

import java.util.Scanner;

public class Calci {
	void pow(int a, int b){
		
	int total= (int) Math.pow(a, b);
	System.out.println(total);
	}
	

	public static void main(String[] args) {
		
		Scanner mcb= new Scanner(System.in);
		System.out.println("Enter a and b");
		int a = 0;
		int b=0;
		try {
			a=mcb.nextInt();
			if(a<0){
				throw new Exception("The value of a must be positive");
			}
			b=mcb.nextInt();
			if(b<0){
				throw new Exception("The value of b must be positive");
			}
		}
		
		catch (Exception e) {
			
		System.out.println(e);
		}
		Calci ci=new Calci();
		System.out.println("The estimated value");
		ci.pow(a, b);
		
		
		
		
		
	}

}
