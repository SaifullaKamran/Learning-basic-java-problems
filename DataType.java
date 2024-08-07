package com.it.bd.JavaBasics;

public class DataType {
	//learning variables & data types
	public static void main(String[] args) {
		
		int id = 101; 
		String tittle = "iphone15";
		String price = "1895 euros";
		String description = "perfect product with best image quality";
		String category = "phone";
		
		System.out.println("id is= "+id);
		System.out.println("tittle is= "+tittle);
		System.out.println("price is= "+price);
		System.out.println(description);
		System.out.println("category is= "+category+"\n");
		
		//use of format specifier
		System.out.printf("id is= %d\n",id);
		System.out.printf("tittle is= %s\n",tittle);
		System.out.printf("price is= %s\n",price);
		System.out.printf(description+"\n");
		System.out.printf("category is= %s\n",category);
		
	}
}

