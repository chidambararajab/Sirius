package Day3_Methods_Overloading;

import java.util.Scanner;
	/**
	 * Description: program to count all vowels in a string.
	 */

public class CountOfVowels {
	
	/**
	 * Description: method to count all vowels in a string.
	 * @param name
	 */
	public void countVowels(String name) {
		int count = 0;

		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) != 'a' && name.charAt(i) != 'e' && name.charAt(i) != 'i' && name.charAt(i) != 'o' && name.charAt(i) != 'u') {
				count++;
			}
		}
		System.out.println("The Vowels have came this "+count +" count of time.");
	}
	/**
	 * Driver method.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		CountOfVowels obj = new CountOfVowels();
		obj.countVowels(name);
	}

}
