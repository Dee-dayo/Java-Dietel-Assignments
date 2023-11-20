import java.util.Scanner;

public class Arith {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

System.out.print("Enter first integer: ");
int num1 = scanner.nextInt();

System.out.print("Enter second integer: ");
int num2 = scanner.nextInt();

System.out.print("Enter third integer: ");
int num3 = scanner.nextInt();

int sum = num1 + num2 + num3;

int average = sum / 3;

int product = num1 * num2 * num3;

int largest = num1;
int smallest = num1;

if (num2 > largest) largest = num2;

if(num3 > largest) largest = num3;

if(num2 < smallest) smallest = num2;

if (num3 < smallest) smallest = num3;

System.out.printf("The sum of the three integers is %d%n", sum);
System.out.printf("The average of the three integers is %d%n", average);
System.out.printf("The product of the three integers is %d%n", product);
System.out.printf("The largest of the numbers is %d while the smallest is %d%n", largest, smallest);





}



}