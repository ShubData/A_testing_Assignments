package a_testing_Assignments_package_2;

// Its possible to declare a Constructor as private,however
// after a constructor is passed as private no new objects of 
// the class could be created.
// to solve this we can change the access modifier or use Singleton design pattern

class A {

	

	private A() {
		
	}
	static A x = null;
	public static A makenewObject() {
		if (x == null) {
			x = new A();
		}
		return x;
	}
}

public class Constructor_p3_PrivateCheck {
	public static void main(String[] args) {

		A obj = A.makenewObject();

	}
}
