package Day3_Methods_Overloading;

import java.util.Scanner;
/**
 * Description: program to compute the average of three numbers.
 *
 */
public class AverageNumber {

	/**
	 * Description: Java method to find the average number of three numbers.
	 * @param a
	 * @param b
	 * @param c
	 */
	 public void smallNumb(int a, int b, int c){
	     int average = (a+b+c)/3;
	     System.out.println(average);
	    }
	 
	 
	 /**
	  * Description: Driver(main) method
	  * @param args
	  */
	public static void main(String[] args) {
		AverageNumber obj = new AverageNumber();
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Input the a number: ");
	        int a = sc.nextInt();
	        System.out.print("Input the b number: ");
	        int b = sc.nextInt();
	        System.out.print("Input the c number: ");
	        int c = sc.nextInt();
	        obj.smallNumb(a, b, c);

	}

}
