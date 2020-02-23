package Day1Assignment;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the 'a' value: ");
		int a = input.nextInt();
		System.out.println("Enter the operation: ");
		System.out.println("(eg:+,-,*,/,%)");
		String ch =input.next();
		System.out.println("Enter the 'b' value: ");
		int b = input.nextInt();
		int c = 0;
		
			
	
		switch(ch) {
		case "+": 
			c = a + b;
			System.out.println(c);
			c = input.nextInt();
			break;
		case "-":
			c = a - b;
			System.out.println(c);
			break;
		case "*":
			c = a * b;
			System.out.println(c);
			break;
		case "/":
			c = a / b;
			System.out.println(c);
			break;
		case "%":
			c = a % b;
			System.out.println(c);
			break;
		default:
			System.out.println("Enter the valid details.");
		}

	}

}
