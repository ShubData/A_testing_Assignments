package a_testing_Assignments_package_2;
// the code below couldn't be executed as the constructor arguements 
// were not passed, and threw error as "undefined", 
// but after passing arguements it worked fine.

class Point {

	int x, y;

	public Point(int _x, int _y)

	{

		x = _x;

		y = _y;

	}

}
public class Constructor_p4 {
	public static void main(String args[]) {

		   Point p = new Point(4,5);

		   System.out.println("x = " + p.x + ", y = " + p.y); 

		  } 
}
