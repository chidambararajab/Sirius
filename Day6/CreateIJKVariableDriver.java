package Day6;

/**
 * Description: CreateIJKVariableDriver as a Driver Class.
 *
 */
public class CreateIJKVariableDriver {
	
	/**
	 * Driver Method.
	 * @param args
	 */
	public static void main(String[] args) {
		CreateIJVariable obj1 = new CreateIJVariable();
		obj1.i = 1;
		obj1.j = 2;
		obj1.printIJ();

		CreateKVariable obj2 = new CreateKVariable();
		obj2.i = 33;
		obj2.j = 44;
		obj2.printIJ();
		obj2.printK();
		obj2.sumIJK();
	}
}
