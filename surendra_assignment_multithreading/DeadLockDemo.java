package com.cubic.assignment.multithreading;
//Date: 03/20/17
//Problem #2

public class DeadLockDemo {

	public static void main(String[] args) {
		String obj1="Object1 Lock 1";
		String obj2="Object2 Lock 2";
		
		Thread t1=new Thread(){
			public void run(){
				synchronized(obj1){
					System.out.println("Thread1 accessing "+obj1+"...");
				
					try {
						Thread.sleep(400);
					} catch (InterruptedException e) {
					}
				
					synchronized(obj2){
						System.out.println("Thread1 accessing "+obj2+"...");
					}
				}
			}
		};
		
		Thread t2=new Thread(){
			public void run(){
				synchronized(obj2){
					System.out.println("Thread2 accessing "+obj2+"...");
				
					try {
						Thread.sleep(400);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
					synchronized(obj1){
						System.out.println("Thread2 accessing "+obj1+"...");
					}
				}
			}
		};
		
		t1.start();
		t2.start();
	}
}
