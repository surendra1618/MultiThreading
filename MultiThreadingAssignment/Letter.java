package com.cubic.assignment;

public class Letter {
	
	static  synchronized void Alphabet() throws InterruptedException {
	
	char[] alpharr = { 'a', 'e','i', 'o', 'u'};
		
		for (int i = 0; i < alpharr.length; i++){
			System.out.println(alpharr[i]);
			
			Thread.sleep(300);
		}
	}
}
