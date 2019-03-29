package com.training.generics.demo;

import java.util.ArrayList;
import java.util.List;

import com.training.models.Student;

public class GenericTrainee extends Generic<Student> {

	public GenericTrainee(Student object) {
		super(object);
	}

	@Override
	public Student getObject() {
		return object;
	}

	public void printGrade() {
		if (this.object.getMarks() < 40) {
			System.out.println(this.object.getStudentName() + ", got Grade: D");
		} else if (this.object.getMarks() >= 40 && this.object.getMarks() < 50) {
			System.out.println(this.object.getStudentName() + ", got Grade: C");
		} else if (this.object.getMarks() >= 50 && this.object.getMarks() < 80) {
			System.out.println(this.object.getStudentName() + ", got Grade: B");
		} else {
			System.out.println(this.object.getStudentName() + ", got Grade: A");
		}
	}
}
