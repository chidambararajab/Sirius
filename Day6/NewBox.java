package Day6;
/**
 * Create a NewBox Class. with three constructor.
 *
 */
public class NewBox {
	Double length = new Double(0);
	Double width = new Double(0);
	Double height = new Double(0);

	/**
	 * Description: default constructor.
	 */
	public NewBox(){

	}
	
	/**
	 * Description: parameterized constructors to initialize the values of the variables.
	 * @param length
	 * @param width
	 * @param height
	 */
	public NewBox(double length, double width,double height){
		this.length = length;
		this.width = width;
		this.height = height;
		System.out.println("program come inside the parametrized constructors");
	}
	
	/**
	 * Decleration: Constructor store val to the length, width and hight.
	 * @param val
	 */
	public NewBox(int val){
		this.length = (double) val;
		this.width = (double) val;
		this.height = (double) val;
	}
	
	/**
	 * Decleration: Driver Method.
	 * @param args
	 */
	public static void main(String[] args) {
		NewBox obj1 = new NewBox();
		System.out.println(obj1.length +" "+ obj1.width +" " + obj1.height);
		NewBox obj2 = new NewBox(1.1,2.2,3.3);
		System.out.println(obj2.length +" "+ obj2.width +" "+ obj2.height);
		NewBox obj3 = new NewBox(3);
		System.out.println(obj3.length +" "+ obj3.width +" "+ obj3.height);
	}
}

