package a_testing_Assignment;

// the below code worked fine without any errors 
// and method could directly be used as an Arguements.


class A {

	public int add(int i, int j) {

		return i + j;

	}

}
public class Direct_method {
	public static void main(String[] args) {
		A a1 = new A();

		int x=a1.add(a1.add(10, 20), a1.add(30, 40));
		System.out.println(x);

	}

}


	

