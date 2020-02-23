package Day3_Methods_Overloading;

import java.util.Scanner;

/**
 * Description: Driver method.
 *
 */

public class SmallestNumber {
	
	/**
	 * Description: Java method to find the smallest number among three numbers.
	 * @param a
	 * @param b
	 * @param c
	 */
	 public void smallNumb(int a, int b, int c){
	     
			 if(a<=b && a<=c){
			        System.out.println("'a' is the smallest number: "+a);
			        
			    }
			    else if(b<=a && b<=c){
			        System.out.println("'b' is the smallest number: "+b);
			        
			    }
			    else{
			        System.out.println("'c' is the smallest number: "+c);
			        
			    }
	    }

	 /**
	  * Description: Driver(main) method.
	  * @param args
	  */
	 public static void main(String[] args) {
		 SmallestNumber obj = new SmallestNumber();
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


