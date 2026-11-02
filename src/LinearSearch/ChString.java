package LinearSearch;
import java.util.*;
public class ChString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the line : ");
		String name = scn.nextLine();
		
		System.out.println("You entered "+  name) ;
		
		System.out.println("Enter the target"); 
		char target = scn.next().charAt(0);
		
		System.out.println(linearSearch(name , target));

	}
	
	static boolean linearSearch(String str, char target) {
		if(str.length()== 0) {
			return false;
		}
		
		for(int i =0; i<str.length();i++) {
			if(target == str.charAt(i)) {
				return true;
			}
		}
		return false;
	}

}
