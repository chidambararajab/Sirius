package Day6;

/**
 * Description: Box that calculates the volume given the dimensions.
 */
public class Box {

	private Double length = new Double(0);
	private Double width = new Double(0);
	private Double height = new Double(0);

	/**
	 * Description: parameterized constructors to initialize the values of the variables.
	 * @param length
	 * @param width
	 * @param height
	 */
	public Box(double length, double width,double height){
		this.length = length;
		this.width = width;
		this.height = height;
		System.out.println("program come inside the parametrized constructors");
	}

	/**
	 * Description: default constructor.
	 */
	public Box(){

	}

	/**
	 * Description: Method to calculate the volume.
	 */
	public void calculateVolume() {
		System.out.println("Volume of box = " +(length*width*height));
	}

	/**
	 * Description: Main Method.
	 */
	public static void main(String[] args) {
		Box box = new Box(1.1,1.1,1.1);
		box.calculateVolume();
	}
}

