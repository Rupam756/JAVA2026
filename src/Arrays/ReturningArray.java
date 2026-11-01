package Arrays;

public class ReturningArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] p;
		p = func();
		for(int i=0; i<=p.length-1; i++) {
			System.out.println(p[i]);
		}

	}
	static int[] func() {
		int [] arr = {10,30,45,85,254,245,214};
		return arr;
	}

}
