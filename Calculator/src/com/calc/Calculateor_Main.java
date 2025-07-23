package com.calc;

import java.util.Scanner;

public class Calculateor_Main {
	// method for addition
	public static double add(double a, double b) {
		return a+b;
	}
	//method for substraction
	public static double substract(double a , double b) {
		return a-b;
	}
	// method for muliplication
	public static double multiply(double a,double b) {
		return a*b;
	}
	//method for divide with Exception handling
	public static double divide(double a,double b) {
		if(b==0) {
			throw new ArithmeticException("Error, Division by Zero is not allowed");
		}
		return a/b;
	}
	//main method class
	public static void main(String []args) {
		Scanner sc=new Scanner (System.in);
		boolean continueCalculator = true;
		
		while(continueCalculator) {
			System.out.println("\n****Welcome to My Calculator****");
			System.out.println("1. For Addition (+)");
			System.out.println("2. For Substraction (-)");
			System.out.println("3. For Multiplication (*)");
			System.out.println("4. For Division (/)");
			System.out.println("5. For Exti");
			System.out.println("Choose an option (1-5)");
			
			int Choice = sc.nextInt();
			double num1,num2,result;
			
			switch(Choice) {
			case 1:
				System.out.print("Enter First number: ");
				num1=sc.nextDouble();
				System.out.print("Enter Second number: ");
				num2=sc.nextDouble();
				result=add(num1,num2);
				System.out.println("Result:"+result);
				break;
			
			case 2:
				System.out.print("Enter First number: ");
				num1=sc.nextDouble();
				System.out.print("Enter Second number: ");
				num2=sc.nextDouble();
				result=substract(num1,num2);
				System.out.println("Result:"+result);
				break;
				
			case 3:
				System.out.print("Enter First number: ");
				num1=sc.nextDouble();
				System.out.print("Enter Second number: ");
				num2=sc.nextDouble();
				result=multiply(num1,num2);
				System.out.println("Result:"+result);
				break;
				
			case 4:
				System.out.print("Enter First number: ");
				num1=sc.nextDouble();
				System.out.print("Enter Second number: ");
				num2=sc.nextDouble();
				try {
				result=divide(num1,num2);
				System.out.println("Result:"+result);
				} catch (ArithmeticException e) {
					System.out.println(e.getMessage());
				}
				break;
				
			case 5:
				continueCalculator=false;
				System.out.println("Thank you for using the Calculator");
				break;
				
			default:
				System.out.println("Invalid Choice, Please Choose between (1-5)");
			}
		}
		sc.close();
	}
}