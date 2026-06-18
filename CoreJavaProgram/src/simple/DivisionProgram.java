package simple;


	import java.util.*;
	//import java.util.InputMismatchException;

	public class DivisionProgram {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        try {
	        	System.out.println("enter number" );
	            int num1 = sc.nextInt();
	            System.out.println("enter 2nd number");
	            int num2 = sc.nextInt();

	            if (num2 == 0) {
	                System.out.println("Division by zero");
	            } else {
	                System.out.println(num1 / num2);
	            }

	        } catch (InputMismatchException e) {
	            System.out.println("Invalid input");
	        }

	        sc.close();
	    }
	}

