package a_testing_Assignment;

public class Check_byte {
public static void main(String[] args) {
	//System.out.println("Checking");
	//byte b1 = 128;
// run Error as b1 exceeds its byte range -128 to 127
	//byte b1 = (byte)128;
	//System.out.println(b1);
// what is the output? -128
//	byte b1 = (byte)(128 *3 );
//     System.out.println(b1);
	//what is the output? -128

//--------------------------------------------------
     byte b1 = (byte)250;
     System.out.println(b1);
     // -6 as output
     byte b2 = (byte)120;
     System.out.println(b2);
     // 120 o/p
     byte b3 = (byte)130;
     System.out.println(b3);
     //-126 o/p
     byte b4 = (byte)300;
     System.out.println(b4);
     // 44 o/p
//--------------------------------------------------------------
     int i = 020;
     int j = 20;
     int k = 0X20;
     System.out.println(i); // 16 octa
     System.out.println(j); // 20 deci
     System.out.println(k); // 32 hexa
}
}