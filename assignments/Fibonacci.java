package day1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the range :");
		int range = sc.nextInt();



		int num1 =0;
		int num2 =1;
		int sum =0;



		/*
		 * System.out.print(num1); System.out.print(num2);
		 */

		System.out.print("The fibonacci Series : " +num1 +","+num2);

		for(int i =0; i <range;i++)
		{


			sum=num1+num2;
			System.out.print(","+sum);
			num1 = num2;
			num2=sum;






		}









	}

}
