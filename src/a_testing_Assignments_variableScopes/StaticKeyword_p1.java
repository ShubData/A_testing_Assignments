package a_testing_Assignments_variableScopes;
// First the static blocks are executed then followed by main blocks

public class StaticKeyword_p1 {
	static {
		
		System.out.println("first block");
		// first 
	}

	static {

		System.out.println("second block");
		//second

	}

	public static void main(String[] args){

		System.out.println("main method");
		// third
		}

}
