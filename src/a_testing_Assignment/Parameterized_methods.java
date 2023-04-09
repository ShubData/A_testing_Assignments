package a_testing_Assignment;

public class Parameterized_methods {
// static--------------------------------------------------------------

	static  int getbinarytodec(String s) {
		int y = Integer.parseInt(s, 2);
		return y;
	}

	
	
	
//Non-static--------------------------------------------------------------
	void gethextodec(String b) {
		int a= Integer.parseInt(b, 16);
		System.out.println( b+ " hexa converted to decimal is "+ a);
 
	}

	public static void main(String[] args) {
		int b = Parameterized_methods.getbinarytodec("101010");
		System.out.println(b+" is the converted decimal number");
		Parameterized_methods reese = new Parameterized_methods();
		reese.gethextodec("25C8");

}
	
}
