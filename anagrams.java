package com.breign.assesment;

import java.util.Arrays;

public class anagrams {
	
	
	

	public static void main(String[] args) {
		String s1="arezoo";
		String s2="oozrae";
        String[] s3=s1.split("");
        String[] s4=s2.split("");
		
		if(s3.length!=s4.length){
			
			System.out.println("its not anagrams sorry");

		
		}
			
			char [] s5=s1.toCharArray();
			char [] s6=s2.toCharArray();
			
			Arrays.sort(s5);
			Arrays.sort(s6);
			
			
			if(Arrays.equals(s5, s6)){
			System.out.println("this words are anagrams .");
		}else{
			
			System.out.println("sorry its not anagrams");
		}

	}

}
