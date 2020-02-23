package Day7;

public class ExpectionExample2 {
	
	public static void main(String[] args) {
		
		int a;

		try {
			a = 20/2;
		}catch(NullPointerException npl) {
			System.out.println("NullPoniterException");
		}catch(ArithmeticException e) {
			System.out.println("Exception");
		}catch(Exception ae) {
			System.out.println("ArithmeticException.");
		}finally {
			System.out.println("Chidambararajab");
		}
	}
}