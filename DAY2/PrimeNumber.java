package DAY2;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		boolean isPrime = false;
		
		if(n <= 1) {
			isPrime = true;
		}else {
			for(int i =2; i<=n; i++) {
				if(n % i == 0) {
					isPrime = true;
					
					break;
				}
			}
		}
		
		if(isPrime) {
			System.out.println(n + " is non-prime number.");
		}else {
			System.out.println(n+ " is prime number");
		}
		sc.close();
	}

}
