package Arrays;
import java.util.*;
public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,avg,sum =0;
	//nt[] marks ;
		Scanner scn;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of Students : ");
		int n = sc.nextInt();
		
		int [] marks = new int[n];
		
	for(i =0 ; i<n; i++) {
		System.out.println("Enter marks : ");
		marks[i] = sc.nextInt();
	}
	
	for(i=0; i<n; i++) {
		sum = sum +marks[i];
		
		
		
	}
	avg =sum / n;
	System.out.println("Average marrks = "+ avg);
	
	
		
		
	sc.close();
	}

}
