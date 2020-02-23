package Day3_Methods_Overloading;

import java.util.Scanner;

/**
 * Description: Compute the sum of the digits in 
 * an integer till you get a single digit value.
 *
 */

public class SumOfDigits {
	
	/**
	 * Description: Compute the sum of the digits to get single integer.
	 * @param number
	 */
	public void sumDigits(int number) {		
		if(number == 0) {
			System.out.println("sum of digit is = 0");
		}else if(number%9 == 0) {
			System.out.println("sum of digit is = 1");
		}else {
			System.out.println(number%9);
		}
	}
      
	/**
	 * Description: main method.
	 * @param argc
	 */
    public static void main(String argc[]){ 
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter number: ");
        int number = sc.nextInt();
        
        SumOfDigits obj = new SumOfDigits();
        obj.sumDigits(number); 
    } 
}