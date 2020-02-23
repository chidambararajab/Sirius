package Day6;


/**
 * Create a Stack_main class as an main class for the stack class.
 * @author chidambararaja.boomi
 *
 */
public class StackDriver {
	
	/***
	 * Driver Method.
	 * @param args
	 */
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		System.out.println(s.pop());
		System.out.println(s.pop());
		s.display();
	}
}
