package com.cubic.extensionloancalculator;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.cubic.loancalculator.JDBCconnect;

public class Test {
	
	public static void ListofStudent() throws ClassNotFoundException, SQLException{

		
		
		for (Student2 st: Course2.studentlist) {
			System.out.println(st);
			
		}
	}
	
	public static void failedStudent(Course2 course){
		int count=0;
		for (Student2 student : Course2.studentlist) {
			if(student.Score<40)
				count++;
			}
		System.out.println("Number of students who failed is.... "+count);
	}
public static void highestGrade(){
	Collections.sort(Course2.studentlist, new GradeComparator());
	System.out.println("Highest Grade achieved by any student in that course is ......"+Course2.studentlist.get(0).getGrade());
}
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

          Extension e=new Extension();
		
          e.input();
          
		 e.getStudents(e.courseObjectCreatoin());
		
		 ListofStudent();
		 
		 failedStudent(e.courseObjectCreatoin());
		 
		 highestGrade();
		 
	
	
		
		
		
		
		
	}
}
