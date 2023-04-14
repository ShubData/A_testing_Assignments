package a_testing_Assignments_variableScopes;

class Tester {

	protected int x, y;

}

public class AccessMod_p1 {
	public static void main(String args[]) {

		Tester t = new Tester();

		System.out.println(t.x + " " + t.y);

	}
}
// o/p is 0 0