package Day6;

/**
 * Decleration: Create a InitializeVariable class with final variable.
 *
 */
public class InitializeVariable {
	private final int a =5;
	private final int b;

	/**
	 * Decleration: Initilize the final variable b in the constructor
	 */
	public InitializeVariable(){
		this.b = 67;
	}

	/**
	 * Decleration: Print the a and b variable in this method.
	 */
	protected  void printVariable() {
		System.out.println(a +" , "+ b);
	}

	/**
	 * Decleration: Driver method.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InitializeVariable obj = new InitializeVariable();
		obj.printVariable();
	}

}
