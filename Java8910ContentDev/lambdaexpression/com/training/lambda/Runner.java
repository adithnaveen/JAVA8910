package com.training.lambda;

public class Runner{
	public void run(SimpleExecutable se) {
		System.out.println("Hi I'm in run method");
		System.out.println("Simploe executable TODO Goes Here");
		se.execute(); 
	}
	
	public void run(Executable e){
		System.out.println("Executable blcok called... ");
		int val = 100;
		int val2 = 200;
		int returnValue = e.execute(val, val2);
		System.out.println("Returned Value got is " + returnValue);
	}
	
	public void run(StringExecutable se){
		System.out.println("Execute String Block Called... ");
		String str = se.stringExecute("hello", "World");
		System.out.println("Contact String is " + str);
	}
}
