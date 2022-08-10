package week3;

public class Calculator 
{
	
	public void add(int a, int b)
	{
		System.out.println("Add : a+b : "+(a+b));
	}
	
	public void add(int a, int b, int c) 
	{
		System.out.println("Add : a+b+c : "+(a+b+c));	
	}
	
	public void multiply(int a , int b) 
	{
		System.out.println("Multiply : a*b : "+a*b);
	}
	
	public void multiply(int a, double b) 
	{
		System.out.println("Multiply : a*b : "+a*b);
	}
	
	public void subtract(int a,int b)
	{
		System.out.println("Sub : a-b : "+(a-b));
	}
	
	public void subtract(double a,double b)
	{
		System.out.println("Sub : a-b : "+(a-b));
	}
		
	
	public void divide(int a, int b) 
	{
		System.out.println("Divide : a/b : "+a/b);
	}
	
	public void divide(double a, int b) 
	{	
		System.out.println("Divide : a/b : "+a/b);
	}
	
	
	
	public static void main(String[] args) 
	
	{
		Calculator calc = new Calculator();
		
		System.out.println("Calculator Program : ");
		
		System.out.println("********");
		
		calc.add(10,5);
		calc.add(5, 5, 5);
		
		System.out.println("********");
		
		calc.multiply(5, 5);
		calc.multiply(5, 5.0);
		
		System.out.println("********");
		
		calc.subtract(10, 5);
		calc.subtract(10.0, 5);
		
		System.out.println("********");
		
		calc.divide(6, 6);
		calc.divide(6.0, 6);
		
		System.out.println("********");
	}

}
