package com.cubic.multithreading;

public class TestThreadSynch {

	public static void main(String[] args) {
		ThreadSynchronization ts=new ThreadSynchronization();
		
   MyThread1 t1=new MyThread1(ts);
   MyThread1 t2=new MyThread1(ts);
   
    t1.start();
    t2.start();
	}

}
