package a_testing_Assignments_variableScopes;
// this code throws an error as x is an local variable and its scope 
// lies within the method.
// In this case as it is passed as a static method(which gets loaded with class)
// it contradicts with the definition of static and would throw an error.
// to run just make it a local variable like below
public class VariableScope_p4 {
	public static void main(String args[]) {
		System.out.println(fun());
	}

	static int fun() {
		int x = 0;
		return ++x;
	}
}
