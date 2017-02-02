package com.cubic.assignments;

public class Assignment_Multithreading {

	public static void main(String[] args) {

		Mythread1 wine = new Mythread1();
		Threadtwo vodka = new Threadtwo();

		wine.start();
		vodka.start();

	}

}
