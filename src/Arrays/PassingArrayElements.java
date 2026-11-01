package Arrays;

public class PassingArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = {55,65,75,56,78,78,90};
		int i;
		
		modify(marks);
//		for(i=0; i<= 6;i++) {
//			modify(marks[i]);
//		}
		for(i=0; i<=6;i++) {
			System.out.print(marks[i]+ " ");
		}

	}
	
	static void modify(int[] m) {
		int i;
		for( i =0; i<=6;i++) {
			m[i] =m[i]*2;
		}
		
		//m = m*2;
	}

}
