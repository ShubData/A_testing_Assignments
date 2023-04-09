package a_testing_Assignment;

public class Void_Method_assignments {
// Static method------------------------------
	static void getintroduction() {
	System.out.println("Hello this is a method");
	}
	
// Non static void method
	 void get2square() {
		System.out.println("Square 0f 2 is 4");
	}

public static void main(String[] args) {
	Void_Method_assignments.getintroduction();
	
// to call a non static method we have to create a new object of class.
	Void_Method_assignments ob = new Void_Method_assignments();
	ob.get2square();
}

}

