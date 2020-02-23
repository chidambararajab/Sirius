package Day7;

public class ExceptionExample {
	
	public static void main(String[] args) {
		
		int a=0;
		try {
			a = 50/0;
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