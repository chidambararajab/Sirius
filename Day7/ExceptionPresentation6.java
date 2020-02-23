package Day7;

/**
 * NoSuchMethodException.
 *
 */
public class ExceptionPresentation6 {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		ExceptionPresentation6 obj = new ExceptionPresentation6();
		try {
			Class cl = Class.forName("Day7.ExampleClass");
			java.lang.reflect.Method method = cl.getDeclaredMethod("a");
		} catch (NoSuchMethodException no) {
			System.out.println("NoSuchMethodException");
		}
	}
}
