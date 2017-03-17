package com.cubic.Assignments;

import java.util.Scanner;
public class PrimeGenerator {
	void PrimeGen (int a,int b){
		for (int i=a; i<=b;i++){
			int count=0;
			for (int j=i;j>=1;j--){
				if (i%j==0){
					count=count+1;	
				}
			}
			if (count==2){
				System.out.println(i);}
		}
	}
	public static void main(String[] args) {
	System.out.println("Enter the lowest number..");
	Scanner first_num = new Scanner(System.in);
	int a=first_num.nextInt();
	System.out.println("Enter the upper number..");
	Scanner second_num = new Scanner(System.in);
	int b=second_num.nextInt();
	PrimeGenerator P=new PrimeGenerator();
	P.PrimeGen(a,b);
	}

}
