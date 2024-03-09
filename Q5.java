package tutorial1;
import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        // Write a Java program to convert celsius to fahrenheit. Declare a double celsius. fahrenheit = (9/5) * celsius

        System.out.println("Enter the temperature in celsius: ");
        
        double celsius = in.nextDouble();
        
        double fahrenheit = (9.0 / 5.0) * celsius + 32.0;
        
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
    }

}
