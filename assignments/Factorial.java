package day1;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	
	// getting input from the Runtime //
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number : ");
	int input = sc.nextInt();
	
	int fact = 1;
	
	for (int i =1 ; i<=input;i++) {
		fact=fact*i;
		System.out.println(fact);
	}
	System.out.println("Factorial of the number : "+input+" is "+fact);
	
	
	
	
	
	
	
}
}
