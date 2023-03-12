package a_testing_Assignment;

public class swapWithoutThirdVariable {
public static void main(String[] args) {
	int i = 10;
	int j = 7 ;
	i = i + j;
	j = i - j;
	i = i - j;
	System.out.println("New value of i is :"+ i);
	System.out.println("New value of j is :"+ j);
}
}
