package a_testing_Assignment;

public class Pattern_Printing {

static void Square_pattern(int n) {
	// n decides number of rows and columns
	for (int i = 0; i <=n; i++) {
		for (int j = 0; j <=n; j++) {
			System.out.print(" * ");
		}
		System.out.println();
}	

}
	
static void i_triangle(int n) {
	//increasing triangle pattern
	// Pattern 1
	for (int i = 0; i <=n; i++) {
		for (int j = 0; j <= i; j++) {
			System.out.print(" * ");
		}
		System.out.println();
}	
}

static void d_triangle(int n) {
	//decreasing triangle pattern
	// Pattern 3
	for (int i = 0; i <=n; i++) {
		for (int j = i; j <= n; j++) {
		System.out.print(" * ");
		}
	System.out.println();
	
	}
	
}

static void flip_i_triangle(int n) {
	// Flipped increasing triangle
	// Pattern 2
	for (int i = 0; i <=n; i++) {
		// main initiated loop
		for (int j = i; j <=n; j++) {
			// this loop will print spaces
			System.out.print("   ");
		}
		for (int k = 0; k <=i; k++) {
			// this loop will print *
			System.out.print(" * ");
		}
		System.out.println();
	}
}

static void flip_d_triangle(int n) {

	// Flipped decreasing triangle
		// Pattern 4
		for (int i = 0; i <=n; i++) {
			// main initiated loop
			for (int j = 0; j <=i; j++) {
				// this loop will print spaces
				System.out.print("   ");
			}
			for (int k = i; k <=n; k++) {
				// this loop will print *
				System.out.print(" * ");
			}
			System.out.println();
		}	
}

static void equilateral_t_pattern(int n) {
	// Equilateral triangle pattern
	// Pattern 5
	// initiating main/ outer for loop
	for (int i = 0; i <=n; i++) {
		// trial 1 
		//first for loop d_triangle
		for (int j = i; j <=n; j++) {
			System.out.print("   ");
		}
		// second for loop flipped_i_ triangle
		for (int k = 0; k <i; k++) {
			System.out.print(" * ");
		}
		for (int l = 0; l <= i; l++) {
			System.out.print(" * ");
		}
	
		System.out.println();
	}

}

static void rev_equilateral_t_pattern(int n) {
	for (int i = 0; i <=n; i++) {
		// first inside loop (increasing triangle with blank space)
		for (int j = 0; j <=i; j++) {
			System.out.print("   ");
		}
		// 2nd will be flipped d_triangle
		for (int k = i; k <n ; k++) {
			System.out.print(" * ");
		}
		// 3rd will be same as 2nd 
		for (int l = i; l <= n; l++) {
			System.out.print(" * ");
		}
		
		
		System.out.println();
	}
}

static void Diamond_pattern(int n) {
	//Pattern 7
	// upper equilateral triangle
	for (int i = 0; i <n; i++) {
		// trial 1 
		//first for loop d_triangle
		for (int j = i; j <=n; j++) {
			System.out.print("   ");
		}
		// second for loop flipped_i_ triangle
		for (int k = 0; k <i; k++) {
			System.out.print(" * ");
		}
		for (int l = 0; l <= i; l++) {
			System.out.print(" * ");
		}
	
		System.out.println();
	}
	//lower equilateral triangle
	for (int i = 0; i <=n; i++) {
		// first inside loop (increasing triangle with blank space)
		for (int j = 0; j <=i; j++) {
			System.out.print("   ");
		}
		// 2nd will be flipped d_triangle
		for (int k = i; k <n ; k++) {
			System.out.print(" * ");
		}
		// 3rd will be same as 2nd 
		for (int l = i; l <= n; l++) {
			System.out.print(" * ");
		}
		
		
		System.out.println();
	}
}

static void Right_arrow_pattern(int n) {
	// Pattern 8
	// upper triangle
	for (int i = 0; i <n; i++) {
		for (int j = 0; j <=i; j++) {
			System.out.print(" * ");
		}
		System.out.println();
	}
	
	for (int i = 0; i <=n; i++) {
		for (int j = i; j <=n; j++) {
			System.out.print(" * ");
		}
		System.out.println();
	}
}

static void left_arrow_pattern(int n) {
	// pattern 9
	// upper triangle
	for (int i = 0; i <n; i++) {
		// main initiated loop
		for (int j = i; j <=n; j++) {
			// this loop will print spaces
			System.out.print("   ");
		}
		for (int k = 0; k <=i; k++) {
			// this loop will print *
			System.out.print(" * ");
		}
		System.out.println();
	}
	for (int i = 0; i <=n; i++) {
		// main initiated loop
		for (int j = 0; j <=i; j++) {
			// this loop will print spaces
			System.out.print("   ");
		}
		for (int k = i; k <=n; k++) {
			// this loop will print *
			System.out.print(" * ");
		}
		System.out.println();
	}	
	
}

static void parallelogram(int n) {
	// Pattern 10
	for (int i = 0; i <=n; i++) {
		for (int j = i; j <=n; j++) {
			System.out.print("   ");
			}
		for (int k = 0; k <=n; k++) {
			System.out.print(" * ");
		}
		
		System.out.println();
	}
}

static void rev_parallelogram(int n) {
	// Pattern 11
	for (int i = 0; i <=n; i++) {
		for (int j = 0; j <= i; j++) {
			System.out.print("   ");
		}
		for (int k = 0; k <=n; k++) {
			System.out.print(" * ");
		}
		
		
		System.out.println();
}
}

static void downup_triangle(int n) {
	// Pattern 12
	for (int i = 0; i <n; i++) {
		for (int j = i; j <= n; j++) {
		System.out.print(" * ");
		}
	System.out.println();
	}
	// i_triangle
	for (int i = 0; i <=n; i++) {
		for (int j = 0; j <= i; j++) {
			System.out.print(" * ");
		}
		System.out.println();
}	
	
}

static void flip_downup_triangle(int n) {
	// Pattern 13
	// upper
	for (int i = 0; i <n; i++) {
		// main initiated loop
		for (int j = 0; j <=i; j++) {
			// this loop will print spaces
			System.out.print("   ");
		}
		for (int k = i; k <=n; k++) {
			// this loop will print *
			System.out.print(" * ");
		}
		System.out.println();
	}
	//lower
	for (int i = 0; i <=n; i++) {
		// main initiated loop
		for (int j = i; j <=n; j++) {
			// this loop will print spaces
			System.out.print("   ");
		}
		for (int k = 0; k <=i; k++) {
			// this loop will print *
			System.out.print(" * ");
		}
		System.out.println();
	}
}

static void Hourglass_pattern(int n) {
	// pattern 14
	// upper
	for (int i = 0; i <n; i++) {
		// first inside loop (increasing triangle with blank space)
		for (int j = 0; j <=i; j++) {
			System.out.print("   ");
		}
		// 2nd will be flipped d_triangle
		for (int k = i; k <n ; k++) {
			System.out.print(" * ");
		}
		// 3rd will be same as 2nd 
		for (int l = i; l <= n; l++) {
			System.out.print(" * ");
		}
		
		
		System.out.println();
	}
	// lower
	for (int i = 0; i <=n; i++) {
		// trial 1 
		//first for loop d_triangle
		for (int j = i; j <=n; j++) {
			System.out.print("   ");
		}
		// second for loop flipped_i_ triangle
		for (int k = 0; k <i; k++) {
			System.out.print(" * ");
		}
		for (int l = 0; l <= i; l++) {
			System.out.print(" * ");
		}
	
		System.out.println();
	}
}

//-------------------------------------------------------------------------------
// Hollow Body Patterns

static void Hollow_Square(int n ) {
	for (int i = 0; i <=n; i++) {
		for (int j = 0; j <=n; j++) {
			if (i==0 || j==0||i==n||j==n) {
				System.out.print(" * ");
			}
			else {
				System.out.print("   ");
			}
			}
		System.out.println();
}	
}

static void Square_diagonals_pattern(int n) {
	for (int i = 0; i <=n; i++) {
		for (int j = 0; j <=n; j++) {
			if (i==j || i+j==n) {
				System.out.print(" * ");
			}
			else {
				System.out.print("   ");
			}
			}
		System.out.println();
}
}

static void Square_plus_pattern(int n) {
	for (int i = 0; i <=n; i++) {
		for (int j = 0; j <=n; j++) {
			if (i==n/2  || j==n/2) {
				System.out.print(" * ");
			}
			else {
				System.out.print("   ");
			}
			}
		System.out.println();
}
}

static void Hollow_i_triangle(int n) {
	for (int i = 0; i <=n; i++) {
		for (int j = 0; j <= i; j++) {
			if(i==0||j==0||i==n||j==i) {
			System.out.print(" * ");
			}
			else {
				System.out.print("   ");
			}
			}
		System.out.println();
}
}

static void Hollow_flip_i_triangle(int n) {
	for (int i = 0; i <=n; i++) {
		for (int j = 0; j <= n; j++) {
			if(j==n||i==n||i+j==n) {
			System.out.print(" * ");
			}
			else {
				System.out.print("   ");
			}
			}
		System.out.println();
}
}

public static void main(String[] args) {
//    Pattern_Printing.Square_pattern(5);
//    System.out.println();
//	Pattern_Printing.i_triangle(5);	
//	System.out.println();
//	Pattern_Printing.d_triangle(5);
//	System.out.println();
//	Pattern_Printing.flip_i_triangle(5);
//	System.out.println();
//	Pattern_Printing.flip_d_triangle(5);
//	System.out.println();
//	Pattern_Printing.equilateral_t_pattern(5);
//	System.out.println();
//	Pattern_Printing.rev_equilateral_t_pattern(5);
//  Pattern_Printing.Diamond_pattern(5);
//	Pattern_Printing.Right_arrow_pattern(5);
//  Pattern_Printing.left_arrow_pattern(5);
//	Pattern_Printing.parallelogram(5);
//	Pattern_Printing.rev_parallelogram(5);
//  Pattern_Printing.downup_triangle(5);
//	Pattern_Printing.flip_downup_triangle(5);
//	Pattern_Printing.Hourglass_pattern(5);
	
//--------Hollow-Patterns-------------------------------------------------

//	Pattern_Printing.Hollow_Square(5);
//	Pattern_Printing.Square_diagonals_pattern(4);
//	Pattern_Printing.Square_plus_pattern(4);
//	Pattern_Printing.Hollow_i_triangle(5);
	Pattern_Printing.Hollow_flip_i_triangle(5);
}


}
