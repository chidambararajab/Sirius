package Day6;

/**
 * Decleration: Implement a program making use of at least 10 built-in String Class methods.
 *
 */
public class BuiltInExamples {
	
	/**
	 * Decleration: Driver method with few inbult wrapper class methods.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input =  new String("SiriusSirius");
		
		System.out.println(input.charAt(0));
		System.out.println(input.isEmpty());//boolean value/.
		System.out.println(input.toUpperCase());
		System.out.println(input.toLowerCase());
		System.out.println(input.concat(" Computers"));//it add the anouther string to the existing input string.
		System.out.println(input.endsWith("s"));//make sure it end with given letter.
		System.out.println(input.compareTo("sirius"));//compare one word to another.
		System.out.println(input.hashCode());//returns the integer hash code value
		System.out.println(input.codePointAt(4));//Returns the character unique code.
		System.out.println(input.codePointBefore(4));//Returns the character unique code, before the specified index.
		System.out.println(input.compareToIgnoreCase("SIRS"));//returns 0 if they are equal. out -ve then string is less than the other string. if +ve output string is greater than the other string.
		System.out.println(input.indexOf("i"));//can not taking the next i...:(
		System.out.println(input.indexOf('i', 2));//check for i after the index(2) mentioned.:)
		System.out.println(input.indexOf("Sir", 4));//check for string after the index(4) mentioned.:)
		
	}
}
