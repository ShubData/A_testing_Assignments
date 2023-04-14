package a_testing_Assignments_2;
import java.util.Scanner;
public class Sqaure_Cube_Fourth {
static void getSCF(int i) {

	int square = i*i;
	int cube = i*i*i;
	int fourthP =i*i*i*i;
	System.out.println("Square : "+ square+"\nCube : "+cube+"\nFourth power : "+ fourthP);
}

static void getSCF(int i,int k) {
	
	int square = i*i;
	int cube = i*i*i;
	int fourthP =i*i*i*i;
	int power=1;
	for (int j = 1; j <=k; j++) {
		power *=i;
	}
	System.out.println("Square : "+ square+"\nCube : "+cube+"\nFourth power : "+ fourthP);
	System.out.println(i +" to the power " +k + " is " + power);
}


public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter your value below");
	int i = sc.nextInt();
	Sqaure_Cube_Fourth.getSCF(i);
	
//	System.out.println("Please enter your values below");
//	int i1 = sc.nextInt();
//	int i2 = sc.nextInt();
//	Sqaure_Cube_Fourth.getSCF(i1,i2);
}
}
