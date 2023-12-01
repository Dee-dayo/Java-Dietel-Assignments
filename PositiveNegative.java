
import java.util.Scanner;

public class PositiveNegative {
	public static void main (String[] args) {

	Scanner input = new Scanner (System.in) ;

	int sum = 0 ;
	int positiveNum = 0 ;
	int negativeNum = 0 ;
	int count = 0 ;
	int integer = 0 ;

	System.out.print("Enter an integer, the nunput ends if it is 0: ") ;
	integer = input.nextInt() ;

	while (integer != 0) {
		if (integer > 0) {
			positiveNum ++ ; }

		else {
			negativeNum ++ ;}

		sum += integer ;
		
		System.out.print("Enter an integer, the nunput ends if it is 0: ") ;
		integer = input.nextInt() ;
		
		count += 1 ;
	}

	if (count > 0) {
		System.out.println("The number of positives is " + positiveNum) ;
		System.out.println("The number of negatives is " + negativeNum) ;
		System.out.printf("The total is: %.1f%n", (double) sum) ;
		System.out.printf("The average is: %.2f", (double) sum/count ) ;
	}
	
	else {
		System.out.print("No numbers are entered excepted 0") ; }

}
}