import java.util.Scanner;

public class SeparateDigits {

public static void main (String[] args) {

Scanner digits = new Scanner (System.in) ;

System.out.print("Enter 5 digits: ") ;
int number = digits.nextInt() ;

int firstNum = (number / 10000) % 10 ;
int secondNum = (number / 1000) % 10 ;
int thirdNum = (number / 100) % 10 ;
int fourthNum = (number / 10) % 10 ;
int fifthNum = number % 10;

System.out.printf("%d   %d   %d   %d   %d", firstNum, secondNum, thirdNum, fourthNum, fifthNum) ;






}



}