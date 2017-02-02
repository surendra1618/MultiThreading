package com.cubic.assignments;

public class Threadtwo extends Thread {
	
	
	public void run(){
		
		try {
			Letter.Alphabet();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
