package Day6;

	/**
	 * Decleration: Driver Class
	 *
	 */
	public class Car extends AirPlane {
		
		/**
		 * Decleration: Constructor with sysout.
		 */
		public Car() {
			System.out.println("Second class Constructor");
		}
		
		/**
		 * Decleration: Driver Method.
		 * @param args
		 */
		public static void main(String[] args) {
			Car obj = new Car();
		}
	}
