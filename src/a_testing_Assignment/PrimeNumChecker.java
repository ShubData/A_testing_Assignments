package a_testing_Assignment;

public class PrimeNumChecker {
static void primechecker(int x) {
	int i=1;
	int count=0;
	while (i<=x) {
		if (x % i==0) {
			count+=1;	
		}
		i++;
	}
	
	if (count == 2) {
		System.out.println(x + " is a prime number");
	}
	else {
		System.out.println(x + " is not a prime number");
	}
}

public static void main(String[] args) {
	PrimeNumChecker.primechecker(8);
}
}
