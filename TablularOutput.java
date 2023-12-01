public class TablularOutput {
	public static void main (String[] args) {

	int number = 1 ;

	System.out.print("N    N2   N3   N4\n") ;
	
	for (number = 1; number <=5; number ++) {
		int number2 = number * number;
		int number3 = number2 * number ;
		int number4 = number3 * number ;
		System.out.printf("%-5d%-5d%-5d%-5d%n", number, number2, number3, number4) ;

	}

}

}