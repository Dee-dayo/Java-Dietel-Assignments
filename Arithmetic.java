import java.util.Scanner;

public class Arithmetic {

public static void main(String[] args) {

Scanner integer = new Scanner(System.in);


System.out.print("Enter first integer: ");
int num1 = integer.nextInt();

System.out.print("Enter second integer: ");
int num2 = integer.nextInt();

int square1 = num1 * num1;

int square2 = num2 * num2;

int sumSquare = square1 + square2;

int diffSquare = square1 - square2;

System.out.printf("%n The square of the first number is %d%n", square1);
System.out.printf("The square of the second number is %d%n%n", square2);

System.out.printf("The sum of the squares is %d%n", sumSquare);

System.out.printf("The difference of the squares is %d%n", diffSquare);



}



}