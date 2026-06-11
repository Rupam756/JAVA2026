package Arrays;

import java.util.Scanner;
import java.util.Arrays;
public class MAX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Array: ");
		 n = sc.nextInt();
		int [] arr = new int[n];
		
		for(i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array elements are : ");
		
		for(i = 0; i<n; i++) {
			System.out.println(arr[i] + " ");
		}
		
		System.out.println(max(arr)+" is the max number");

	}
	
	static int max(int []arr) {
		int maxValue = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i] > maxValue) {
				maxValue =arr[i];
			}
		}
		
		return maxValue;
	}

}
