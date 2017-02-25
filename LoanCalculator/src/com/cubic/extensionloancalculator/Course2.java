package com.cubic.extensionloancalculator;

import java.util.ArrayList;

import com.cubic.loancalculator.Student;

public class Course2{

	public String c_name;
	String professor;
	int c_id;
	public boolean IspreReq;

static	ArrayList<Student2> studentlist=new ArrayList<>();
	
	public Course2(String c_name, String professor, int c_id, boolean ispreReq) {
		super();
		this.c_name = c_name;
		this.professor = professor;
		this.c_id = c_id;
		IspreReq = ispreReq;
		
	}
	
}
