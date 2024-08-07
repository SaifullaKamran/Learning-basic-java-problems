package com.it.bd.JavaBasics;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		ArrayList<String> name = new ArrayList<String>();
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		System.out.println(numbers.size());
		System.out.println(numbers);
		System.out.println(numbers.get(2));
		numbers.remove(2);
		System.out.println(numbers);
		for(int i=0; i<numbers.size();i++) {
			System.out.println(numbers.get(i));
		}
		
		name.add("rahim");
		name.add("karim");
		name.add("jamal");
		name.add("kamal");
		System.out.println(name.size());
		System.out.println(name);
		System.out.println(name.get(2));
		name.remove(2);
		System.out.println(name);
		for(int i=0; i<name.size();i++) {
			System.out.println(name.get(i));
		}
		

	}

}
