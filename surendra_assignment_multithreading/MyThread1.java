package com.cubic.assignment.multithreading;
//Date: 3/20/17
//Problem #1 part 2/4

public class MyThread1 extends Thread {
	ThreadingSynchronization t;
	public MyThread1(ThreadingSynchronization t){
		this.t=t;
	}
	
	public void run(){
		t.alphabet();
	}

}
