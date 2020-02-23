package Day3_Methods_Overloading;

import java.util.Scanner;
/**
 * Description: Check whether a year (integer) entered by 
 * the user is a leap year or not.
 *
 */
public class LeepYear {

	public static boolean leepYear(int year) { 
		boolean c = ((year % 100 == 0) || (year % 4 == 0));
		return c;
	}
	
	/**
	 * Description: driver method.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.print("Input a year: ");
		int year = sn.nextInt();
		System.out.println(leepYear(year));
	}

}

