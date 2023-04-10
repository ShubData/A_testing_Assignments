package a_testing_Assignments_package_2;

class box{
	int height;
	int breadth;
	int length;
	
	box(int height,int breadth,int length){
		this.height=height;
		this.breadth=breadth;
		this.length=breadth;
	}
	
	void getdimensions() {
		System.out.println("h x b x l : "+ height+" x "+breadth+" x "+length);
	}
}


public class Constructor_p1 {
public static void main(String[] args) {
	box a = new box(4,5,4);
	a.getdimensions();
}
}
