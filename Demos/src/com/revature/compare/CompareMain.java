package com.revature.compare;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


public class CompareMain {
	public static void main(String[] args) {
		List<Student> studentList= new ArrayList<Student>();
		studentList.addAll(Arrays.asList(
				new Student[] {
				new Student(9,"Matt",7.22),
				new Student(18,"Heermance", 4.0),
				new Student(6,"Esrat",76.9),
				new Student(9,"Matt",7.22),
				new Student(9,"Matt",7.22), 
				new Student(9,"Matt",7.22)
		}));
		System.out.println("Original list");
		for (Student s: studentList) {
			System.out.println(s);
		}
		System.out.println("==============");
		Collections.sort(studentList);
		System.out.println("Sorted by STudentID");
		for(Student s: studentList) {
			System.out.println(s);
		}
		System.out.println("===============");
		Collections.sort(studentList, new StudentComparator());
		System.out.println("Sorted by GPA");
		for(Student s: studentList) {
			System.out.println(s);
		}
		System.out.println("========");
		System.out.println("Sorted by label using lambda");
		Collections.sort(studentList,(arg0,arg1)
			->{
				return arg0.getLabel().compareTo(arg1.getLabel());
			}
			);
		for(Student s: studentList) {
			System.out.println(s);
		}
	}
}

