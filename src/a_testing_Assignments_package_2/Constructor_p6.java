package a_testing_Assignments_package_2;
// we can call the parameterized constructor from default constructor 
// with the help of this(); while passing an arguement like shown below.
class Q {
int a;
int b;
	Q() {
		this(8,1);
	}

	Q(int i,int k) {
		a=i;
		b=k;
		System.out.println("hello");

	}

}
public class Constructor_p6 {
public static void main(String[] args) {
	Q sd = new Q();
	System.out.println(sd.a);
	System.out.println(sd.b);
}
}
