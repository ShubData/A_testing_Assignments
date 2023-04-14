package a_testing_Assignments_variableScopes;

class A {

	static int i = 10;

}
public class StaticKeyword_p2 {
	public static void main(String[] args) {

		System.out.println(A.i);
// static variable can be called by using class extension directly
		A a1 = new A();

		System.out.println(a1.i);
// even though creating an object and accessing a static variable works it is
// recommended to call static variable in a static way.
	}
}
// o/p 10
//     10