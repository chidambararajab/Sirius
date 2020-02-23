package Day6;

/**
 * Decleration: Create a class to find factorial of a number.
 *
 */
public class Factorial {

	/**
	 * Decleration: Constructor of the factorial class.
	 */
	public Factorial(){

	}

	/**
	 * Decleration: Factorial Method with recration.
	 * @param n
	 * @return
	 */
	public int fact(int n)
	{
		int output;
		if(n==1){
			return 1;
		}
		//Recursion: Function calling itself!!
		output = fact(n-1)* n;
		return output;
	}

	/**
	 * Decleration: Driver method
	 * @param args
	 */
	public static void main(String[] args) {
		Factorial obj = new Factorial();

		int factorial = obj.fact(5);
		System.out.println(factorial);
	}
}
