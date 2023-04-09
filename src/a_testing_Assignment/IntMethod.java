package a_testing_Assignment;

public class IntMethod {
//Static-----------------------
	
	static int getSqaure(int x) {
		int y= x*x;
		return y;
	}
// Non-Static-------------------------------
	
	 int getremainder(int x,int y) {
		 int z= x%y;
		 return z;
	 }

public static void main(String[] args) {
	System.out.println(IntMethod.getSqaure(5));
	
	IntMethod give = new IntMethod();
	int c= give.getremainder(14, 5);
	System.out.println(c);
}

}


