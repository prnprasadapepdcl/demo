package com.basics;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter a value");
	    int a = myObj.nextInt(); 
	    // Read user input
	    System.out.println("Enter b value: ");  // Output user input
	    int  b = myObj.nextInt(); 
	    System.out.println("Multiplication is:"+(a*b));
	}
}

