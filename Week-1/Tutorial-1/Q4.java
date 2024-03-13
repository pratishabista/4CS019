package tutorial1;
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        // get the remainder
        System.out.println("Enter num1: ");
        
        double num1 = in.nextDouble();
        
        System.out.println("Enter num2: ");
        
        double num2 = in.nextDouble();
        
        double rem = num1 % num2;
       

        System.out.println("Remainder: " + rem);


    }

}
