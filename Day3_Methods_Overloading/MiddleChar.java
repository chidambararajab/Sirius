package Day3_Methods_Overloading;

import java.util.Scanner;
/**
 * Description: Display the middle character of a string.
 *
 */
public class MiddleChar {
	
	
	/**
	 * Description: Find the mid character.
	 * @param str
	 */
	public void midChar(String str) {
		int center = str.length()/2;
		System.out.println(str.charAt(center));
	}
	
	/**
	 * Description: driver method.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MiddleChar obj = new MiddleChar();
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Input the a string value: ");
	        String str = sc.next();
		obj.midChar(str);
		

	}

}
