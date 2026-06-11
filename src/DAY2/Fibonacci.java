package DAY2;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		int firstterm =0; int secondterm = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many terms ? : ");
		int  n = sc.nextInt();
		
		for(int i = 0; i<=n; ++i) {
			
			System.out.println(firstterm +" ");
			
			int nextterm = firstterm + secondterm ;
			firstterm = secondterm;
			secondterm = nextterm;
		
		}
		
		sc.close();
	}

}
