package a_testing_Assignment;
import java.util.Scanner;
public class GreaterNofollowing {
 static int showLargerNum(int a,int b,int c) {
	int x;
	 if (a>=b && a>= c) {
		System.out.println(a + " is the largest number");
		x=a;
	}
	else if (b>=a && b>=c) {
		System.out.println(b + " is the largest number");
		x=b;
	}
	else {
		System.out.println(c + " is the largest number");
		x=c;
	}
	 return x;
}
 
 public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("please enter your first number");
	int a = sc.nextInt();
	System.out.println("please enter your second number");
	int b = sc.nextInt();
	System.out.println("please enter your third number");
	int c = sc.nextInt();
	int result = GreaterNofollowing.showLargerNum(a,b,c);
	
 }

}
