package Day2;

import java.util.Scanner;

public class Array3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		String noVow = "";

		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) != 'a' && name.charAt(i) != 'e' && name.charAt(i) != 'i' && name.charAt(i) != 'o' && name.charAt(i) != 'u') {
				noVow = noVow + name.charAt(i);
			}
		}
		System.out.println(noVow);
	}
}
