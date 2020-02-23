package Day4;
	/**
	 *Description: Create a Circle class, methods, constructors.
	 */
public class Circle {

	private double radius = 1.0;
	private String color = "red";

	/**
	 * Constructor
	 */
	Circle(){
		System.out.println("Default constructor");
	}
	
	/**
	 * Parametarised Constructor 
	 * @param radius
	 */
	Circle(double radius){
		System.out.println("Parametarised Constructor with double");
		this.radius = radius;
		this.color = "Yellow";
	}
	
	/**
	 * Parametarised Constructor 
	 * @param radius
	 * @param color
	 */
	Circle(double radius, String color){
		System.out.println("Parametarised Constructor with Double and String");
	}
	
	/**
	 * Description: 
	 * @param radius
	 */
	public void getArea(double radius) {
		System.out.println("Area is = " + 3.14*(2*radius));
	}
	
	/**
	 * Description: ger radius
	 * @return radius
	 */
	public double getRadius() {
		return radius;
	}
	
	/**
	 * Description: set radius
	 * @param radius
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/**
	 * Description: get color
	 * @return color
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * Description: setcolor
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 * Description: To String Method to Written the Variables in the Object.
	 */
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
	
	/**
	 * Description: Driver(main) Method.
	 * @param args
	 */
	public static void main(String[] args) {
		Circle obj = new Circle(20.26);
		System.out.println(obj.toString());
		
	}
	
}
