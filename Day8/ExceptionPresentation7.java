package Day8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * NoSuchElementException --> InputMismatchException
 */
public class ExceptionPresentation7 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String name;
		Integer age = 0;
		Double hight = 0.0; 
		
		name = scan.next();
		
		try {
		age = scan.nextInt();
		hight = scan.nextDouble();
		}catch(InputMismatchException imme) {
			System.out.println("InputMismatchException Handled");
		}
		System.out.println(name);
		System.out.println(age);
		System.out.println(hight);
		
	}
}
