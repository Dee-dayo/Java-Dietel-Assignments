import java.util.Scanner;

public class GasMileage {
	public static void main(String[] args) {

	Scanner input = new Scanner (System.in) ;
	
	int milesDriven = 0 ;
	int gallonsUsed = 0 ;

	System.out.print("Enter number of miles driven (Enter 0 to stop): ") ;
	int miles = input.nextInt() ;

	while (miles != 0) {
		milesDriven += miles;

		System.out.print("Enter number of gallons used: ") ;
		int gallons = input.nextInt() ;
		gallonsUsed += gallons ;

		double milesPerGallon = (double) miles / gallons;
		System.out.printf("Miles per gallon for this trip is %.2f", milesPerGallon) ;

		System.out.println("") ;
		System.out.println("") ;

		System.out.print("Enter number of miles driven (Enter 0 to stop): ") ;
		miles = input.nextInt() ;
	}
	
	if (milesDriven != 0) {
		double totalMilesPerGallon = (double) milesDriven / gallonsUsed ;

		System.out.printf("Total number of Miles driven is %d%n", milesDriven) ;
		System.out.printf("Total number of Gallons used is %d%n", gallonsUsed) ;
		System.out.printf("Total number of Miles per gallon is %.2f%n", totalMilesPerGallon) ;
		}
	else {
		System.out.print("No miles was recorded") ;
		}


}
}