package Day1;

import java.util.Scanner;

public class SimpleInterest {
public static void main(String[] args) {
	
	int t;
	float p,r,i;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the princepal Amount : ");
	p = sc.nextFloat();
	
	System.out.print("Enter the interest rate : ");
	r = sc.nextFloat();
	
	System.out.println("Enter the time (years) : ");
	t = sc.nextInt();
	
	i = (p*r*t)/100;
	
	System.out.println("Interest amount for " + p + " is " + i);
	
}
}
