package Day1;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		int n ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		n = sc.nextInt();
		
		if(n%2 == 0) {
			System.out.println(n + " is even number ");
		}else {
			System.out.println(n + " is odd number ");
		}
		
		
	}
}
