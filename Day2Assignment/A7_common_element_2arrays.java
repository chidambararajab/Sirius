package Day2Assignment;

// Done.

public class A7_common_element_2arrays {

	public static void main(String[] args) {
		int[] numb1 = {1,2,3,3,3,44,2,1,1};
		int[] numb2 = {1,7,8,9,7,8,3};
		
		for (int i = 0; i < numb1.length; i++) {
			for (int j = 0; j < numb2.length; j++) {
				if (numb1[i] == numb2[j]) {
					System.out.println("This numbers are common for both Arrays: " +numb1[i]);
					break;
				}
			}
		}

	}

}
