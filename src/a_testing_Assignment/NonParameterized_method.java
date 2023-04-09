package a_testing_Assignment;
import java.util.Random;

public class NonParameterized_method {
	
	//Static-----------------------------------------------------------
	static int throwADice() {
		Random rnd = new Random();
		int x= rnd.nextInt(1,7);
		return x;
	}

	
// Non static-------------------------------------------------------------
	String coinFlip() {
		Random rnd = new Random();
		int x= rnd.nextInt(0,2);
		String a = "Heads";
		String b = "Tails";
		if(x==0) {
			return a;
		}
		else {
			return b;
		}
	}

	public static void main(String[] args) {
		System.out.println(NonParameterized_method.throwADice());
		
		NonParameterized_method a = new NonParameterized_method();
		System.out.println(a.coinFlip());
		
	}
}
