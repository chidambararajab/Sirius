package Day6;

/**
 * Decleration: Create a InitializeVariable and extends to Integer.
 */
public class MathsBook extends Integer{

	/**
	 * Decleration: Overriden the toString method.
	 */
	@Override
	public String toString() {
		return "IntegerClass [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	/**
	 * Decleration: Driver method
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathsBook obj = new MathsBook();
		System.out.println(obj.toString());
	}



}

