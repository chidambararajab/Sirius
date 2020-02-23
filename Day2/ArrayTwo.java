package Day2;

import java.util.Scanner;

public class ArrayTwo {

	public static void main(String[] args) {

		String[] ArrStr = new String[4];

		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Enter the Name: ");
			String str = sc.nextLine();
			ArrStr[i] = str;

		}
		
		
		for (int i = 0; i < 4; i++) {
			System.out.print(ArrStr[i]+ ", ");
		}
	}
}