import java.util.Scanner ;

public class BodyMassIndex {

public static void main(String[] args) {

Scanner integer = new Scanner(System.in);

System.out.print("Enter weight in pounds: ");
float weightInPounds = integer.nextFloat() ;

System.out.print("Enter height in inches: ") ;
int heightInInches = integer.nextInt() ;

double onePound = 0.45359237 ;
double oneInch = 0.0254 ;

double weightInKilogram = weightInPounds * onePound ;
double heightInMetres = heightInInches * oneInch ;
double heightSquare = heightInMetres * heightInMetres ;

double bodyMass = weightInKilogram / heightSquare ;

System.out.printf("BMI is %.4f", bodyMass) ;


}



}