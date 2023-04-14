package a_testing_Assignments_2;

public class DivByThird_fifth {
	
public static void main(String[] args) {
	
	System.out.println("(Divisble by 3) :");
	for (int i = 1; i < 100;i++) {
		// div by 3
		if (i%3==0) {
			System.out.print(i+" ");
			}
		}
	// div by 5 
	System.out.println("\n(Divisble by 5) :");
	for (int i = 1; i < 100;i++) {
		
		if (i%5==0) {
			System.out.print(i+" ");
			}
		}
	// div by 3 & 5 
	System.out.println("\n(Divisble by 3 & 5) :");
	for (int i = 1; i < 100;i++) {
		
		if (i%3==0 && i%5==0) {
			System.out.print(i+" ");
			}
		}
}
}
