package questions;

import java.util.Scanner;

public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = scanner.nextInt();
		scanner.close();
		int originalnumber = number;
		int result=0;
		int digits=0;
		while(originalnumber!=0) {
			originalnumber/=10;
			digits++;
		}
		originalnumber = number;
		while(originalnumber!=0) {
			int remainder = originalnumber%10;
			result+=Math.pow(remainder, digits);
			originalnumber/=10;
		}
		if(result==number) {
			System.out.println(number+"is an Armstrong number.");
		}
			else {
				System.out.println(number+"is not an Armstrong number");
				
			}
			}
		
		
		

	

}
