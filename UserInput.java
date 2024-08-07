package com.it.bd.JavaBasics;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);      //for different data-types we have to intput different Scanner classs
		Scanner input1= new Scanner(System.in);
		
		int id;
		System.out.print("Enter id: ");
		id = input.nextInt();
		System.out.println("id is "+id);
		
		String tittle;
		System.out.println("Enter the tittle: ");
		tittle =input1.nextLine();
		System.out.println("Tittle is: "+tittle);
		
		String price;
		System.out.println("Enter the price: ");
		price = input1.nextLine();
		System.out.println("Price is: "+price);
		
		String description;
		System.out.println("Provide any description: ");
		description = input1.nextLine();
		System.out.println("Description is: "+description);
		
		String category;
		System.out.println("Please mention category: ");
		category = input1.nextLine();
		System.out.println("Category is: "+category);
	}

}
