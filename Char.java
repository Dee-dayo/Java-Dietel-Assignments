import java.util.Scanner;

public class Char {

public static void main(String[] args) {
Scanner chart = new Scanner(System.in);

System.out.print("Enter a character: ");
char character = chart.next().charAt(0);

int alphabet = character;

System.out.printf("The character %c has the value %d%n", character, alphabet);


}


}