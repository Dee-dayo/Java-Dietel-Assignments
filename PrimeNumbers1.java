import java.util.Scanner ;

public class PrimeNumbers1 {
	public static void main (String[] args) {

	Scanner input = new Scanner (System.in) ;

	System.out.print("Enter a positive integer: ") ;
	int number = input.nextInt() ;
	
	
	while (number > 0) {
		if ( (number % 2 > 0) && (number % 3 > 0) && (number % 4 > 0) && (number % 5 > 0) && (number % 6 > 0) & (number % 7 > 0) && (number % 8 > 0) && (number % 9 > 0) && (number % 10 > 0) && (number % 11 > 0) || (number == 3) || (number == 5) || (number == 7) )
		{
		System.out.printf("%d is a prime number", number);
		}
		else
			System.out.print("This is not a prime number") ;
			System.out.printf("%n%nEnter a positive integer: ") ;
			number = input.nextInt() ;
	}
	
	if (number <0) System.out.print ("The number you entered is a negative number") ;

}

}