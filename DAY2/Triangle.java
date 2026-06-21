package DAY2;

import java.util.Scanner;

public class Triangle {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i,j ,n;
		
		System.out.println("How many lines ? ");
		n = sc.nextInt();
		
		for(i=1; i <= n; i++) {
			for(j=1; j <= i; j++) {
			
				System.out.println("* ");
			}
			System.out.println();
	}
		
sc.close();
}
	
}