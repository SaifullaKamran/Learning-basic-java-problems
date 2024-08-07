package com.it.bd.JavaBasics;

public class ArrayExample {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};
		double[] values = {1.5,2.5,3.5,4.5,5.5};
		String[] names= {"rahim","karim","kamal","jamal","afzal"};
		System.out.println("Total number is: "+numbers.length);
		System.out.println("Total value is: "+values.length);
		System.out.println("Total name is: "+names.length);
		
		System.out.println(numbers[2]);
		System.out.println(values[3]);
		System.out.println(names[4]);
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		for(int i=0; i<values.length; i++) {
			System.out.println(values[i]);
		}
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}

	}

}
