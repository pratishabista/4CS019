package tutorial1;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        // How can you perform addition, subtraction, multiplication, and division in Java using arithmetic operators?
        
        System.out.println("Enter num1: ");
        
        double num1 = in.nextDouble();
        
        System.out.println("Enter num2: ");
        
        double num2 = in.nextDouble();
        
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double division = num1 / num2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
//        System.out.printf("Division: %.3f\n" + division);
        System.out.println("Division: " + division);

    }

}
