package LinearSearch;
import java.util.*;
public class FirstQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int n;
		
		System.out.println("Enter the size of the array");
		n = scn.nextInt();
		
		int[] nums = new int[n];
		
		for(int i =0 ; i<n; i++) {
			nums[i] = scn.nextInt();
		}
		
		for(int i =0 ; i<n; i++) {
			System.out.println(nums[i] + " ");
		}
		int target;
		
		System.out.println("Enter the target");
		target = scn.nextInt();
		int ans = linearSearch(nums , target);
		System.out.println(ans);

	}
	
	static int linearSearch(int[] arr , int target) {
		if(arr.length == 0 ) {
			return -1;
		}
		
		for(int index =0; index < arr.length; index++) {
			int element = arr[index];
			if(element == target) {
				
				return index;
			}
		}
		return target;
	}

}
