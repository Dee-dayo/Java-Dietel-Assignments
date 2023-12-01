import java.util.Scanner ;

public class TwoLargestNumberLoop {
	public static void main (String[] args) {

	Scanner input = new Scanner (System.in) ;

	int counter = 1 ;
	int largest = 0 ;	
	int secondLargest = 0 ;

	for (counter=1; counter <=10; counter ++)  {
		System.out.printf("Enter integer %d: ", counter) ;
		int number = input.nextInt() ;
		
		if (number > largest) {
			secondLargest = largest ;
			largest = number ;
		}
		else
			if(number > secondLargest)
			secondLargest = number ; 
	}
	
	System.out.printf("The largest of the numbers is %d%n", largest) ;
	System.out.printf("The second largest is: %d%n", secondLargest);


}
}