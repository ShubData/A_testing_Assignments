package a_testing_Assignment;
import java.util.HashMap;
import java.util.Map.Entry;
public class CoinChangeProgram {

static void getchange(int a,int b) {
	int amount = a-b;
HashMap <Integer,Integer> currency = new HashMap<>();
	
	currency.put(2000, 0);
	currency.put(500, 0);
	currency.put(200, 0);
	currency.put(100, 0);
	currency.put(50, 0);
	currency.put(20, 0);
	currency.put(10, 0);
	currency.put(5, 0);
	currency.put(2, 0);
	currency.put(1, 0);

	int[] money = {2000,500,200,100,50,20,10,5,1};	
	

		while (amount>0) {
		for (int i = 0; i < money.length; i++) {
			int x = money[i];
			while(amount >= x) {
				
				currency.compute(x,(k,v)->v=v+1);
				amount=amount - x;			
		//		System.out.println(amount);
				}
			}
		}
	
for (Entry<Integer, Integer> entry:currency.entrySet()) {
	int e =entry.getKey();
	int f = entry.getValue();
	if (f>0) {
		System.out.println(f+" notes/coins of "+ e+" Rs");
	}
	
}
}


	
public static void main(String[] args) {
	CoinChangeProgram.getchange(2000, 1450);

	
}

}
