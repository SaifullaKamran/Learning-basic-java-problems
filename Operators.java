package com.it.bd.JavaBasics;
import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		
		      try (Scanner input = new Scanner(System.in)) {
		      int phonePrice = 1800; // 1800 euros
		      int numberOfInstallment, installmentPerMonth;

		      System.out.println("Number of installments? ");
		      // get number of installments from user
		      System.out.print("Enter number of installment: ");
		      numberOfInstallment= input.nextInt();
		      System.out.println("Number of installment is: "+numberOfInstallment);
		      
		      // calculate  installment amount for per month
		      installmentPerMonth= phonePrice/numberOfInstallment;
		      
		      System.out.println("Monthly installment Amount: "+installmentPerMonth + " euros");
		    } 
		
	}

}
