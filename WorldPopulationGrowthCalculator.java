import java.util.Scanner;

	public class WorldPopulationGrowthCalculator {

	public static void main(String[] args) {

	Scanner input = new Scanner (System.in) ;
	
	System.out.print("Enter current world population: ") ;
	int old = input.nextInt() ;

	System.out.print("Enter annual world population growth rate: ") ;
	double growthRate = input.nextDouble() ;

	double year = 1 + growthRate ;
	double power2 = year * year ;
	double power3 = year * year * year ;
	double power4 = year * year * year * year ;
	double power5 = year * year * year * year * year ;
	double year1 = year * old ;
	double year2 = year * year1 ;
	double year3 = year * year2 ;
	double year4 = year * year3 ;
	double year5 = year * year4 ;

	System.out.printf("The population of next year would be = %.0f%nThe population of next 2 years would be = %.0f%nThe population of next 3 years would be = %.0f%nThe population of next 4 years would be = %.0f%nThe population of next 5 years would be = %.0f", year1, year2, year3, year4, year5) ; 


}
}