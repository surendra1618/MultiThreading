package com.cubic.extensionloancalculator;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import com.cubic.loancalculator.JDBCconnect;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Extension {

	String option;
	
	public void input(){
		System.out.println(" choose the Course from the list below\n1.Java\n2.PHP\n3.UI\n4.Mathematics");
		Scanner sc = new Scanner(System.in);
		 option = sc.next();

	}
	public Course2 courseObjectCreatoin() throws ClassNotFoundException, SQLException {
		
		Course2 course = null;
		Connection conn = JDBCconnect.getConnection();
		System.out.println("connection established");
		Statement st = conn.createStatement();
		
		ResultSet rs1 = st.executeQuery("select * from Course100");

		

		while (rs1.next()) {
			if (option.equals(rs1.getString(2))) {
				course = new Course2(rs1.getString(2), rs1.getString(3), rs1.getInt(1), true);

			}
		}
		conn.close();
		System.out.println("connection closed");
		return course;

	}

	public void  getStudents(Course2 course) throws ClassNotFoundException, SQLException {
		
		Connection conn = JDBCconnect.getConnection();
		System.out.println("connection established");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from Student100");
		
		while(rs.next()){
			if(course.c_id==rs.getInt(5)){
				Student2 student=new Student2(rs.getInt(1), rs.getString(2), course, rs.getInt(3));
				Course2.studentlist.add(student);
			}
		}
conn.close();
System.out.println("connection closed");
	}

}
