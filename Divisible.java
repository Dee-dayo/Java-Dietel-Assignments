import java.util.Scanner;

public class Divisible {

public static void main(String[] args){

Scanner integer = new Scanner(System.in);

System.out.print("Enter number: ");
int num = integer.nextInt();

int remainder = num % 3;

if (remainder == 0) System.out.print("The number is divisible by 3");

if (remainder != 0) System.out.print("The number is not divisible by 3");

}


}