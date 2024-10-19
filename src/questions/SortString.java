package questions;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        String str = "advantage";

		        // Convert the string to a char array
		        char[] charArray = str.toCharArray();

		        // Sort the char array
		        Arrays.sort(charArray);

		        // Convert the sorted char array back to a string
		        String sortedStr = new String(charArray);

		        // Display the sorted string
		        System.out.println("Original string: " + str);
		        System.out.println("Sorted string: " + sortedStr);
		    }
		

	

}
