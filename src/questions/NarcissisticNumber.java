package questions;

import java.util.Scanner;

public class NarcissisticNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();
        
        if (isNarcissistic(number)) {
            System.out.println(number + " is a Narcissistic number.");
        } else {
            System.out.println(number + " is not a Narcissistic number.");
        }
    }

    public static boolean isNarcissistic(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = Integer.toString(number).length();

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        return sum == originalNumber;
    }
}
	}

}
