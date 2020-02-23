package Day7;

/**
 * ClassNotFoundException
 *
 */
public class ExceptionPresentation3 {

	public static void main(String[] args) {
		try
		{ 
			Class.forName("GeeksForGeeks"); 
		} 
		catch (ClassNotFoundException ex) 
		{ 
			System.out.println("EX");
			ex.printStackTrace(); 
		} 
		System.out.println("chid");
	} 
}
