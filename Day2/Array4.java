package Day2;

import java.util.Scanner;

public class Array4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		String rev = "";

		//Palindrome
		for (int i = name.length()-1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}
		System.out.println(rev);
		
		//Result
		if (name.equals(rev)) {
			System.out.println("Palindrom");
		}else {
			System.out.println("Not");
		}
		
	}
}
