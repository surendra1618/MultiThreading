package com.cubic.assignment.multithreading;
//Date: 3/20/17
//Problem #1  part 3/4

public class MyThread2 extends Thread{
	ThreadingSynchronization t;
	
	public MyThread2(ThreadingSynchronization t){
		this.t=t;
	}
	
	public void run(){
		t.alphabet();
	}

}
