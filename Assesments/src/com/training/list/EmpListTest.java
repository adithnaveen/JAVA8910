package com.training.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpListTest {

	public static void main(String[] args) {
		List<Emp> empList = new ArrayList<>();
		empList.add(new Emp(234, "Sanjeev", 25));
		empList.add(new Emp(123, "Moncy", 26));
		empList.add(new Emp(546, "Bhanu", 22));
		empList.add(new Emp(278, "Priya", 21));
		empList.add(new Emp(333, "Asha", 24));
		//System.out.println(empList);
		Collections.sort(empList,new EmpComparator());
		System.out.println(empList); // sorted by age
		Collections.sort(empList,(e1,e2)->e1.getName().compareTo(e2.getName()));
		System.out.println(empList);// sorted by name using Lambda
	}

}
