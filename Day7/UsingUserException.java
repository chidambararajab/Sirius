package Day7;

public class UsingUserException {
	
	public static void main(String[] args) throws ApplicationException {
		int a;
		try {
			a=9/0;
		}catch(Exception e) {
			System.out.println("Exception");
			throw new ApplicationException("Wait for some more seconds.");
		}
	}
}
