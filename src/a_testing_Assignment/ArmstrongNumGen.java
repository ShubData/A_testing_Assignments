package a_testing_Assignment;

public class ArmstrongNumGen {

static boolean armstrongverifier(int n) {
	int z = n;             // z= 153
	int count=0;          // here count will become 3
	while (z>0) {
		z=z/10;
		count++;
	}
	z=n;                  // z again initiated to n
	int digits =0;
	
	int sum= 0;
	while (z > 0) {
		digits = z % 10;
		int pro = 1;

		for (int i = 1; i <=count; i++) {
			pro*= digits;
		}
		sum+=pro;
		z=z/10;
	}
	z=n;
	if (sum==z) {
		return true;
	}
	else {
		return false;
	}

}

static void getArmstrongNum(int a) {
	for (int i = 0; i <=a; i++) {
		if (armstrongverifier(i)) {
			System.out.println(i);
		}
	}
}



public static void main(String[] args) {
	boolean what =ArmstrongNumGen.armstrongverifier(153);
    System.out.println(what);
ArmstrongNumGen.getArmstrongNum(160);
}
	
	
}
