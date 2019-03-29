package com.training.models;

public class Student {
	private int sudentId; 
	private String studentName; 
	private int marks;
	
	public Student() {}
	
	public Student(int sudentId, String studentName, int marks) {
		super();
		this.sudentId = sudentId;
		this.studentName = studentName;
		this.marks = marks;
	}
	public int getSudentId() {
		return sudentId;
	}
	public void setSudentId(int sudentId) {
		this.sudentId = sudentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [sudentId=" + sudentId + ", studentName=" + studentName + ", marks=" + marks + "]";
	} 
	
	
}
