package Day6;

/**
 * Create Human class which should Extends Boy And Girl Class.
 * @author chidambararaja.boomi
 *
 */
public class Human extends Boy, Girl{

	/**
	 * Fun method with sysout.
	 */

	public void fun(){ 
		System.out.println("fun() method in Human class");
	}

	/**
	 * Driver(main) method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ABC3 obj = new ABC3(); obj.fun(); 
	}
}
