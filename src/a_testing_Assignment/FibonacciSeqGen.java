package a_testing_Assignment;

public class FibonacciSeqGen {
	static void getFibonacciSeqWithWhileloop(int limit) {
		
		int a = 0;
		int b = 1;
		int c = 0;
		while (c<=limit) {
			System.out.println(c);
			a= b;
			b=c;
			c=a+b;
		}
	}
	
static void getFibonacciSeqWithForloop(int limit) {
	int a = 0;
	int b = 1;

	for (int i=0;i<limit;i++) {
		int c = a + b;
		
		System.out.println(c);
		a = b;
		b = c;
	}

}

	public static void main(String[] args) {
		FibonacciSeqGen.getFibonacciSeqWithWhileloop(20);

	}

}
