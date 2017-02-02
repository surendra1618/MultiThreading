package com.cubic.multithreading.assignment;

public class Thread2 extends Thread{
	
	public void run(){
		
		try {
			Vowel.Alphabet();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
