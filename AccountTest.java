import java.util.Scanner;	

public class AccountTest {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	Account acc1 = new Account ("Dayo Akinyemi", 50.00) ;
	Account acc2 = new Account ("Jumoke Joseph", 0.00) ;

	System.out.printf("%s current balance is: #%.2f %n", acc1.getName(), acc1.getBalance());
	System.out.printf("%s current balance is: #%.2f %n %n", acc2.getName(), acc2.getBalance());

	System.out.print("Enter deposit amount for First account: ") ;
	double depositAmount = input.nextDouble() ;
	System.out.printf("Adding %.2f to %s balance %n", depositAmount, acc1.getName()) ;
	acc1.deposit(depositAmount);
	System.out.printf("%s new balance is: %.2f %n %n", acc1.getName(), acc1.getBalance()) ;

	System.out.print("Enter withdraw amount for First account: ") ;
	double withdrawAmount = input.nextDouble() ;
	System.out.printf("Deduct %.2f from %s balance %n", withdrawAmount, acc1.getName()) ;
	acc1.withdraw(withdrawAmount);
	System.out.printf("%s new balance is: %.2f %n %n", acc1.getName(), acc1. getBalance());

	System.out.print("Enter deposit amount for Second account: ") ;
	double depositAmount2 = input.nextDouble();
	System.out.printf("Adding %.2f to %s balance %n", depositAmount2, acc2.getName());
	acc2.deposit(depositAmount2) ;
	System.out.printf("%s new balance is: %.2f %n", acc2.getName(), acc2.getBalance()) ;

	System.out.print("Enter withdraw amount for Second account: ") ;
	double withdrawAmount2 = input.nextDouble() ;
	System.out.printf("Deduct %.2f from %s balance %n", withdrawAmount2, acc2.getName()) ;
	acc2.withdraw(withdrawAmount2);
	System.out.printf("%s new balance is: %.2f %n %n", acc2.getName(), acc2. getBalance());

}  


}