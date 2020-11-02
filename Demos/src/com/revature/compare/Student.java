package com.revature.compare;

public class Student implements Comparable<Student>{

	private int studentId;
	private String label;
	private int gpa;
	
	public Student() {
		
	}
	public Student(int studentId, String label, int gpa) {
		super();
		this.studentId = studentId;
		this.label = label;
		this.gpa = gpa;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public int getGpa() {
		return gpa;
	}
	public void setGpa(int gpa) {
		this.gpa = gpa;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", label=" + label + ", gpa=" + gpa + "]";
	}
	
	//compare by student ID
	public int compareTo(Student arg0) {
		return this.getStudentID()-arg0.getStudentId();
	}
}
