package a_testing_Assignments_variableScopes;
// output is 1.
class Test {

}
public class VariableScope_p2 {
	private static int x;

	public static void main(String args[]) {
		System.out.println(fun());
	}

	static int fun() {
		return ++x;
	}

}
