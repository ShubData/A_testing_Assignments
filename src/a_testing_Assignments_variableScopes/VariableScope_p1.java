// output is 20 ,it will work as static method gets loaded first in memory

package a_testing_Assignments_variableScopes;

public class VariableScope_p1 {
	public static void main(String args[]) {
		System.out.println(fun());
}
	
	static int fun() {
		return 20;
		}
}