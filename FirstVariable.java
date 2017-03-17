package com.java.second;

public class FirstVariable {

	int a = 10;
	static int b = 20;
	
	
	void read(){
		
		System.out.println("the value of a is...."+a);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstVariable i = new FirstVariable();
		
		int c = 30;
		System.out.println("print the value of b..."+b);
		System.out.println( "print the value of a is..." +i.a);
		
		i.read();
		
	}

}
