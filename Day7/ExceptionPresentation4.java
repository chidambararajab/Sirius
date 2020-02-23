package Day7;

/**
 * RuntimeException This represents any exception which occurs during runtime.
 *
 */
public class ExceptionPresentation4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		try {
			a = 1 / 0;
		} catch (ArithmeticException ar) {
			System.out.println("a");
		} catch (RuntimeException e) {
			System.out.println("b");
		} catch (Exception rte) {
			System.out.println("Runtime Exception Handled");
		}
	}
}
