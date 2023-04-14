package a_testing_Assignments_variableScopes;
class Noaccess{
	static Noaccess a =null;
	private Noaccess(){
		
	}
	public static Noaccess getobjaccess() {
		if (a == null) {
			a= new Noaccess();
		}
		return a;
	}
}


public class SingletonDesignPattern_ex {
public static void main(String[] args) {

	Noaccess [] arr = new Noaccess[10];
	for (int i = 0; i < 10; i++) {
		 arr[i] =Noaccess.getobjaccess();
	}
	
	for (Noaccess noaccess : arr) {
		System.out.println(noaccess);
	}
}
}
