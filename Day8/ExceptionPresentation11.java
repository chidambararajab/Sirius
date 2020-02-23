package Day8;

import java.util.ArrayList;

/**
 * IllegalArgumentException --->  IllegalThreadStateException

 */
public class ExceptionPresentation11 extends Thread{
	
	public void rum() {
		System.out.println("Thread is running");
	}
	
	public static void main(String[] args) {
		ExceptionPresentation11 obj = new ExceptionPresentation11();
		obj.start();
		obj.start();
	}
}
