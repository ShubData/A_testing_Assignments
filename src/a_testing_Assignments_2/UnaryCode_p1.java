package a_testing_Assignments_2;

public class UnaryCode_p1 {
	public static void main(String[] args) {
		
		int i = 10;
		i = i++;
//      i = 10 here as it is post increment
        System.out.println(i);
        int j = 10;
        j = j++ + j;
//      j = 10 + 11 = 21
        System.out.println(j);

	}
}
