package Day2Assignment;

import java.util.Scanner;

public class A2_ReplaceVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		char[] ch = name.toCharArray();
	

		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u') {
				ch[i] = '#' ;
			}
		}
		System.out.println(ch);
	}
}
