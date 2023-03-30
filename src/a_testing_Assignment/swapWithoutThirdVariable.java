package a_testing_Assignment;

public class swapWithoutThirdVariable {
public static void main(String[] args) {
	int i = 10;
	int j = 7 ;
	i = i + j; // 17
	j = i - j; // 10 (hence value of j is swapped here itself..i.e it becomes "i's" original value )
	i = i - j; // 7 (now subtracting j's new value from the sum will swap its original value to i)
	System.out.println("New value of i is :"+ i);
	System.out.println("New value of j is :"+ j);
}
}
