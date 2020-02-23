package Day6;

/**
 * MethDriver is the driver class for Meth.
 *
 */
public class MethDriver extends Meth {

	/**
	 * Decleration: Try to Override the previous meth() method with sysout.
	 */

	public final void meth() {
		System.out.println("Overriding meth method from FinalMethod Class."); }

	/**
	 * Decleration: Driver Metrhod.
	 * @param args
	 */
	public static void main(String[] args) {
		MethDriver obj = new MethDriver();
		obj.meth();
	}
}