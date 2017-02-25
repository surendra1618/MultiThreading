package com.cubic.loancalculator;

import java.sql.*;

public class JDBCconnect {

	private Student s;
	private Course c;

	public JDBCconnect(Student s, Course c) {
		this.s = s;
		this.c = c;
	}

	public static Connection getConnection() throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "bataka222");
		return conn;
	}

	public static void createTable() throws ClassNotFoundException, SQLException {
		Connection conn = getConnection();

		Statement st = conn.createStatement();

		
		 st.executeUpdate("create table Student100(SID number(6) ,Sname varchar2(20),Score number(4),Grade varchar(3))"); 
		 st.executeUpdate("create table Course100(CID number(6) primary key,Cname varchar2(20),Professor varchar2(20),ispreq varchar(10))"); 
		 st.executeUpdate("alter table Student100 add CourseID number(6) REFERENCES Course100(CID)");
		 conn.close();
		 }

	public void insertCourseIntoDatabase(Course c) throws SQLException, ClassNotFoundException {

		Connection conn = getConnection();
		Statement st = conn.createStatement();
		PreparedStatement pst2 = conn.prepareStatement(" insert into  Course100 values(?,?,?,?)");

		pst2.setInt(1, c.c_id);

		pst2.setString(2, c.c_name);

		pst2.setString(3, c.professor);

		pst2.setString(4, "true");

		pst2.executeUpdate();
		conn.close();
	}

	public void insertStudentIntoDatabase(Student s) throws SQLException, ClassNotFoundException {

		Connection conn = getConnection();
		PreparedStatement pst1 = conn.prepareStatement(" insert into  Student100 values(?,?,?,?,?)");

		pst1.setInt(1, s.SID);

		pst1.setString(2, s.SName);

		pst1.setInt(5, s.course.c_id);

		pst1.setInt(3, s.Score);

		pst1.setString(4, s.getGrade().toString());

		pst1.executeUpdate();
		conn.close();
	}

	

}
