package Day6;



/**
 * Description: Implement a SumDifferentParameter class that contains sum() methods for integer and long.
 *
 */
public class SumDifferentParameter {


	public SumDifferentParameter() {
		// TODO Auto-generated constructor stub

	}

	/**
	 * Description: Add method for integer.
	 * @param a
	 * @param b
	 * @return
	 */
	public void sum(Integer a, int i){
		System.out.println((int) (a + i));
	}

	/**
	 * Description: Add method for long.
	 * @param aa
	 * @param bb
	 * @return
	 */
	public void sum(Long aa, Integer b){
		System.out.println(aa+b);
	}

	/**
	 * Driver method.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumDifferentParameter obj = new SumDifferentParameter();
		obj.sum(12, 3443434);
		obj.sum(78858484, 20);

	}
}

