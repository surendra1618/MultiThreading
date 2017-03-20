package com.cubic.assignment.multithreading;
//Date: 3/20/17
//Problem #1 part 1/4

import java.util.Arrays;

public class ThreadingSynchronization{
	public synchronized void alphabet(){
		char[] alpharr={'a','e','i','o','u'};
		for(int i=0;i<alpharr.length;i++){
			System.out.print(alpharr[i]);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
	}
}
