package DAY3;
import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		int n,m;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the base : ");
		n = input.nextInt();
		System.out.println("Enter the power : ");
		m = input.nextInt();
		
		long answer = power(n,m);
		
		System.out.println(answer);
		
	}
	static long power(int n,int m) {
		long result = 1;
		
		for(int i =1 ; i<=m ; i++) {
			result *= n;
		}
		
		return result;
	}

}
