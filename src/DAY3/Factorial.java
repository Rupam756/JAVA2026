package DAY3;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("Enter the number : ");
		n = input.nextInt();
		fact( n);
		
	}
	static void fact(int n) {
		long fact = 1;
		for(int i= 1;  i<=n; i++) {
			
		fact *= i; 
			
		}
		System.out.println(" Fcatorial of "+ n +" is : "  + fact);
	}

}
