package com.it.bd.JavaBasics;

public class MethodExample {

	public void sub(double a, double b) {
		System.out.println("Subtraction: "+(a-b));
	}
    public static void sum(int x, int y) {
		System.out.println("Summation: "+(x+y));
	}
	public static void add(String firstName, String lastName) {
		System.out.println("Summation: "+(firstName+lastName));
	}
	
	public static void main(String[] args) {
		MethodExample obj = new MethodExample();
		sum(5,5);
		sum(6,6);
		sum(7,7);
		obj.sub(5.5,1.5);
		obj.sub(5.5,2.5);
		obj.sub(5.5,3.5);
		add("saifulla ","kamran");
		add("raiyan ","rahman");
		add("sarah ","fatema");

	}

}
