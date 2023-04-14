package a_testing_Assignments_variableScopes;
// This code throws an error as fun() is a non-static method
// and hasn't been created before the main block
// to correct this either declare the method as static or just create
// an instance of class in main block, like below
public class VariableScope_pt3 {
	int fun() {
		return 20;
	}
	public static void main(String args[]) {
		VariableScope_pt3 F = new VariableScope_pt3();
		System.out.println(F.fun());
	}
	}
