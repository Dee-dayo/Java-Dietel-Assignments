import java.util.Scanner ;

public class TaxCalculator {
	public static void main (String [] args) {

	Scanner input = new Scanner (System.in) ;

	int taxCounter = 1 ;

	while (taxCounter <= 3) {
		System.out.print("Enter your name: ") ;
		String name = input.next() ;
		double taxCalculator = 0 ;
		System.out.print("Enter your total earnings for the year: ") ;
		double earning = input.nextDouble() ;
			if (earning <= 30000) {
				taxCalculator = earning * 0.15 ;
				System.out.printf("You are to pay %.2f USD tax from your earnings of %.2f USD %n%n ", taxCalculator, earning) ;
			}
			else if
				(earning > 30000) {
					taxCalculator = earning * 0.2 ;
					System.out.printf("You are to pay %.2f USD tax from your earnings of %.2f USD %n%n", taxCalculator, earning) ;
				}
		taxCounter += 1 ;
		
	}


}

}