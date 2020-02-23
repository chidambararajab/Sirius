package Day6;

/**
 * Decleration: Create a StaticVariable class with static variables a and b.
 *
 */
public class StaticVariable {
	
	private static int a =5;
	private static int b;
	
	/**
	 * Decleration: Initilize static variable b in static block.
	 */
	static {
		b = 778;
	}
	
	/**
	 * Decleration: create meth() method to print a, b, x.
	 * @param x
	 */
	public static void meth(int x) {
		System.out.println(x);
		System.out.println(a);
		System.out.println(b);
	}
	
	/**
	 * Decleration: Driver method.
	 * @param args
	 */
	public static void main(String[] args) {
		meth(23);
	}
}

