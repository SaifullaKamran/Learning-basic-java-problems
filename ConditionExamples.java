package com.it.bd.JavaBasics;

import java.util.Scanner;

public class ConditionExamples {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		int num1, num2;
		System.out.print("Enter 1st number: ");
		num1 = input.nextInt();
	    
		System.out.print("Enter 2nd number: ");
		num2 = input.nextInt();
		
		//example of integer
		if(num1>num2) {
			System.out.println(num1+" is greater than "+num2);
		}else if (num1==num2) {
			System.out.println(num1+" equal to "+num2);
		}
		else {
			System.out.println(num1+" is smaller than "+num2);
		}
		
		//example of String
		String name1, name2, passage1,passage2;
		System.out.println("Enter first name: ");
		name1= input1.nextLine();
		System.out.println("Enter second name: ");
		name2= input1.nextLine();
		if(name1.equals(name2)) {
			System.out.println(name1+" is exact to:"+name2);
		}else {
			System.out.println("Something went wrong");
		}
		System.out.println("Enter first description: ");
		
		passage1= input1.nextLine();
		System.out.println("Enter second description: ");
		passage2= input1.nextLine();
		
		if(passage1.equalsIgnoreCase(passage2)) {
			System.out.println(passage1+" is similar to: "+passage2);
		}else{
			System.out.println("There is some mismmatch");
		}
		
	}
		
}
	



