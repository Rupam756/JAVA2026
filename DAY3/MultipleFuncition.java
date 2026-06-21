package DAY3;

public class MultipleFuncition {
	public static void main(String[] args) {
	      
		System.out.println("I am India ");
		kolkata();
	
		
		System.out.println("---End---");
		
		
	}
	
	static void kolkata(){
		System.out.println("AMI KKR");
		Chennai();
	}
	
	static  void Mumbai() {
		System.out.println("MI PALTAN");
	}
	
	static void Chennai() {
		System.out.println("HUSSALE PADDU");
		Mumbai();
	}


}
