package Day8;

import java.util.*;

/**
 * RuntimeException --> ConcurrentModificationException.
 */
public class ExceptionPresentation9 {

	public static void main(String[] args) {
		/**
		 * List Of Arrays.
		 */
		ArrayList<Integer> list = new ArrayList<>();

		/**
		 * Add Arrays in the sequential order.
		 */
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		
		/**
		 * it throw exception wihile modify the structor of the array list.
		 */
//		for (Integer val : list) {
//			if (val.intValue() == 1) {
//				list.remove(val);
//			}
//		}
//
//		/**
//		 * Iterator is an interface available in Collection framework in java. It is
//		 * used to traverse a collection object elements one by one.
//		 */
//		Iterator<Integer> it = list.iterator();
//
//		/**
//		 * hasNext()-:-Returns the next element in the iteration(boolean val). next()
//		 * -:- returns true if iterator has same element.
//		 */
//		try {
//			while (it.hasNext()) {
//				Integer value = it.next();
//				System.out.println("List Value:" + value);
//				if (value.equals(3))
//					list.remove(value);
//			}
//		} catch (ConcurrentModificationException c) {
//			System.out.println("ConcurrentModificationException_Handled");
//		}
	}
}
