package a_testing_Assignment;

public class unaryOperatortrial {
public static void main(String[] args) {
	
	int i1 = -10;
	System.out.println(i1);
	// o/p -10
	int i2 = 10;
	System.out.println(i2++);
	// 10
	int i3 = 10;
	System.out.println(++i3);
    // 11
	int i4 = 10;
	System.out.println(i4--);
	// 10
	int i5 = 10;
	System.out.println(--i5);
    // 9
	int i6 = 10;
	System.out.println(~i6);
    // -11
//--------------------------------------------------------------------------
	int a1 = 10;

	int b = a1++ + ++a1;

	System.out.println(b);
//   22


	int c = 10;

	int d = ++c + ++c + ++c + c++;

	System.out.println(d);
// 49 


	int e = 10;

	int f = ++e + e++ + e++ + e++  + e-- + e-- + --e;

	System.out.println(f);
// 85
// --------------------------------------------------------------------
	double db1 = 14.5d;

	db1++;

	System.out.println(db1);

// 15.5



	final int x = 10;

	//x++;

	System.out.println(x);
// error as x's final value has been set, it cannot be increased further


	boolean bool = true;

  //  bool++;

	System.out.println(bool);
// error as boolean cannot be increased (cannot convert boolean to int)
//------------------------------------------------------------------------	
	int r = 10;   

	   r = r++ + r + ++r ;
//         10  + 11 + 12
	   System.out.println(r);
// 33 
//unary
}
}
