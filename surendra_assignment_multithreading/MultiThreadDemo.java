package com.cubic.assignment.multithreading;
//Date: 3/20/17
//Problem #1 part 4/4

public class MultiThreadDemo {

	public static void main(String[] args) {
		ThreadingSynchronization t=new ThreadingSynchronization();
		MyThread1 t1=new MyThread1(t);
		MyThread2 t2=new MyThread2(t);
		
		t1.start();
		t2.start();
	}

}
