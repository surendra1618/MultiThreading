
//Write a program with a class named ThreadingSynchronization that contains a function named Alphabet().

//Create a char array named alpharr which contains letters ‘a’,’e’,’i’,’o’,’u’ with the same order inside the Alphabet() function and print the array elements sequentially. 
//Now create two threads of this class and start those threads and observe the output.

//The output should be like below

//a e i o u a e i o u		
 
package com.cubic.multi.training;

public class ThreadingSynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread1 p= new Thread1();
Thread2 p1=new Thread2();
p.start();
p1.start();

	}

}
