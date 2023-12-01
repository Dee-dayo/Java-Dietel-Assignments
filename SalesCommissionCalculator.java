import java.util.Scanner ;

public class SalesCommissionCalculator {
	public static void main (String[] args) {

	Scanner input = new Scanner (System.in) ;


	System.out.print("Enter your staff id: ") ;
	int staffId = input.nextInt() ;

		double totalSold = 0 ;

	while (staffId != 0) {
		
		System.out.print("Enter the number of items sold: (Enter any other to end) ") ;
		double items = input.nextInt() ;
		
		if (items == 1) {
			items = 239.99;
			totalSold += items;
		}
		else 
			if (items == 2) {
				items = 129.75 ;
				totalSold += items ;
			}
			else 
				if (items == 3) {
					items = 99.95 ;
					totalSold += items ;
				}
				else 
					if (items == 4) {
						items =350.89 ;
						totalSold += items ;
					}
					else 
						{
							System.out.printf("%nThe total amount you sold for the week is: #%.2f%n", totalSold) ;
							
							double commission = (totalSold * 0.09) + 200 ;
							System.out.printf("Your sales earnings is #%.2f%n%n%n", commission) ;

							System.out.print("Enter your staff id: (Enter 0 to finish) ") ;
							staffId = input.nextInt() ;
							totalSold = 0 ;
						}
		}

}
}