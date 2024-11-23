package Recursion;

public class Recursion1 {
	static int factorial(int n) {
		if(n == 1) 
			return 1;
		else
			return(n*factorial(n-1));
			
		}
	public static void main(String[] args) {
		System.out.println("fractional of 5 is  " + factorial(5));
	}
	}


