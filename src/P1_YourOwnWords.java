import java.util.Scanner;

/*
	ISYS 320
	Name(s):
	Date: 
*/

/*  EXAMPLE
-- Your conditional expression
x < y

-- Your test values for x, y, z and do you expect true or false?
1, 2, 0 -> TRUE
2, 1, 0 -> FALSE
*/

/* 1. 
-- Your conditional expression
y >= 1


-- Your test values for x, y, z and do you expect true or false?
1 or > is true
0 =< is false
*/

/* 2. 
-- Your conditional expression
x is not zero
x <0
x >0 

-- Your test values for x, y, z and do you expect true or false?
any number not 0 will return true / a false means the number is 0 
*/

/* 3.  
-- Your conditional expression
y * z is odd
(y * x)  % 2 == 0

-- Your test values for x, y, z and do you expect true or false?
if the number is even then the you get a false return 
*/

/* 4.  
-- Your conditional expression
y is at least the sum of z and x
y>= z + x

-- Your test values for x, y, z and do you expect true or false?
True // 1,2,1
*/

public class P1_YourOwnWords {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Enter test values for x, y, and z, separated by spaces: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double z = input.nextDouble();
		
		// Replace the conditional test, x < y below with your conditional expression to verify it is correct
		// using your test values
		if(y >=(z + x)) {
			System.out.println("The test was TRUE");
		} else {
			System.out.println("The test was FALSE");
		}

	}

}
