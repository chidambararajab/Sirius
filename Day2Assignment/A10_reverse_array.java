package Day2Assignment;

/*Description: 
 * 
 * */

public class A10_reverse_array {
	public static void main(String[] args) {
		
		int[] input = {1,2,3,4,5};
		int[] output = new int[input.length];
		
		for (int i = 0; i < output.length; i++) {
			for (int j = input.length-1; j >= 0; j++) {
				int temp = input[i];
				input[i] = input[j];
				input[j] = temp;
			}
		}
		System.out.println(input);
		
	}
}


