package com.cubic.multi.training;

public class Nepal {


	
	static synchronized void Alphabet() throws InterruptedException{
		
		char[] alpharr={'a','e','i','o','u'};
		
		for(int a=0;a<alpharr.length;a++){
			
			System.out.print(alpharr[a]+" ");
			
			
				Thread.sleep(1000);			
			
		}
		
	}
}

