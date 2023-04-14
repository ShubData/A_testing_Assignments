package a_testing_Assignments_2;
import java.util.Scanner;


public class SecondsToTime {
	static void secondToTimeformat(int i) {
		int hours;
		int mins;
		int sec;
        hours = i / 3600;
		mins = (i % 3600)/60;
		sec = i % 60;
		
		System.out.println(hours +" hours : "+mins+" minutes : "+sec+" Seconds");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Seconds below :");
		int k = sc.nextInt();
		SecondsToTime.secondToTimeformat(k);
	}
}
