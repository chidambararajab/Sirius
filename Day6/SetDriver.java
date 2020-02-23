package Day6;

/**
 * Decleration: SetDriver extends to the SetVariable.
 */
public class SetDriver extends SetVariable {

	/**
	 * Decleration: Sum a and b.
	 */
	public void sum(){
		System.out.println(a+b);
	}

	/**
	 * Driver Method.
	 * @param args
	 */
	public static void main(String[] args) {
		SetDriver obj = new SetDriver();
		obj.set(8,2);
		obj.sum();
	}
}
