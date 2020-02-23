package Day7;

/**
 * NullPointer Exception Example.
 *
 */
public class ExceptionPresentation1 {

	public static void main(String args[]) 
	{ 
		try { 
			String a= null;
			a.charAt(0);
		} catch(ArithmeticException e) { 
			System.out.println("NullPointerException"); 
		} finally {
			System.out.println("Child");

		}
	} 
} 
