package com.cubic.loancalculator;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {

	
	static Course c;
	static Student s;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		JDBCconnect jc = new JDBCconnect(s, c);
		/*jc.createTable();*/
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("enter the course name");
			String c_name = sc.next();
			System.out.println("enter the course id ");
			int c_id = sc.nextInt();
			System.out.println("enter the professor name");
			String professor = sc.next();
			System.out.println("is this course prereQ");
			String preQ = sc.next();

			c = new Course(c_name, professor, c_id, true);
	
			Course.courselist.add(c);
			jc.insertCourseIntoDatabase(c);

			System.out.println(" do you wanna continue? yes or NO");
			String option = sc.next();
			if (option.equalsIgnoreCase("no")) {
				break;
			}
		}
		while (true) {
			System.out.println("enter the student id ");
			int s_id = sc.nextInt();
			System.out.println("enter the student name");
			String s_name = sc.next();
			System.out.println("enter the course name");
			String courseName = sc.next();
			System.out.println("enter the score");
			int score = sc.nextInt();

			s = new Student(s_id, s_name, score, Course.courselist,courseName);
			
			c.addStudent(s);
			//s.setCourse(c);
			
			jc.insertStudentIntoDatabase(s);

			System.out.println("the loan amount eligible is :" + new Loan().getAmountEligible(s));

			System.out.println(" do you wanna continue? yes or NO");

			String option = sc.next();
			if (option.equalsIgnoreCase("no")) {
				break;
			}
		}

	}
}
