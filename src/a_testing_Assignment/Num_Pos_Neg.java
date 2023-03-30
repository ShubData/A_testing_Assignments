package a_testing_Assignment;
import java.util.Scanner;
public class Num_Pos_Neg {
static void Posverifier(int a) {
	if (a>0) {
		System.out.println(a + " is a positive number");
	}
	else if (a<0) {
		System.out.println(a + " is a negative number");
	}
}


public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a;
	System.out.println("Please enter your Number :");
	a = sc.nextInt();
	Num_Pos_Neg.Posverifier(a);
}
}
