package com.cubic.loancalculator;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	public int SID;
    public String SName;
	public Course course;
	public  int Score;
	
	public Student(int sID, String sName, int score,ArrayList<Course> c,String cname) {
		super();
		SID = sID;
		SName = sName;
		for(Course li : c)
		{
			if(li.c_name.equals(cname))
				this.course = li;
			
		}
		
		
		Score = score;
	}
	
	public enum Grade {
		A,B,C,D
	}
	
	/*public void setCourse(Course course){
		
			
		
	if(this.course.c_name.equalsIgnoreCase(course.c_name))
			this.course=course;
		}*/
	

	
	public  Grade getGrade(){
		if(Score>90){return Grade.A;}
		else if(Score>80&&Score<90){return Grade.B;}
		else	if(Score>70&&Score<80){return Grade.C;}
		else return Grade.D;
		
	}
	
	
}
