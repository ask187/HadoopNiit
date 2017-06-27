package First;

import java.util.Scanner;

public class Arithmetics {
	 
	
	
	 static int add()
	{
		int a,b;
		System.out.println("Addition Function");
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the first number");
		a=in.nextInt();
		System.out.println("Enter the Second number");
		b=in.nextInt();
	
		return a+b;		
		
	}
	 static int subtract()
	{	
		 Scanner in =new Scanner(System.in);
		 System.out.println("Subtraction Function");
		int a,b;
		System.out.println("Enter the first number");
		a=in.nextInt();
		System.out.println("Enter the Second number");
		b=in.nextInt();
		
		return a-b;	
	}
	  static int multiply()
	{
		  Scanner in =new Scanner(System.in);
		  System.out.println("Multiplication Function");
		int a,b;
		System.out.println("Enter the first number");
		a=in.nextInt();
		System.out.println("Enter the Second number");
		b=in.nextInt();
		
		return a*b;	
	}
	 static double divide()
	{
		 Scanner in =new Scanner(System.in);
		 System.out.println("Division Function");
		int a,b;
		System.out.println("Enter the first number");
		a=in.nextInt();
		System.out.println("Enter the Second number");
		b=in.nextInt();
		
		return a/b;	
	}
	public static void main(String args[])
	{
		int a,b,c;
		double d;
		a=Arithmetics.add();
		b=Arithmetics.subtract();
		c=Arithmetics.multiply();
		d=Arithmetics.divide();
		System.out.println("The sum is "+ a);
		System.out.println("The difference is "+ b);
		System.out.println("The product is "+ c);
		System.out.println("The quotient is "+ d);
		
		
		
	}

}
