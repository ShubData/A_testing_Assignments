package a_testing_Assignment;

public class ReverseNumber {

	static int getreverse(int a) {
		int rev = 0;
		while (a > 0) {
			int remainder = a % 10;
			rev = (rev * 10) + remainder;
			a = a / 10;
		}
		return rev;
	}

	public static void main(String[] args) {
		int a = ReverseNumber.getreverse(428);
		System.out.println(a);
	}
}