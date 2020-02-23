package Day8;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.NoSuchElementException;
import java.util.Set;

/**
 * RunTimeException --> NoSuchElementException.
 * 
 * @author chidambararaja.boomi
 *
 */
public class ExceptionPresentation8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * A Set is a Collection that cannot contain duplicate elements. 
		 * It models the mathematical set abstraction. The Set interface 
		 * contains only methods inherited from Collection and adds the 
		 * restriction that duplicate elements are prohibited.
		 */
		Set exampleleSet = new HashSet();
		
		/**
		 * Hashtable was part of the original java. util and is a concrete 
		 * implementation of a Dictionary. ... Like HashMap, Hashtable stores 
		 * key/value pairs in a hash table.
		 */
		Hashtable exampleTable = new Hashtable();
		
		try {
			exampleleSet.iterator().next();
		} catch (NoSuchElementException n) {
			System.out.println("NoSuchElementException Handled");
			
			try {
			exampleTable.elements().nextElement();
			}catch(NoSuchElementException nn) {
				System.out.println("Second NoSuchElementException Handled");
			}
			
		}
	}
}
