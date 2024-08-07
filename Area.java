package com.it.bd.JavaBasics;
import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//area of a triangle
		double base, height, area;
		System.out.println("Enter base value: ");
		base = input.nextDouble();
		System.out.println("Base is "+base);
		
		System.out.println("Enter height value: ");
		height = input.nextDouble();
		System.out.println("Height is "+height);
		
		area = 0.5*base*height;
		System.out.println("area is: "+area);
		
		//area of a circle
		double radius;
		System.out.println("Enter the value of r: ");
		radius = input.nextDouble();
		System.out.println("value of r: "+radius);
		area =3.1416*radius*radius;
		System.out.println("area of circle: "+area);

	}

}
