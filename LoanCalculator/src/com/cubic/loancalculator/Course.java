package com.cubic.loancalculator;

import java.util.ArrayList;
import java.util.Scanner;

public class Course {

	public String c_name;
	String professor;
	int c_id;
	public boolean IspreReq;

	ArrayList<Student> studentlist = new ArrayList<>();
	static ArrayList<Course> courselist = new ArrayList<>();
	public Course(String c_name, String professor, int c_id, boolean ispreReq) {
		super();
		this.c_name = c_name;
		this.professor = professor;
		this.c_id = c_id;
		IspreReq = ispreReq;
		
	}
	

	protected  void addStudent(Student s) {
	
		 if(s.course != null)
		 {
			if(c_name.equalsIgnoreCase(s.course.c_name)){
		studentlist.add(s);}
	}
	
	else
		System.out.println("Exception");
	}
	protected void removeStudent(Student s) {
		studentlist.remove(s);
	}

	
	}
