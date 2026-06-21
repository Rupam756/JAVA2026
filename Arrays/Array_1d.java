
package Arrays;
import java.util.Scanner;
public class Array_1d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, avg, sum=0;
		int[] marks;
		Scanner scn;
		marks = new int[6];
		scn = new Scanner(System.in);
		
		for(i=0; i<=5;i++) {
			System.out.println("Enter marks : ");
			marks[i]=scn.nextInt();
		}
		
		for(i=0; i<=5;i++) {
			sum =sum+marks[i];
			
		}
			avg = sum/6;
			System.out.println("Average marks = "+ avg);
		
		
		
		
		

	}

}
