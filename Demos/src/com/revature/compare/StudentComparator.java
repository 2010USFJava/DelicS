package com.revature.compare;
import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{
	//2nd method of comparing- implement Comparator interface
	//compare students by GPA
	
	public int compare(Student arg0, Student arg1) {
		return ((int)((arg0.getGpa()*100)-(arg1.getGpa()*100)));
	}
}
