package com.training.generics.bestpractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.training.models.Student;

/**
 * 
 * @author Naveen
 * @see This program is to show working of iterator with user defined object and list iterators  
 * ListIterators help us to iterate in reverse way, it is possible with the help of 
 * list iterator we can modify the data in the list, print it in reverse order 
 */
public class IteratorDemo {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>(Arrays.asList(
				new Student(101, "Jack", 77), 
				new Student(344, "Peter", 34), 
				new Student(444, "Ranga", 55), 
				new Student(121, "Madhu", 88) 
				
				)); 

		// original content, and remember you cannot modify the list  
		System.out.println("Original contents of student list");
		System.out.println("-----------------------------------------------------");

		Iterator<Student> studentItr = studentList.iterator(); 
		while(studentItr.hasNext()) {
			System.out.println(studentItr.next());
		}
		System.out.println();
		System.out.println("Iterating the list with ListIterator ");
		System.out.println("-----------------------------------------------------");
		
		ListIterator<Student> studentListItr = studentList.listIterator();
		
		while(studentListItr.hasNext()) {
			Student temp = studentListItr.next(); 
			System.out.println(temp);
			temp.setStudentName(temp.getStudentName().toUpperCase());
			studentListItr.set(temp);
		}
		System.out.println();

		System.out.println("Print modified list in reverse order ");
		System.out.println("-----------------------------------------------------");

		
		while(studentListItr.hasPrevious()) {
			Student temp = studentListItr.previous(); 
			System.out.println(temp);
		}
		
	}
}
