package a_testing_Assignment;



public class PrimeNmberGen {
public static void main(String[] args) {
	int i;
	int j;

	for (i = 1; i <= 20; i++) {
		int count=0;
		for (j = 1; j <=i; j++) {
			if (i%j==0) {
				count+=1;
			}
		}
		if (count==2) {
			System.out.println(i+" is a prime number");
		}
	}
	
}
}
