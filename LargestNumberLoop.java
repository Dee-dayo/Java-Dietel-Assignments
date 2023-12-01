import java.util.Scanner ;

public class LargestNumberLoop {
	public static void main (String[] args) {

	Scanner input = new Scanner (System.in) ;

	int counter = 0 ;
	int largest = 0 ;	
	int number = 0 ;

	for (counter =1; counter <=10;) {
		System.out.printf("Enter integer %d: ", counter) ;
		number = input.nextInt() ;
		counter += 1 ;
		if (number > largest) {
			largest = number ;
		}
	}
	
	System.out.printf("The most recent input is: %d%n", number);
	System.out.printf("The largest of the numbers is %d%n", largest) ;


}
}