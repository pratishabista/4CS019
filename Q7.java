package tutorial1;

public class Q7 {

	public static void main(String[] args) {
		// Write a program  for computing above data using all the comparison operators given in the slides.
		
        boolean expr1 = (5 > 3);
        boolean expr2 = (8 > 5);
        boolean expr3 = !(5 == 10);
        boolean expr4 = (5 == 10);

        System.out.println("Logical AND: " + (expr1 && expr2));

        System.out.println("Logical OR: " + (expr1 || expr2));
        
        System.out.println("Logical NOT: " + expr3);
        System.out.println("Expression 4: " + expr4);
	}

}
