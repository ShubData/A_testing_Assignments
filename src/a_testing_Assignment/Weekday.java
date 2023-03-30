package a_testing_Assignment;
import java.util.Scanner;
public class Weekday {
static String getWeekDay(int a) {
	String day="";
	switch (a) {
	case 1:
		
		day="1 - Sunday";
		break;
	case 2:
		
		day="2 - Monday";
		break;
	case 3:
		
		day="3 - Tuesday";
		break;
	case 4:
		
		day="4 - Wednesday";
		break;
	case 5:
		
		day="5 - Thursday";
		break;
	case 6:
		
		day="6 - friday";
		break;
	case 7:
		
		day="7 - Saturday";
		break;
    default:
    	System.out.println("Invalid Entry !");
    	System.out.println("Please enter a number between 1 - 7");
		break;
	}
       return day;
}



public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the number to check");
	int k= sc.nextInt();
	String a =Weekday.getWeekDay(k); 
	System.out.println(a);
}
}
