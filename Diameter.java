import java.util.Scanner;

public class Diameter {

public static void main(String[] args){

Scanner circle = new Scanner(System.in); 

System.out.print("Prompt user to input radius of a circle: "); 
int radius = circle.nextInt();

float diameter = 2 * radius;

System.out.println("The Diameter of the circle is: " + diameter);

float pie = 3.14159f;

float circumference = 2 * pie * radius;

System.out.println("The circumference of the circle is: " + circumference);

float square = radius * radius;

float area = pie * square;

System.out.print("The area of the circle is: " + area);

}



}