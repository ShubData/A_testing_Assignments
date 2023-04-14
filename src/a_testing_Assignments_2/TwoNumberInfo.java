package a_testing_Assignments_2;

public class TwoNumberInfo {
static void twoNumberDetails(int i, int k) {
	int sum = i+ k;
	System.out.println("Sum is : "+ sum);
	
	int diff= i-k;
	System.out.println("Difference is : "+ diff);

	int pro = i*k;
	System.out.println("Product is : "+ pro);
	
	int avg = (i+k)/2;
	System.out.println("Average is : "+ avg);
	
	int dist= diff;
	if (dist<0) {
		dist = - dist;
	}
	System.out.println("Distance between numers is " + dist);
	
	int max ;
	int min;
	if (i>k) {
		max=i;
		min=k;
	}
	else {
		max=k;
		min=i;
	}
	System.out.println("Max is : "+ max +"\nMin is : " + min);
}


public static void main(String[] args) {
	TwoNumberInfo.twoNumberDetails(2, 4);
}
}

