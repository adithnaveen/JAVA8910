package com.training.generics.demo;

import com.training.models.Student;


/**
 * 
 * @author Naveen
 * @see Program to show working of generics, the idea behind to show this program is the 
 * Class Generic has type <T> which can any type, but there is a class called GenericTrainee
 * which extends from class Generic<T>, type safes to <Student> class this is to ensure that 
 * the GenericTrainee will take only class of Student. 
 * 
 * In the main class we invoke GenericTrainee(student) object, it works all good if you try to 
 * pass any other object then this gives error 
 * 
 */

class SomeOtherClass{}


public class Client {
	public static void main(String[] args) {
		Student student = new Student(); 
		student.setSudentId(101);
		student.setStudentName("Kanchan"); 
		student.setMarks(78);
		
		GenericTrainee trainee = new GenericTrainee(student); 
		trainee.printGrade();
		
		
		// this will show error, in further classes we will show how either that class 
		// or the family of classes can be used, with wild card characters.  
//		GenericTrainee trainee1 = new GenericTrainee(new SomeOtherClass()); 
	}
}
