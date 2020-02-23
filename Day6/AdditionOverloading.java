package Day6;

	/**
	 * Description: Implement a class that contains add methods with overloading.
	 *
	 */
public class AdditionOverloading {

		
		/**
		 * Decleration: Intialize a and b.
		 */
		public AdditionOverloading() {

		}
		
		/**
		 * Decleration: Add a & b and store it to c.
		 * @param a
		 * @param b
		 * @return
		 */
		protected  int add(Integer a, Integer b){
			
			
			return a + b;
		}
		
		/**
		 * Decleration: Add a, b, c and store it to c.
		 * @param a
		 * @param b
		 * @param c
		 * @return
		 */
		protected  int add(Integer a, Integer b, Integer c){
			
			
			return a + b + c;
		}
		
		/**
		 * Decleration: Driver method.
		 * @param args
		 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			AdditionOverloading obj = new AdditionOverloading();
			
			System.out.println(obj.add(5,5));
			System.out.println(obj.add(5,5,5));
			

		}

	}
