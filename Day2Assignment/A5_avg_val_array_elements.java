package Day2Assignment;

public class A5_avg_val_array_elements {
	public static void main(String[] args) {
		
		int[] numb = {1,2,3,4,5,4,3,5,6,7};
		int average = 0;
		
		for (int i = 0; i < numb.length; i++) {
			average = average + numb[i];
		}
		
		average = average/numb.length;
		System.out.println("Average value of an Array: " +average);
		
	}
}
