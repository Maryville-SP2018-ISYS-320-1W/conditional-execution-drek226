import java.util.Scanner;

/*
	ISYS 320
	Name(s): Derek Rieger
	Date: 4/8/18
	
	
	
	I was able to use simple if else statements and print command to perform the calculation but I'm confused 
	on how to make this a method. How would I do this with out using print commands?
*/




public class P5_PayProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		
		System.out.println("Enter your hourly rate: ");
		double hourlyRate = input.nextDouble();
		
		System.out.println("Enter the number of hours you worked this week: ");
		int numOfHoursWorked = input.nextInt();
		
		
		System.out.println(hourlyRate * numOfHoursWorked);
		if (hourlyRate * numOfHoursWorked > 8) {
			System.out.println(hourlyRate * numOfHoursWorked * 1.5);
			
		}
	}

}
