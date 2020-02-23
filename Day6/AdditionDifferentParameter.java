package Day6;

/**
 * Description: Implement a class that contains add methods for integer and double.
 *
 */
public class AdditionDifferentParameter {


	public AdditionDifferentParameter() {
		// TODO Auto-generated constructor stub

	}

	/**
	 * Description: Add method for integer.
	 * @param a
	 * @param b
	 * @return
	 */
	protected  int add(Integer a, Integer b){


		return a+b;
	}

	/**
	 * Description: Add method for double.
	 * @param aa
	 * @param bb
	 * @return
	 */
	protected  double add(Double aa, Double bb){

		return aa+bb;
	}

	/**
	 * Decleration: Driver method.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdditionDifferentParameter obj = new AdditionDifferentParameter();

		System.out.println(obj.add(1,2));
		System.out.println(obj.add(1.1,2.2));


	}

}
