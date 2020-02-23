package Day6;

/**
 * Inherited class for the Stack Class.
 */
public class Stack {
	protected int arr[] = new int[100];
	protected int top;
	
	/**
	 * Stack Constructor with initializing top variable as -1.
	 */
	public Stack() {
		top =-1;
	}
	
	/**
	 * Push the integer to the array.
	 * @param a
	 */
	protected void push(int a) { 
		arr[++top] = a; 
	} 
	
	/**
	 * Pop the integer from the array.
	 * @return
	 */
	protected int pop() {
		return arr[top--];
	}
	protected void display() {
		for(int i=top;i>=0;i--)
			System.out.print(arr[i]+" ");
	}
}

