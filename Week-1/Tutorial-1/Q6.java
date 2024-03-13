package tutorial1;
import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//Write a Java program to calculate the simple interest . Declare variables principle , time, and interest and assign values to them. 
		
		System.out.println("Enter the Principle amount in RS: ");
		float p = in.nextFloat();
		
		System.out.println("Enter the time in years: ");
		float t = in.nextFloat(); 
		
		System.out.println("Enter the rate in percentage: ");
		float r = in.nextFloat();
		
		
		float si = (p * t * r)/100;
		
		System.out.println("The simple interest is: " + si);
	}

}
