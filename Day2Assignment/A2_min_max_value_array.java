package Day2Assignment;

public class A2_min_max_value_array {
	public static void main(String[] args) {
		int[] numb = {1,2,3,4,5,14578,7,8,9,0};
		int length = numb.length-1;
		
		for (int i = 0; i < numb.length; i++) {
			for (int j = i+1; j < numb.length; j++) {
				
				if (numb[i] > numb[j]) {
					int temp = numb[i];
					numb[i] = numb[j];
					numb[j] = temp;
				}
				
			}
		}
		System.out.println("Minimum number in Array: " +numb[0]);
		System.out.println("Maximum number in Array: " +numb[length]);
//		for (int i = 0; i < numb.length; i++) {
//			System.out.print(numb[i] +", ");
//		}
	}
}
