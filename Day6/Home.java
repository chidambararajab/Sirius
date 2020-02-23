package Day6;

/**
 * Decleration: Create a Driver Class as Home and extend BuyHome.
 *
 */
public class Home extends BuyHome {

	/**
	 * Decleration: Constructor with sysout.
	 */
	Home(){
		System.out.println("Second class Constructor");
	}

	/**
	 * Decleration: Driver method
	 * @param args
	 */
	public static void main(String[] args) {
		Home obj = new Home();
	}
}
