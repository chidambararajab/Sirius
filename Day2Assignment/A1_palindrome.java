package Day2Assignment;

import java.util.Scanner;

public class A1_palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();//raja

		String rev = "";

		/* Palindrome */
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

