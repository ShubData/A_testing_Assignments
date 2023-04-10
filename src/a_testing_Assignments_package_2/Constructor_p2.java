package a_testing_Assignments_package_2;

// Yes this code is valid and will work, but it is not recommended 
// as per coding standard in java to have same name as class/constructor
class B {
	int i;
	
	
	//this is a Constructor
	B(int i) {
		this.i = i;
	}

	
	//this is a method
	void B() {
		System.out.println("this is a method " + i);

	}

}

public class Constructor_p2 {
	public static void main(String[] args) {
		B max = new B(8);
		max.B();
	}
}
