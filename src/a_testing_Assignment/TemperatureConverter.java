package a_testing_Assignment;
import java.util.Arrays;
import java.util.Scanner;
public class TemperatureConverter {
static double[] gettempconverted(double c) {
	double f = 1.8*c + 32;
	double k = c + 273.15;
    double comb[] = new double[2];
	comb[0]= f;
	comb[1] = k;
    System.out.println(c + "° celsius is : " + f + "° faranheit");
    System.out.println(c + "° celsius is : " + k+ "° kelvin");
    return comb;
}

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
System.out.println("Please Enter celsius value to convert Below:");
double a = sc.nextDouble();
double b[] =TemperatureConverter.gettempconverted(a);
System.out.println(Arrays.toString(b));
sc=null;
}
}
