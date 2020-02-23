package Day8;

import java.util.ArrayList;
import java.util.Iterator;

public class ALExample {

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

		System.out.println(list.get(0));
		list.remove(0);
		System.out.println(list);
		list.size();
		System.out.println(list.contains(2));

		for (Integer val : list) {
			System.out.print(val + ", ");
		}

		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ", ");
		}

		Iterator i = list.iterator();

		System.out.println();

		while (i.hasNext()) {
			System.out.print(i.next() + ", ");
		}
	}
}
