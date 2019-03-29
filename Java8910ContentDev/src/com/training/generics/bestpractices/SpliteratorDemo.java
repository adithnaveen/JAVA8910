package com.training.generics.bestpractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

import com.training.models.Student;

/**
 * 
 * @author Naveen
 * @see program to show working of spilterator,  this offers substantially more 
 * functionality than does either Iterator or ListIterator, most important 
 * aspect of Spliterator is its ability to provide support for parallel 
 * iteration, you can still use spliterator even if you wont be using paralleled  
 * execution, it offers a streamlined approach that combines hasNext and next operations  
 * 
 * 
 * https://docs.oracle.com/javase/8/docs/api/java/util/Spliterators.html
 */
public class SpliteratorDemo {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>(Arrays.asList(
				new Student(101, "Jack", 77), 
				new Student(344, "Peter", 34), 
				new Student(444, "Ranga", 55), 
				new Student(121, "Madhu", 88) 
				)); 
		
		Spliterator<Student> spltItr = studentList.spliterator(); 
		
		// 
		while(spltItr.tryAdvance(new Consumer<Student>() {

			@Override
			public void accept(Student t) {
				System.out.println(t);
			}
		})); 
		spltItr = studentList.spliterator(); 

		
		// or you can write this, if you have problem understanding the syntax dont worry, will know
		// it in next section, in reality both does the same. 
		while(spltItr.tryAdvance(stu -> System.out.println(stu))); 
		
		/////////////////////////////////////////////////////////////////////////////
		// using forEachRemaining to display the content of the list
		// ensure you call the spliterator again, once it uses it we need an iterator 
		// back to get the data 
		
		spltItr = studentList.spliterator(); 
		System.out.println("using forEachRemaining to display the content of the list ");
		spltItr.forEachRemaining(new Consumer<Student>() {

			@Override
			public void accept(Student t) {
				System.out.println(t);
			}
		});
	}
} // end class 












