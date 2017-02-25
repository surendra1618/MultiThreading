package com.cubic.extensionloancalculator;

import java.util.Comparator;

public class GradeComparator  implements Comparator<Student2>{
	
	@Override
	public int compare(Student2 o1, Student2 o2) {
		Student2 s1=(Student2)o1;  
		Student2 s2=(Student2)o2;  	
		return s1.getGrade().compareTo(s2.getGrade());
	}  

}
