package com.simplilearn.java.hello;
public class Calculator {
	public static void main(String[] args) {
 
		
		System.out.println("Add = " + add(5, 4) ) ;
		System.out.println("Subtract = " 	 + subtract(5, 4) ) ;
		System.out.println("Multiply = " + multiply(5, 4) ) ;
		System.out.println("Divide = " + divide(5, 4) ) ;
		System.out.println("Round = " + round(3.3333) ) ;
		System.out.println("isEven = " + isEven(2) ) ;
		System.out.println("isOdd = " + isOdd(2) ) ;
		System.out.println("XNOR = " + XNOR(true,false) ) ;
		System.out.println("addThreeNumbers = " + addThreeNumbers(5, 4, 17) ) ;
		System.out.println("lessThan = " + lessThan(5,4) ) ;
	}
	
	private static int add ( int left, int right ) {
		return left + right ;
	}
	
	private static int subtract ( int left, int right) {
 
		return left - right;
 }

	private static int multiply (int left, int right) {
		return left * right; 
	}
	
	private static double divide (int left, int right) {
		return left/(double)right;
	}
	
	private static int round (double d) {
		return (int) Math.round (d);
	}
		
	private static boolean isEven (int i) {
		return (i % 2 == 0);
	}
		
	private static boolean isOdd (int i) {
		return (i % 2 == 1);
	}
	
	private static boolean XNOR (boolean a, boolean b) {
		return (a && b) || (!a && !b);	
	}
	
	private static int addThreeNumbers (int first, int second, int third) {
		return first+second+third;
	}
		
	private static boolean lessThan (int left, int right) {
		return left < right;
	}
}
	// multiply two integers and return an integer
	// divide: take two integers and return double
	// round take a single double param, return int
	// isEven ( take a single integer ) and return true if if it is even
	// isOdd ( take a single integer ) and return true if if it is odd
	// XNOR (takes two booleans and returns true if they are both true or both false
	// add three numbers
	// lt ( take two integers and return true if left is less than right)