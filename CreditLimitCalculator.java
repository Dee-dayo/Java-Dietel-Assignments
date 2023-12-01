import java.util.Scanner ;
 
public class CreditLimitCalculator {
	public static void main (String[] args) {

	Scanner input = new Scanner(System.in) ;

	int accNumber = 0 ;
	int beginningBalance = 0 ;
	int totalAmount = 0 ;
	int totalCreditsApplied = 0 ;
	int creditLimit = 0 ;

	System.out.print("Enter your Acc number: (Type 0 to exit): ") ;
	int accNo = input.nextInt() ;

	while (accNo != 0) {
		accNumber = accNo;

		System.out.print("Enter your balance at the beginning of the month: ") ;
		int balance = input.nextInt() ;
		beginningBalance = balance;
		
		System.out.print("Enter total amount of items charged this month: ") ;
		int amount = input.nextInt() ;
		totalAmount = amount;

		System.out.print("Enter total credits apllied this month: ") ;
		int credit = input.nextInt() ;
		totalCreditsApplied = credit;

		System.out.print("Enter credit limit: ") ;
		int limit = input.nextInt() ;
		creditLimit = limit;
		
		int newBalance = (beginningBalance + totalAmount) - totalCreditsApplied ;
		
		if (newBalance < creditLimit) {
			System.out.printf("Your new balance is %d", newBalance) ;
		}
		else {
			System.out.print("Credit limit exceeded") ;
		}

		System.out.println("") ;
		System.out.println("") ;
	
		System.out.print("Enter your Acc number: (Type 0 to exit): ") ;
		accNo = input.nextInt() ;	
	}

}
}