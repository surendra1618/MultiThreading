package com.cubic.assignment;

public class Thread2 extends Thread {
		
	public void run() {
			
			try {
				Letter.Alphabet();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
