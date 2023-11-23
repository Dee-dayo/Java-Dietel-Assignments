public class CarApplication {

	public static void main (String[] args) {

	Car car1 = new Car ("Toyota", "2023", 1200000.00);
	Car car2 = new Car ("Honda", "2020", 800000.00);

	double initialPrice1 = car1.getPrice() ;
	double initialPrice2 = car2.getPrice() ;

	double newPrice1 = initialPrice1 - (0.05 * initialPrice1) ;
	double newPrice2 = initialPrice2 - (0.05 * initialPrice2) ;
	
	System.out.printf("The price of first car is %.1f%n", initialPrice1) ;
	System.out.printf("The price of second car is %.1f%n%n", initialPrice2) ;

	System.out.printf("The new price of first car is %.1f%n", newPrice1) ;
	System.out.printf("The new price of second car is %.1f", newPrice2) ;

}

}