package com.cubic.assignments;

public  class Mythread1 extends Thread {

	public  void run() {

		try {
			Letter.Alphabet();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
