package Day7;

/**
 * StringIndexOutOfBoundsException 
 *
 */
public class ExceptionPresentation2 {

	public static void main(String args[]) 
	{ 
		try { 
			String a = "sirius"; 
			char c = a.charAt(24); 				
			System.out.println(c); 
		} 
		catch(StringIndexOutOfBoundsException e) { 
			System.out.println("StringIndexOutOfBoundsException"); 
		} 
	} 
} 
