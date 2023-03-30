package a_testing_Assignment;

import java.util.Scanner;

public class MonthDays {
	static int getDaysofMonth(int a) {
		int days=0;
		switch (a) {
		case 1:
			days=31;
			System.out.println("January has "+ days+ " days");
			break;
		case 2:
			days=28;
			System.out.println("February has "+ days+ " days");
			break;
		case 3:
			days=31;
			System.out.println("March has "+ days+ " days");
			break;
		case 4:
			days=30;
			System.out.println("April has "+ days+ " days");
			break;
		case 5:
			days=31;
			System.out.println("May has "+ days+ " days");
			break;
		case 6:
			days=30;
			System.out.println("June has "+ days+ " days");
			break;
		case 7:
			days=31;
			System.out.println("July has "+ days+ " days");
			break;
		case 8:
			days=31;
			System.out.println("August has "+ days+ " days");
			break;
		case 9:
			days=30;
			System.out.println("September has "+ days+ " days");
			break;
		case 10:
			days=31;
			System.out.println("October has "+ days+ " days");
			break;
		case 11:
			days=30;
			System.out.println("November has "+ days+ " days");
			break;
		case 12:
			days=31;
			System.out.println("December has "+ days+ " days");
			break;
	    default:
	    	System.out.println("Invalid Entry !");
	    	System.out.println("Please enter a number between 1 - 12");
			break;
		}
	       return days;
	
	
}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number to check");
		int k= sc.nextInt();
		int a =MonthDays.getDaysofMonth(k); 
		System.out.println(a);
	}

	
}
	