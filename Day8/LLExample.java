package Day8;

import java.util.Iterator;
import java.util.LinkedList;

public class LLExample {
	public static void main(String[] args) {
		
		LinkedList<Integer> li = new LinkedList<Integer>();
		
		li.add(1);
		li.add(2);
		li.add(7);
		
		Iterator i = li.iterator();
		
		for (Integer val : li) {
			System.out.print(val+", ");
		}	
}
}
