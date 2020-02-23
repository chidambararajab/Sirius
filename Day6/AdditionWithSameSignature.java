package Day6;

/**
 * Decleration: Implement a class that contains add methods.
 *
 */
public class AdditionWithSameSignature {
	protected int c =0;
	protected double cc =0;

	/**
	 * Decleration: Create a method to add int variable and store in integer.
	 * @param a
	 * @param b
	 * @return
	 */
	public int add(int a,int b) {
		this.c = a+b;
		System.out.println("Integer Method");
		return c;
	}

	/**
	 * Decleration: Create a method to add int variable and store in double.
	 * @param a
	 * @param b
	 * @return
	 */
	public double add(int a, int b) {
		System.out.println("Double Method");
		this.cc = a + b;
		return c;
	}

	/**
	 * Decleration: Driver method.
	 * @param args
	 */
	public static void main(String[] args) {

		AdditionWithSameSignature obj = new AdditionWithSameSignature();
		obj.add(1, 2);
		System.out.println(obj.c);
		System.out.println(obj.cc);

	}
}