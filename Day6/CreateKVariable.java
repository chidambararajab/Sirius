package Day6;

/**
 * Decleration: create a CreateKVariable for k variable and print method and this should inherit on CreateIJKVariable.
 *
 */
public class CreateKVariable extends CreateIJVariable{
	protected int k = 5;

	/**
	 *  Description: Method to print the k value.
	 */
	public void printK() {
		System.out.println(k);
	}

	/**
	 * Description: Method to print the sum of i, j, k.
	 */
	public void sumIJK() {
		System.out.println("Sum of i, j, k = " +(i+j+k));
	}
}
