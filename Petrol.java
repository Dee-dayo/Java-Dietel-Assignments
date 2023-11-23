import java.util.Scanner;

public class Petrol {

	public static void main(String[] args) {
	PetrolPurchase filling1 = new PetrolPurchase ("Ikeja", "Diesel", 10, 980.00, 2.00) ;
	//System.out.printf("I stopped at %s to buy %s of %d litres. They sold at %.2f per litre and i got %.2f discount %n%n", filling1.getLocation(), filling1. getType(), filling1.getQuantity(), filling1.getPricePerLitre(), filling1.getPercentageDiscount()) ;

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the location: ") ;
	String location = input.nextLine() ;
	filling1.setLocation(location);

	System.out.print("Enter the type of Petrol: ") ;
	String type = input.nextLine();
	filling1.setType(type);

	System.out.print("Enter quantity of litres you bought: ") ;  
	int quantity = input.nextInt();
	filling1.setQuantity(quantity);

	System.out.print("Enter price per litre: ") ;
	double pricePerLitre = input.nextDouble();
	filling1.setPricePerLitre(pricePerLitre) ;

	System.out.print("How many percent discount did you get? ") ;
	double percentageDiscount = input.nextDouble() ;
	filling1.setPercentageDiscount(percentageDiscount) ;
	
	System.out.printf("I was at %s, so i boughht %d litres of %s. They sold %.2f per litre and they gave me %.0f percent discount", filling1.getLocation(), filling1.getQuantity(), filling1.getType(), filling1.getPricePerLitre(), filling1.getPercentageDiscount());

	System.out.printf("%n%nTotal Money paid #%.2f", filling1.getNetAmount()) ;


}

}