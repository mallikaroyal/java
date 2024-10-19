package questions;

import java.util.Scanner;

class Operations implements Runnable{
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("banking")) {
			banking();
		}
		else if(Thread.currentThread().getName().equals("printing")) {
			printing();
		}else {
			multiplication();
			
		}
	}
	public void banking() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----Banking operation started-----");
		System.out.println("Enter the accno:");
		int pin = sc.nextInt();
		System.out.println("------Banking Operation Completed------");
		try {
			for(int i=0;i<5;i++) {
				System.out.println("Hello Good Evening");
				Thread.sleep(2000);
			}
			System.out.println("Printing operation Completed-----");
		}
		catch(Exception e)
	}
}
public class programm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
