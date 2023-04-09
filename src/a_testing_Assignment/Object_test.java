// Q : How will you define an Object ?
// A : An object can be defined as a entity which has its own 
//     certain characteristics and criterias.
//     In java an object is an instance of class which has its own state, behavior
//     and identity.

package a_testing_Assignment;

public class Object_test {
String a = "This is a instance variable";
int b= 45;
	
public static void main(String[] args) {
	
	Object_test xyz = new Object_test();
	Object_test bmx = new Object_test();
	System.out.println(xyz.a);
	System.out.println(bmx.b);
}


}
