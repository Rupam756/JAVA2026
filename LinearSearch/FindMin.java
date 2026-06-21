package LinearSearch;
 import java.util.Scanner;
public class FindMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i;
		
		 Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array : ");
		n = sc.nextInt();
		
		int [] arr = new int[n];
		
		System.out.println("Enter the Elements : ");
		for(i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(min(arr));

	}
	
	static int min(int [] arr) {
		int ans = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<ans) {
				ans = arr[i];
			}
		}
		return ans;
	}

}
