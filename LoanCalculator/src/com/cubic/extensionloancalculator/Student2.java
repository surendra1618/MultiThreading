package com.cubic.extensionloancalculator;

import com.cubic.loancalculator.Course;
import com.cubic.loancalculator.Student.Grade;

public class Student2 {

	public int SID;
    public String SName;
	public Course2 course;
	public  int Score;
	
	
	public Student2(int sID, String sName, Course2 course, int score) {
		super();
		SID = sID;
		SName = sName;
		this.course = course;
		Score = score;
	}
	enum Grade {
		A,B,C,D
	}
	public  Grade getGrade(){
		if(Score>90){return Grade.A;}
		else if(Score>80&&Score<90){return Grade.B;}
		else	if(Score>70&&Score<80){return Grade.C;}
		else return Grade.D;
		
	}
	@Override
	public String toString() {
		return "     " + SID + "      " + SName + "      " + Score + "      " + getGrade() + "";
	}
	
	
}
