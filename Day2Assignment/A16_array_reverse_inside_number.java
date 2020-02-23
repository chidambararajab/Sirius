package Day2Assignment;

//Done.

public class A16_array_reverse_inside_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {123,123,123};
		int numb = 0;
		
		for (int i = 0; i < a.length; i++) {

			int reverse = 0;
			numb = a[i];
			int reminder;
			
			while(numb > 0) {
				reminder = numb%10;
				reverse = (reverse * 10) + reminder;//30+2 =32*10 +1 =321
				numb = numb/10;
			}
			a[i] = reverse;
		}
		System.out.print("{ ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] +", ");
		}
		System.out.print("}");
	}

}
