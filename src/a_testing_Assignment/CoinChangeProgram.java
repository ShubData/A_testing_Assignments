package a_testing_Assignment;

public class CoinChangeProgram {

static void getchange(int a,int b) {
	int amount = a-b;
	int change = amount;
	int twothousand=0;
	int fivehundred=0;
	int twohundred=0;
	int hundred=0;
	int fifty=0;
	int twenty=0;
	int ten=0;
	int five = 0;
	int two=0;
	int one=0;
	
	while (amount>0) {
		
		 if (amount>=2000) {
			twothousand++;
			amount-=2000;
		}
		
		else if (amount>=500 && amount <2000) {
			fivehundred++;
			amount-=500;
		}
		
		else if (amount>=200 && amount <500) {
			twohundred++;
			amount-=200;
		}
		 
		else if (amount>=100 && amount <200) {
			hundred++;
			amount-=100;
		}
		 
		else if (amount>=50 && amount <100) {
			fifty++;
			amount-=50;
		}
		
		else if (amount>=20 && amount<50) {
			twenty++;
			amount-=20;
		}
		 
		 
		else if (amount>=10 && amount < 20) {
			ten++;
			amount-=10;
		}
		else if (amount>=5 ) {
			five++;
			amount-=5;
		}
		else if (amount>=2) {
			two++;
			amount-=2;
		}
		else if (amount>=1) {
			one++;
			amount-=1;
		}
		
	}
	int total_notes =twothousand+fivehundred+twohundred+hundred+fifty+twenty+ten+five+two+one;
System.out.println("no.of notes : "+ total_notes);
System.out.println("change amount : "+ change+ " .Rs");
	
	
	if (twothousand!=0) {
		System.out.println(twothousand + " * 2000");
		
	}
	
	if (fivehundred!=0) {
		System.out.println(fivehundred + " * 500");
		
	}
	
	 if(twohundred!=0) {
		System.out.println(twohundred + " * 200");
		
	}
	
	if (hundred!=0) {
		System.out.println(hundred + " * 100");
		
	}
	
	if (fifty!=0) {
		System.out.println(fifty + " * 50");
		
	}
	
	if (twenty!=0) {
		System.out.println(twenty + " * 20");
		
	}
	
	if (ten!=0) {
		System.out.println(ten + " * 10");
		
	}
	
	if (five>0) {
		System.out.println(five + " * 5");
		
	}
	
	if (two!=0) {
		System.out.println(two + " * 2");
		
	}
	if (one!=0) {
		System.out.println(one + " * 1");
		
	}

	
//System.out.println(total_notes);

}



	
public static void main(String[] args) {
	CoinChangeProgram.getchange(2000, 11);

	
}

}
