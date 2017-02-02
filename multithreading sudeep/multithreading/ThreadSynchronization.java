package com.cubic.multithreading;

public class ThreadSynchronization extends Thread {

	synchronized public void alphabet() {

		char[] alpharr = { 'a', 'e', 'i', 'o', 'u' };

		for (int i = 0; i < alpharr.length; i++) {
			System.out.print(alpharr[i]+" ");
		}

	}
}

class MyThread1 extends Thread {
	ThreadSynchronization ts;

	public MyThread1(ThreadSynchronization ts) {

		this.ts = ts;
	}

	public void run() {
		ts.alphabet();

	}
}

class MyThread2 extends Thread {
	ThreadSynchronization ts;

	public MyThread2(ThreadSynchronization ts) {

		this.ts = ts;
	}

	public void run() {
		ts.alphabet();

	}

}
