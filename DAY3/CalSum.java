package DAY3;

import java.util.Scanner;

public class CalSum {
	public static void main(String[] args) {
		int a,b,c,sum;
	Scanner input =  new Scanner(System.in);
	
	System.out.println("Enter the first number : " );
	a = input.nextInt();
	System.out.println("Enter the senond number : " );
	b = input.nextInt();
	System.out.println("Enter the third number : " );
	c = input.nextInt();
	
	sum=Sum(a,b,c);
	System.out.println("Sum = " + sum);
	
	
	}
	
	static int Sum(int x,int y, int z) { 
		int d;
		
		d = z + x - y;
		
		System.out.println("Sum of three number is : " + d);
		
		return d;
	}
	
}
