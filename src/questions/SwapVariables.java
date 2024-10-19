package questions;

public class SwapVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a = 5;
	        int b = 10;

	        // Display the original values
	        System.out.println("Before swap:");
	        System.out.println("a = " + a);
	        System.out.println("b = " + b);

	        // Swap using addition and subtraction
	        a = a + b; // a now becomes 15
	        b = a - b; // b now becomes 5 (original value of a)
	        a = a - b; // a now becomes 10 (original value of b)

	        // Display the swapped values
	        System.out.println("After swap:");
	        System.out.println("a = " + a);
	        System.out.println("b = " + b);
	    }
	

	}


