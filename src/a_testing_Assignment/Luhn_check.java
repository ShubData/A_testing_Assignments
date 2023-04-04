package a_testing_Assignment;
import java.util.Scanner;
public class Luhn_check {
static void validity_checker(String x) {
	int sum=0;
	boolean initiated= false;
	int length= x.length();
	for (int i = length-1; i >=0; i--) {
		int n=Integer.parseInt(x.substring(i,i+1));
		if(initiated==true) {
			n*=2;
			if(n>9) {
				n=(n%10)+1;
			}
		}
		sum+=n;
		initiated =! initiated;
	}
	if(sum%10==0) {
		System.out.println("Card Number is valid");
	}
	else {
		System.out.println("Invalid Number");
	}
}



public static void main(String[] args) {
	
Scanner scan= new Scanner(System.in);
System.out.println("PLease enter your Card Number :");
String Card_num=scan.next();
Luhn_check.validity_checker(Card_num);
}
}
